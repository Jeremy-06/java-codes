import java.util.Scanner;

public class sampleSetter {  
    static class Person{
        private String hobby;
        
        Person(String hobby){
            this.hobby = hobby;
        }
        public String getHobby(){ return hobby; }
        public void setHobby(String hobby){
            this.hobby = hobby;
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Old hobby: ");
        String oldHobby = scanner.nextLine();

        Person person = new Person(oldHobby);
        System.out.println("Initial hobby: " + person.getHobby());

        System.out.print("New hobby: ");
        String newHobby = scanner.nextLine();

        person.setHobby(newHobby);

        System.out.println("Updated hobby: " + person.getHobby());
        scanner.close();
    }
}

