public class math {
    public static void main(String[] args) {
        SquareRoot();
        Square();
        Area();
        Random();
    };
    public static void SquareRoot() {
        double number = 25;
        double result = Math.sqrt(number);
        System.out.println("The square root of " + number + " is " + result);
    };
    public static void Square() {
        double number = 5;
        double result = Math.pow(number,2);
        System.out.println("The square of " + number + " is " + result);
    };
    public static void Area(){
        double radius = 7;
        double result = Math.PI * Math.pow(radius, 2);
        System.out.println("The area of the circle is " + result);
    }
    public static void Random(){
        int result = (int)(Math.random() * 8.0) * 10 + 5;
        System.out.println("The random number is " + result);
    }
}