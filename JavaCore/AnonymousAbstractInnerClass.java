package JavaCore;

abstract class A{
    public abstract void display(); 
}

public class AnonymousAbstractInnerClass {
   public static void main(String[] args){
     A a = new A(){
      @Override
         public void display(){
             System.out.println("Anonymous Inner Class");
         }
     };
     a.display();
}
} 

/* * Anonymous Inner Class Example
   This example demonstrates the use of an anonymous inner class
   to provide an implementation of an abstract class.
   we create an instance of the abstract class A using an anonymous inner class
   that provides the implementation for the abstract method display().
   When we call the display() method on the instance, it prints "Anonymous Inner Class" to the console.
 */