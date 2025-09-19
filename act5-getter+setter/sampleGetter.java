import java.util.Scanner;

public class sampleGetter {
    
    static class Person{
        private String name;
        private int age;
        
        Person(String name, int age){
            this.name = name;
            this.age = age;
        }
        public String getName(){ return name; }
        public int getAge(){ return age; }
    }

    
}
class main {
public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Name: ");
        String name = scanner.next();
        System.out.print("Age: ");
        int age = scanner.nextInt();

        sampleGetter outer = new sampleGetter();
        Person person = new Person(name, age);
        System.out.println(person.getName() + person.age);
    }
}