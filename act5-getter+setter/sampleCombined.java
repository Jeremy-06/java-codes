import java.util.Scanner;

public class sampleCombined {

    static class Person {
        private String course;
        private String favoriteSubject;
        private String hobby;

        Person(String course, String favoriteSubject, String hobby) {
            this.course = course;
            this.favoriteSubject = favoriteSubject;
            this.hobby = hobby;
        }

        public String getCourse() { return course; }
        public String getFavoriteSubject() { return favoriteSubject; }
        public String getHobby() { return hobby; }

        public void setCourse(String course) { this.course = course; }
        public void setFavoriteSubject(String favoriteSubject) { this.favoriteSubject = favoriteSubject; }
        public void setHobby(String hobby) { this.hobby = hobby; }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Course: ");
        String course = scanner.nextLine();
        System.out.print("Favorite subject: ");
        String favoriteSubject = scanner.nextLine();
        System.out.print("Hobby: ");
        String hobby = scanner.nextLine();

        Person person = new Person(course, favoriteSubject, hobby);

        boolean exit = false;
        do {
            System.out.println();
            System.out.println("Menu:");
            System.out.println("1 - Show info");
            System.out.println("2 - Update hobby");
            System.out.println("3 - Update course & favorite subject");
            System.out.println("4 - Exit");
            System.out.print("Choose an option: ");
            String choice = scanner.nextLine().trim();

            if (choice.equals("1")) {
                System.out.println("Course: " + person.getCourse());
                System.out.println("Favorite subject: " + person.getFavoriteSubject());
                System.out.println("Hobby: " + person.getHobby());
            } else if (choice.equals("2")) {
                System.out.print("New hobby: ");
                String newHobby = scanner.nextLine();
                person.setHobby(newHobby);
                System.out.println("Hobby updated.");
            } else if (choice.equals("3")) {
                System.out.print("New course: ");
                String newCourse = scanner.nextLine();
                System.out.print("New favorite subject: ");
                String newFav = scanner.nextLine();
                person.setCourse(newCourse);
                person.setFavoriteSubject(newFav);
                System.out.println("Course and favorite subject updated.");
            } else if (choice.equals("4")) {
                exit = true;
                System.out.println("Exiting.");
            } else {
                System.out.println("Invalid option. Try again.");
            }
        } while (!exit);

        scanner.close();
    }
}