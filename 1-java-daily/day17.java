import java.nio.channels.Pipe.SourceChannel;

public class day17 {
   static class Animal {
      public void makeSound() {
         System.out.println();
      };
   }
   static class Dog extends Animal {
      @Override
      public void makeSound() {
         System.out.println("Woof");
      }
   }
   static class Cat extends Animal {
      @Override
      public void makeSound() {
         System.out.println("Meow");
      }
   }
    public static void main(String[] args) {
      Animal Dog = new Dog();
      Animal Cat = new Cat();

      Dog.makeSound();
      Cat.makeSound();
   } 
}
