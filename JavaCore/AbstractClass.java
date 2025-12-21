package JavaCore;


abstract class Bike
{
    public abstract void ride();
}
abstract class Car{
    void start(){
        System.out.println("Car is starting");
    }
    public abstract void drive();
    public abstract void fly();    
}

abstract class Honda extends Car{
    
    @Override
    public void drive(){
        System.out.println("Driving a Honda car");
    }
}

class UpdatedHonda extends Honda{
    @Override
    public void fly(){
        System.out.println("Flying a Honda car");
    }
}

public class AbstractClass {
    // Abstract method
    public static void main(String[] args) {
        Car myCar = new UpdatedHonda();
        myCar.start();
        myCar.drive();
        myCar.fly();
    }

}
// can not create object of abstract class
// Car car = new Car();  --- IGNORE ---
// if a class contains abstract method then the class must be abstract
// abstract class can have both abstract and non-abstract methods
// abstract class can not be final
// abstract class can have constructor
// abstract class can have static methods
// abstract class can have instance variables
// abstract class can have main method
// abstract class can implement interfaces
// abstract class can extend another class
// abstract class can have static block
// abstract class can have final methods
// abstract class can have synchronized methods

// if a class extends an abstract class then it must implement all the abstract methods of the abstract class or else it must be declared as abstract
// an abstract class can not be instantiated
// an abstract class can have abstract methods without any body