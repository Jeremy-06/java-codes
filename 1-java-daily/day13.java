public class day13 {
    static class Car {
        String make;
        String model;
        int year;

        public Car(String make, String model, int year) {
            this.make = make;
            this.model = model;
            this.year = year;
        }

        public String StartEngine(){
            return "Engine started";
        }
        public String StopEngine(){
            return "Engine stopped";
        }
    }
    public static void main(String[] args) {
        System.out.println("Introduction to OOP: Create a Car Class");
        Car myCar = new Car(null, null, 0);
        System.out.println(myCar.StartEngine());
    }
}
