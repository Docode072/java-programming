package AdvanceJava;

interface A {
    int age = 25; // public, static and final by default
    void introduceYourself(); // public and abstract by default

    int getAge(); // public and abstract by default
}



interface X{
    void run();
}

interface Y extends X{
    default void defaultMethod1() {
         System.out.println("This is a default method in the interface.");
     }
    @Override
     void run();
}
class B implements A, Y{

    @Override
    public void run(){
        System.out.println("Hello in B");
    }
    @Override
    public int getAge(){
        return A.age;
    }
    @Override
    public void introduceYourself(){
        System.out.println("I am B");
    }
}


public class InterfaceDemo{
    public static void main(String[] args) {
       

        A a = new B();
        //a.run();
        //a.defaultMethod1(); // Accessing default method from interface Y
        a.introduceYourself();
        X x = new B();

        x.run();
        Y y = new B();
        y.defaultMethod1(); // Accessing default method from interface Y
        System.out.println("Age from getAge(): " + A.age);
    }
}

/*
 note :
 1. An interface is a reference type in Java, similar to a class, that can contain only constants, method signatures, default methods, static methods, and nested types.
 2. Interfaces cannot contain instance fields or constructors.
 3. A class can implement multiple interfaces, allowing for a form of multiple inheritance.
 4. All methods in an interface are implicitly public and abstract, unless they are default or static methods.
 5. Variables declared in an interface are implicitly public, static, and final (constants).
 6. Interfaces are used to achieve abstraction and define a contract that implementing classes must follow.
 7. Since Java 8, interfaces can have default methods with a body, allowing for method implementations within the interface itself.
 ex : default void defaultMethod() {
         System.out.println("This is a default method in the interface.");
     }
     however, implementing classes can override these default methods.and its working is shown in above code.
     it can be accessed using object of implementing class.
 8. Interfaces can also have static methods.
 9. A class that implements an interface must provide implementations for all of its methods, unless the class is abstract.
 10. Interfaces can extend other interfaces, allowing for a hierarchical structure
*/


