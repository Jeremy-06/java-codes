public class methods {
    public static void main(String[] args) {
        // rectangleArea(4.5, 3.2);
        double tax = computeTax(300, 12);
        System.out.println(tax);
    }
    public static void rectangleArea(double width, double height){
        System.out.println("area of rectangle with width " + width + " and height " + height + " is " + width * height);
    } 
    public static double computeTax(double amount, double rate) {
        double tax = amount * rate / 100.0;
        return tax;
    }
}
