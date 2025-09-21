
import java.util.Scanner;

public class sampleConstructor {

    static class Student {
        public String course;
        public String favoriteSubject;

        Student(String course, String favoriteSubject) {
            this.course = course;
            this.favoriteSubject = favoriteSubject;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Course: ");
        String course = scanner.nextLine();
        System.out.print("Favorite subject: ");
        String favoriteSubject = scanner.nextLine();

        Student student = new Student(course, favoriteSubject);
        System.out.println(student.course + " - " + student.favoriteSubject);
        scanner.close();
    }
}