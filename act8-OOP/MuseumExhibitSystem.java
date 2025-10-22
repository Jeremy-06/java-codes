import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

// INTERFACE - Defines a contract for interactive exhibits
interface Interactive {
    void startInteraction(String visitorName);
    void endInteraction();
    String getInteractionLog();
}

// Another interface for exhibits that can be preserved
interface Preservable {
    void setPreservationStatus(String status);
    String getPreservationDetails();
    boolean needsMaintenance();
}

// ABSTRACTION - Abstract superclass - cannot be instantiated directly
abstract class MuseumExhibit {
    // ENCAPSULATION - private fields with controlled access
    private String exhibitID;
    private String name;
    private int yearAcquired;
    protected double baseValue; // protected allows subclass access
    private boolean onDisplay;

    // Constructor
    public MuseumExhibit(String exhibitID, String name, int yearAcquired, double baseValue) {
        this.exhibitID = exhibitID;
        this.name = name;
        this.yearAcquired = yearAcquired;
        this.baseValue = baseValue;
        this.onDisplay = true;
    }

    // ENCAPSULATION - public getters/setters for controlled access
    public String getExhibitID() { return exhibitID; }
    public String getName() { return name; }
    public int getYearAcquired() { return yearAcquired; }
    public boolean isOnDisplay() { return onDisplay; }
    public void setOnDisplay(boolean status) { this.onDisplay = status; }

    // Abstract method - must be implemented by subclasses
    public abstract String getExhibitType();

    // Abstract method for calculating insurance value
    public abstract double calculateInsuranceValue();

    // Concrete method that can be overridden
    public String getDisplayInfo() {
        return String.format("[%s] %s (Acquired: %d) - Value: $%.2f",
            exhibitID, name, yearAcquired, baseValue);
    }

    // Method to be overridden demonstrating polymorphism
    public void performDailyCheck() {
        System.out.println("Performing standard exhibit check for: " + getName());
    }
}

// INHERITANCE & CLASS HIERARCHY
// Superclass for all artifact exhibits
abstract class ArtifactExhibit extends MuseumExhibit implements Preservable {
    private String origin;
    private String preservationStatus;
    private int daysSinceLastMaintenance;

    public ArtifactExhibit(String exhibitID, String name, int yearAcquired,
                          double baseValue, String origin) {
        super(exhibitID, name, yearAcquired, baseValue);
        this.origin = origin;
        this.preservationStatus = "Excellent";
        this.daysSinceLastMaintenance = 0;
    }

    public String getOrigin() { return origin; }

    // added getter so reports can align values
    public String getPreservationStatus() { return preservationStatus; }
    public int getDaysSinceLastMaintenance() { return daysSinceLastMaintenance; }

    // Implementing Preservable interface
    @Override
    public void setPreservationStatus(String status) {
        this.preservationStatus = status;
    }

    @Override
    public String getPreservationDetails() {
        return String.format("Origin: %s | Status: %s | Days since maintenance: %d",
            origin, preservationStatus, daysSinceLastMaintenance);
    }

    @Override
    public boolean needsMaintenance() {
        return daysSinceLastMaintenance > 30;
    }

    public void incrementMaintenanceDays() {
        daysSinceLastMaintenance++;
    }
}

// SUBCLASS 1: Ancient Scroll
class AncientScroll extends ArtifactExhibit {
    private String language;
    private int estimatedAge;
    private boolean translated;

    public AncientScroll(String exhibitID, String name, int yearAcquired,
                        double baseValue, String origin, String language, int estimatedAge) {
        super(exhibitID, name, yearAcquired, baseValue, origin);
        this.language = language;
        this.estimatedAge = estimatedAge;
        this.translated = false;
    }

    // OVERWRITING/OVERRIDING - providing specific implementation
    @Override
    public String getExhibitType() {
        return "Ancient Scroll";
    }

    @Override
    public double calculateInsuranceValue() {
        // Age increases value significantly
        return baseValue * (1 + (estimatedAge / 100.0));
    }

    @Override
    public String getDisplayInfo() {
        return super.getDisplayInfo() +
               String.format(" | Language: %s, Age: ~%d years", language, estimatedAge);
    }

    @Override
    public void performDailyCheck() {
        System.out.println("Checking humidity and light exposure for scroll: " + getName());
        System.out.println("   Temperature-controlled case status: OPTIMAL");
    }
}

// SUBCLASS 2: Fossil
class FossilExhibit extends ArtifactExhibit {
    private String species;
    private int millionYearsOld;
    private String geologicPeriod;

    public FossilExhibit(String exhibitID, String name, int yearAcquired,
                        double baseValue, String origin, String species,
                        int millionYearsOld, String geologicPeriod) {
        super(exhibitID, name, yearAcquired, baseValue, origin);
        this.species = species;
        this.millionYearsOld = millionYearsOld;
        this.geologicPeriod = geologicPeriod;
    }

    @Override
    public String getExhibitType() {
        return "Fossil";
    }

    @Override
    public double calculateInsuranceValue() {
        // Extremely old fossils are exponentially more valuable
        return baseValue * Math.pow(1.1, millionYearsOld / 10.0);
    }

    @Override
    public String getDisplayInfo() {
        return super.getDisplayInfo() +
               String.format(" | Species: %s, Period: %s (%d MYA)",
                   species, geologicPeriod, millionYearsOld);
    }

    @Override
    public void performDailyCheck() {
        System.out.println("Inspecting fossil integrity: " + getName());
        System.out.println("   Checking for calcification and structural stability");
    }
}

// SUBCLASS 3: Interactive Digital Exhibit
class DigitalExhibit extends MuseumExhibit implements Interactive {
    private String softwareVersion;
    private List<String> interactionLog;
    private boolean currentlyInUse;
    private int totalInteractions;

    public DigitalExhibit(String exhibitID, String name, int yearAcquired,
                         double baseValue, String softwareVersion) {
        super(exhibitID, name, yearAcquired, baseValue);
        this.softwareVersion = softwareVersion;
        this.interactionLog = new ArrayList<>();
        this.currentlyInUse = false;
        this.totalInteractions = 0;
    }

    @Override
    public String getExhibitType() {
        return "Digital Interactive";
    }

    @Override
    public double calculateInsuranceValue() {
        // Digital exhibits depreciate over time
        int age = 2025 - getYearAcquired();
        return baseValue * Math.pow(0.85, age);
    }

    @Override
    public void performDailyCheck() {
        System.out.println("Running diagnostics on digital exhibit: " + getName());
        System.out.println("   Software version: " + softwareVersion);
        System.out.println("   Total interactions today: " + totalInteractions);
    }

    // getters added for aligned reports
    public String getSoftwareVersion() { return softwareVersion; }
    public boolean isCurrentlyInUse() { return currentlyInUse; }
    public int getTotalInteractions() { return totalInteractions; }

    // Implementing Interactive interface
    @Override
    public void startInteraction(String visitorName) {
        currentlyInUse = true;
        totalInteractions++;
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        interactionLog.add(timestamp + " - " + visitorName + " started interaction");
        System.out.println(visitorName + " is now using: " + getName());
    }

    @Override
    public void endInteraction() {
        currentlyInUse = false;
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        interactionLog.add(timestamp + " - Interaction ended");
        System.out.println("Interaction completed");
    }

    @Override
    public String getInteractionLog() {
        return String.join("\n", interactionLog);
    }
}

// SUBCLASS 4: Holographic Art
class HolographicArt extends MuseumExhibit implements Interactive {
    private String artistName;
    private String artMovement;
    private int projectorHours;
    private boolean isProjecting;

    public HolographicArt(String exhibitID, String name, int yearAcquired,
                         double baseValue, String artistName, String artMovement) {
        super(exhibitID, name, yearAcquired, baseValue);
        this.artistName = artistName;
        this.artMovement = artMovement;
        this.projectorHours = 0;
        this.isProjecting = false;
    }

    @Override
    public String getExhibitType() {
        return "Holographic Art";
    }

    @Override
    public double calculateInsuranceValue() {
        // Contemporary art appreciates with artist reputation
        return baseValue * 1.5;
    }

    @Override
    public String getDisplayInfo() {
        return super.getDisplayInfo() +
               String.format(" | Artist: %s, Movement: %s", artistName, artMovement);
    }

    // getters added for aligned reports
    public int getProjectorHours() { return projectorHours; }
    public boolean isProjecting() { return isProjecting; }

    @Override
    public void performDailyCheck() {
        System.out.println("Calibrating holographic projectors for: " + getName());
        System.out.println("   Projector hours: " + projectorHours);
        if (projectorHours > 5000) {
            System.out.println("   WARNING: Projector maintenance recommended!");
        }
    }

    @Override
    public void startInteraction(String visitorName) {
        isProjecting = true;
        System.out.println("Activating holographic display for " + visitorName);
        System.out.println("   Experience: " + getName() + " by " + artistName);
    }

    @Override
    public void endInteraction() {
        isProjecting = false;
        projectorHours++;
        System.out.println("Holographic display deactivated");
    }

    @Override
    public String getInteractionLog() {
        return "Projector active hours: " + projectorHours;
    }
}

// MAIN CLASS DEMONSTRATING ALL CONCEPTS WITH A MENU
public class MuseumExhibitSystem {
    // helper to center text inside a fixed width
    private static String center(String s, int width) {
        if (s == null) s = "";
        if (s.length() >= width) return s;
        int left = (width - s.length()) / 2;
        int right = width - s.length() - left;
        return " ".repeat(left) + s + " ".repeat(right);
    }

    // helper to wrap text so it does not overflow the design width
    private static List<String> wrapText(String text, int maxWidth) {
        List<String> lines = new ArrayList<>();
        if (text == null || text.isEmpty()) {
            lines.add("");
            return lines;
        }
        String[] words = text.split("\\s+");
        StringBuilder current = new StringBuilder();
        for (String w : words) {
            if (current.length() + w.length() + 1 <= maxWidth) {
                if (current.length() > 0) current.append(' ');
                current.append(w);
            } else {
                if (current.length() > 0) {
                    lines.add(current.toString());
                    current = new StringBuilder();
                }
                if (w.length() <= maxWidth) {
                    current.append(w);
                } else {
                    // word longer than maxWidth: hard split
                    int start = 0;
                    while (start < w.length()) {
                        int end = Math.min(start + maxWidth, w.length());
                        lines.add(w.substring(start, end));
                        start = end;
                    }
                    current = new StringBuilder();
                }
            }
        }
        if (current.length() > 0) lines.add(current.toString());
        return lines;
    }

    private static void printHeader(String title, int width) {
        System.out.println("=".repeat(width));
        System.out.println(center(title, width));
        System.out.println("=".repeat(width));
    }

    private static void printSectionTitle(String title, int width) {
        System.out.println("-".repeat(width));
        System.out.println(center(title, width));
        System.out.println("-".repeat(width));
    }

    // ---------- Generic padding helpers ----------
    private static String padRight(String s, int width) {
        if (s == null) s = "";
        if (s.length() > width) return s.substring(0, width);
        return s + " ".repeat(width - s.length());
    }

    private static String padLeft(String s, int width) {
        if (s == null) s = "";
        if (s.length() > width) return s.substring(0, width);
        return " ".repeat(width - s.length()) + s;
    }

    private static String centerInCol(String s, int width) {
        if (s == null) s = "";
        if (s.length() >= width) return s.substring(0, width);
        int left = (width - s.length()) / 2;
        int right = width - s.length() - left;
        return " ".repeat(left) + s + " ".repeat(right);
    }

    // --------- Exhibit Catalog columns (previously implemented) ----------
    private static final int C_CAT_NO = 3;
    private static final int C_CAT_ID = 8;
    private static final int C_CAT_NAME = 20;
    private static final int C_CAT_TYPE = 16;
    private static final int C_CAT_YEAR = 4;
    private static final int C_CAT_VALUE = 12;

    private static void printExhibitCatalog(List<MuseumExhibit> exhibits, int designWidth) {
        System.out.println("-".repeat(designWidth));
        String header = "|" +
            centerInCol("No", C_CAT_NO) + "|" +
            centerInCol("ID", C_CAT_ID) + "|" +
            centerInCol("Name", C_CAT_NAME) + "|" +
            centerInCol("Type", C_CAT_TYPE) + "|" +
            centerInCol("Year", C_CAT_YEAR) + "|" +
            centerInCol("Insurance", C_CAT_VALUE) + "|";
        System.out.println(header);
        System.out.println("-".repeat(designWidth));

        for (int i = 0; i < exhibits.size(); i++) {
            MuseumExhibit e = exhibits.get(i);
            String no = padLeft(String.valueOf(i + 1), C_CAT_NO);
            String id = padRight(e.getExhibitID(), C_CAT_ID);
            String name = padRight(e.getName(), C_CAT_NAME);
            String type = padRight(e.getExhibitType(), C_CAT_TYPE);
            String year = padLeft(String.valueOf(e.getYearAcquired()), C_CAT_YEAR);
            String insurance = String.format("$%.2f", e.calculateInsuranceValue());
            insurance = padLeft(insurance, C_CAT_VALUE);

            String row = "|" + no + "|" + id + "|" + name + "|" + type + "|" + year + "|" + insurance + "|";
            System.out.println(row);
        }
        System.out.println("-".repeat(designWidth));
    }

    // --------- Maintenance Table (aligned) ----------
    // numCols = 4 -> pipes = 5 -> columns sum = designWidth - 5
    private static final int M_COL_NO = 3;
    private static final int M_COL_NAME = 28;
    private static final int M_COL_TYPE = 18;
    private static final int M_COL_STATUS = 16;

    private static void printMaintenanceTable(List<MuseumExhibit> exhibits, int designWidth) {
        System.out.println("-".repeat(designWidth));
        String header = "|" +
            centerInCol("No", M_COL_NO) + "|" +
            centerInCol("Name", M_COL_NAME) + "|" +
            centerInCol("Type", M_COL_TYPE) + "|" +
            centerInCol("Status", M_COL_STATUS) + "|";
        System.out.println(header);
        System.out.println("-".repeat(designWidth));

        for (int i = 0; i < exhibits.size(); i++) {
            MuseumExhibit e = exhibits.get(i);
            String no = padLeft(String.valueOf(i + 1), M_COL_NO);
            String name = padRight(e.getName(), M_COL_NAME);
            String type = padRight(e.getExhibitType(), M_COL_TYPE);

            // concise status derived from available data
            String status;
            if (e instanceof ArtifactExhibit) {
                ArtifactExhibit a = (ArtifactExhibit) e;
                status = a.needsMaintenance() ? "Needs maintenance" : "OK";
            } else if (e instanceof DigitalExhibit) {
                DigitalExhibit d = (DigitalExhibit) e;
                status = "v" + d.getSoftwareVersion();
                if (status.length() > M_COL_STATUS) status = status.substring(0, M_COL_STATUS);
            } else if (e instanceof HolographicArt) {
                HolographicArt h = (HolographicArt) e;
                status = "Proj hrs: " + h.getProjectorHours();
            } else {
                status = "Checked";
            }
            status = padRight(status, M_COL_STATUS);

            String row = "|" + no + "|" + name + "|" + type + "|" + status + "|";
            System.out.println(row);
        }

        System.out.println("-".repeat(designWidth));
    }

    // --------- Interactive Exhibits Table ----------
    // numCols = 5 -> pipes = 6 -> columns sum = designWidth - 6
    private static final int I_COL_NO = 3;
    private static final int I_COL_NAME = 30;
    private static final int I_COL_TYPE = 20;
    private static final int I_COL_INUSE = 5;
    private static final int I_COL_TOTAL = 6;

    private static void printInteractiveTable(List<MuseumExhibit> exhibits, int designWidth) {
        System.out.println("-".repeat(designWidth));
        String header = "|" +
            centerInCol("No", I_COL_NO) + "|" +
            centerInCol("Name", I_COL_NAME) + "|" +
            centerInCol("Type", I_COL_TYPE) + "|" +
            centerInCol("Use", I_COL_INUSE) + "|" +
            centerInCol("Total", I_COL_TOTAL) + "|";
        System.out.println(header);
        System.out.println("-".repeat(designWidth));

        int idx = 0;
        for (int i = 0; i < exhibits.size(); i++) {
            MuseumExhibit e = exhibits.get(i);
            if (!(e instanceof Interactive)) continue;
            idx++;
            String no = padLeft(String.valueOf(idx), I_COL_NO);
            String name = padRight(e.getName(), I_COL_NAME);
            String type = padRight(e.getExhibitType(), I_COL_TYPE);
            String inUse = "N";
            String total = "0";
            if (e instanceof DigitalExhibit) {
                DigitalExhibit d = (DigitalExhibit) e;
                inUse = d.isCurrentlyInUse() ? "Y" : "N";
                total = String.valueOf(d.getTotalInteractions());
            } else if (e instanceof HolographicArt) {
                HolographicArt h = (HolographicArt) e;
                inUse = h.isProjecting() ? "Y" : "N";
                total = String.valueOf(h.getProjectorHours());
            }
            inUse = centerInCol(inUse, I_COL_INUSE);
            total = padLeft(total, I_COL_TOTAL);

            String row = "|" + no + "|" + name + "|" + type + "|" + inUse + "|" + total + "|";
            System.out.println(row);
        }

        System.out.println("-".repeat(designWidth));
    }

    // --------- Preservation Table ----------
    // numCols = 5 -> pipes = 6 -> columns sum = designWidth - 6
    private static final int P_COL_NO = 3;
    private static final int P_COL_NAME = 20;
    private static final int P_COL_ORIGIN = 25;
    private static final int P_COL_STATUS = 10;
    private static final int P_COL_NEEDS = 6;

    private static void printPreservationTable(List<MuseumExhibit> exhibits, int designWidth) {
        System.out.println("-".repeat(designWidth));
        String header = "|" +
            centerInCol("No", P_COL_NO) + "|" +
            centerInCol("Name", P_COL_NAME) + "|" +
            centerInCol("Origin", P_COL_ORIGIN) + "|" +
            centerInCol("Status", P_COL_STATUS) + "|" +
            centerInCol("Needs", P_COL_NEEDS) + "|";
        System.out.println(header);
        System.out.println("-".repeat(designWidth));

        int idx = 0;
        for (int i = 0; i < exhibits.size(); i++) {
            MuseumExhibit e = exhibits.get(i);
            if (!(e instanceof Preservable)) continue;
            idx++;
            String no = padLeft(String.valueOf(idx), P_COL_NO);
            String name = padRight(e.getName(), P_COL_NAME);
            Preservable p = (Preservable) e;
            String origin = "";
            String status = "";
            String needs = p.needsMaintenance() ? "YES" : "NO";

            if (e instanceof ArtifactExhibit) {
                ArtifactExhibit a = (ArtifactExhibit) e;
                origin = padRight(a.getOrigin(), P_COL_ORIGIN);
                status = padRight(a.getPreservationStatus(), P_COL_STATUS);
            } else {
                origin = padRight("N/A", P_COL_ORIGIN);
                status = padRight("Unknown", P_COL_STATUS);
            }

            String row = "|" + no + "|" + name + "|" + origin + "|" + status + "|" + centerInCol(needs, P_COL_NEEDS) + "|";
            System.out.println(row);
        }

        System.out.println("-".repeat(designWidth));
    }

    // --------- Display Status Table (for toggling) ----------
    // numCols = 3 -> pipes = 4 -> columns sum = designWidth - 4
    private static final int D_COL_NO = 3;
    private static final int D_COL_NAME = 55;
    private static final int D_COL_STATUS = 8;

    private static void printDisplayStatusTable(List<MuseumExhibit> exhibits, int designWidth) {
        System.out.println("-".repeat(designWidth));
        String header = "|" +
            centerInCol("No", D_COL_NO) + "|" +
            centerInCol("Name", D_COL_NAME) + "|" +
            centerInCol("OnDisplay", D_COL_STATUS) + "|";
        System.out.println(header);
        System.out.println("-".repeat(designWidth));

        for (int i = 0; i < exhibits.size(); i++) {
            MuseumExhibit e = exhibits.get(i);
            String no = padLeft(String.valueOf(i + 1), D_COL_NO);
            String name = padRight(e.getName(), D_COL_NAME);
            String status = e.isOnDisplay() ? "YES" : "NO";
            status = centerInCol(status, D_COL_STATUS);
            String row = "|" + no + "|" + name + "|" + status + "|";
            System.out.println(row);
        }

        System.out.println("-".repeat(designWidth));
    }

    // --------- Insurance Table (aligned) ----------
    // reuse catalog widths for insurance presentation
    private static void printInsuranceTable(List<MuseumExhibit> exhibits, int designWidth) {
        System.out.println("-".repeat(designWidth));
        String header = "|" +
            centerInCol("No", C_CAT_NO) + "|" +
            centerInCol("Name", C_CAT_NAME) + "|" +
            centerInCol("Type", C_CAT_TYPE) + "|" +
            centerInCol("Insurance", C_CAT_VALUE) + "|";
        System.out.println(header);
        System.out.println("-".repeat(designWidth));

        for (int i = 0; i < exhibits.size(); i++) {
            MuseumExhibit e = exhibits.get(i);
            String no = padLeft(String.valueOf(i + 1), C_CAT_NO);
            String name = padRight(e.getName(), C_CAT_NAME);
            String type = padRight(e.getExhibitType(), C_CAT_TYPE);
            String insurance = String.format("$%.2f", e.calculateInsuranceValue());
            insurance = padLeft(insurance, C_CAT_VALUE);

            String row = "|" + no + "|" + name + "|" + type + "|" + insurance + "|";
            System.out.println(row);
        }
        System.out.println("-".repeat(designWidth));
    }

    // --------- System Summary Aligned ----------
    private static void printSystemSummaryAligned(List<MuseumExhibit> exhibits, int designWidth) {
        System.out.println("-".repeat(designWidth));
        String title = centerInCol("SYSTEM SUMMARY", designWidth - 2); // leave side borders visually
        System.out.println("|" + title + "|");
        System.out.println("-".repeat(designWidth));

        int labelWidth = 48;
        int valueWidth = designWidth - 2 - labelWidth - 2; // 2 for side spaces
        if (valueWidth < 10) valueWidth = 10; // safety

        String total = String.format("%d", exhibits.size());
        String interactive = String.format("%d", (int) exhibits.stream().filter(e -> e instanceof Interactive).count());
        String preservable = String.format("%d", (int) exhibits.stream().filter(e -> e instanceof Preservable).count());
        String totalValue = String.format("$%.2f", exhibits.stream().mapToDouble(MuseumExhibit::calculateInsuranceValue).sum());

        printKeyValue("Total Exhibits:", total, labelWidth, valueWidth);
        printKeyValue("Interactive Exhibits:", interactive, labelWidth, valueWidth);
        printKeyValue("Preservable Exhibits:", preservable, labelWidth, valueWidth);
        printKeyValue("Total Insurance Value:", totalValue, labelWidth, valueWidth);

        System.out.println("-".repeat(designWidth));
    }

    private static void printKeyValue(String label, String value, int labelWidth, int valueWidth) {
        String l = padRight(label, labelWidth);
        String v = padLeft(value, valueWidth);
        System.out.println("| " + l + "  " + v + " |");
    }

    public static void main(String[] args) {
        final int width = 70;
        Scanner scanner = new Scanner(System.in);

        // Creating exhibits
        List<MuseumExhibit> exhibits = new ArrayList<>();

        AncientScroll scroll = new AncientScroll(
            "AS-001", "Dead Sea Scroll Fragment", 1995, 2500000.00,
            "Qumran Caves, Israel", "Ancient Hebrew", 2200
        );

        FossilExhibit fossil = new FossilExhibit(
            "FS-042", "Tyrannosaurus Rex Skull", 2010, 8500000.00,
            "Montana, USA", "Tyrannosaurus Rex", 67, "Late Cretaceous"
        );

        DigitalExhibit digital = new DigitalExhibit(
            "DG-128", "Virtual Reality Ancient Rome Experience", 2022,
            150000.00, "3.2.1"
        );

        HolographicArt holo = new HolographicArt(
            "HA-055", "Ephemeral Consciousness", 2023, 450000.00,
            "Yuki Nakamura", "Neo-Digital Expressionism"
        );

        exhibits.add(scroll);
        exhibits.add(fossil);
        exhibits.add(digital);
        exhibits.add(holo);

        boolean running = true;
        while (running) {
            printHeader("VIRTUAL MUSEUM EXHIBIT SYSTEM", width);
            System.out.println(center("[Choose an option and press enter]", width));
            System.out.println();
            // Menu options
            String[] menu = new String[] {
                "1) View Exhibit Catalog",
                "2) Perform Daily Maintenance Checks (All Exhibits)",
                "3) Visitor Interaction Session (Interactive Exhibits)",
                "4) Preservation Status Report",
                "5) Toggle display status",
                "6) View Insurance Calculations",
                "7) System Summary",
                "8) Exit"
            };
            for (String m : menu) {
                List<String> lines = wrapText(m, width - 4);
                for (String line : lines) {
                    System.out.println("  " + line);
                }
            }
            System.out.println();
            System.out.print("Enter option (1-8): ");
            String input = scanner.nextLine().trim();
            System.out.println();

            switch (input) {
                case "1":
                    printSectionTitle("EXHIBIT CATALOG", width);
                    printExhibitCatalog(exhibits, width);
                    System.out.println();
                    break;

                case "2":
                    printSectionTitle("PERFORMING DAILY MAINTENANCE CHECKS", width);
                    // aligned maintenance table
                    printMaintenanceTable(exhibits, width);
                    System.out.println();
                    break;

                case "3":
                    printSectionTitle("VISITOR INTERACTION SESSION", width);
                    // show aligned interactive table
                    printInteractiveTable(exhibits, width);

                    // ask for choice to start interaction
                    List<Integer> interactiveIndexes = new ArrayList<>();
                    for (int i = 0; i < exhibits.size(); i++) {
                        if (exhibits.get(i) instanceof Interactive) interactiveIndexes.add(i);
                    }
                    if (interactiveIndexes.isEmpty()) {
                        System.out.println("No interactive exhibits available.");
                        break;
                    }
                    System.out.print("Select exhibit number to start interaction (or press Enter to cancel): ");
                    String sel = scanner.nextLine().trim();
                    if (sel.isEmpty()) {
                        System.out.println("Interaction cancelled.");
                        break;
                    }
                    try {
                        int choice = Integer.parseInt(sel);
                        if (choice < 1 || choice > interactiveIndexes.size()) {
                            System.out.println("Invalid selection.");
                            break;
                        }
                        int exhibitIndex = interactiveIndexes.get(choice - 1);
                        Interactive chosen = (Interactive) exhibits.get(exhibitIndex);
                        System.out.print("Enter visitor name: ");
                        String visitor = scanner.nextLine().trim();
                        if (visitor.isEmpty()) visitor = "Visitor";
                        chosen.startInteraction(visitor);
                        System.out.println();
                        System.out.println("Press Enter to end interaction...");
                        scanner.nextLine();
                        chosen.endInteraction();
                        System.out.println();

                        // show updated interactive table
                        printInteractiveTable(exhibits, width);

                    } catch (NumberFormatException ex) {
                        System.out.println("Invalid input.");
                    }
                    break;

                case "4":
                    printSectionTitle("PRESERVATION STATUS REPORT", width);
                    printPreservationTable(exhibits, width);
                    System.out.println();
                    break;

                case "5":
                    printSectionTitle("TOGGLE DISPLAY STATUS", width);
                    // show current statuses aligned
                    printDisplayStatusTable(exhibits, width);
                    System.out.print("Enter exhibit number to toggle display status (or press Enter to cancel): ");
                    String toggleSel = scanner.nextLine().trim();
                    if (toggleSel.isEmpty()) {
                        System.out.println("Toggle cancelled.");
                        break;
                    }
                    try {
                        int t = Integer.parseInt(toggleSel);
                        if (t < 1 || t > exhibits.size()) {
                            System.out.println("Invalid selection.");
                            break;
                        }
                        MuseumExhibit target = exhibits.get(t - 1);
                        target.setOnDisplay(!target.isOnDisplay());
                        System.out.println();
                        System.out.println("Updated display statuses:");
                        printDisplayStatusTable(exhibits, width);
                    } catch (NumberFormatException ex) {
                        System.out.println("Invalid input.");
                    }
                    System.out.println();
                    break;

                case "6":
                    printSectionTitle("INSURANCE CALCULATIONS", width);
                    printInsuranceTable(exhibits, width);
                    System.out.println();
                    break;

                case "7":
                    printSectionTitle("SYSTEM SUMMARY", width);
                    printSystemSummaryAligned(exhibits, width);
                    System.out.println();
                    break;

                case "8":
                    running = false;
                    System.out.println("Exiting. Goodbye.");
                    break;

                default:
                    System.out.println("Invalid option. Please enter a number between 1 and 8.");
                    break;
            }

            if (running) {
                System.out.println();
                System.out.print("Press Enter to return to the main menu...");
                scanner.nextLine();
            }
            System.out.println();
        }

        scanner.close();
    }
}