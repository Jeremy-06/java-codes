import java.util.Scanner;

public class sampleGetter {
    
    static class Person{
        private String course;
        private String favoriteSubject;
        
        Person(String course, String favoriteSubject){
            this.course = course;
            this.favoriteSubject = favoriteSubject;
        }
        public String getCourse(){ return course; }
        public String getFavoriteSubject(){ return favoriteSubject; }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Course: ");
        String course = scanner.nextLine();
        System.out.print("Favorite subject: ");
        String favoriteSubject = scanner.nextLine();

        Person person = new Person(course, favoriteSubject);
        System.out.println(person.getCourse() + " - " + person.getFavoriteSubject());
        scanner.close();
    }
}
