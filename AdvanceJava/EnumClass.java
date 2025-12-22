package AdvanceJava;

enum Laptop{
    Dell("Dell Inc."), HP("Hewlett-Packard"), Apple("Apple Inc.");

    private final String manufacturer;

    Laptop(String manufacturer) { // enum constructor by default private because enum can't be extended or initialized outside
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }
}

public enum EnumClass {
    RED, GREEN, BLUE;

    public void display() {
        switch (this) {
            case RED:
                System.out.println("Color is Red");
                break;
            case GREEN:
                System.out.println("Color is Green");
                break;
            case BLUE:
                System.out.println("Color is Blue");
                break;
        }
    }

    public static void main(String[] args) {
        EnumClass color = EnumClass.RED;// predefined constant
        color.display();

        for (EnumClass c : EnumClass.values()) { // built-in method values()
            System.out.println(c);
        }

        Laptop mylaptop = Laptop.Dell;
        System.out.println("Laptop : " + mylaptop);
        System.out.println("Manufacturer : " + mylaptop.getManufacturer());
    }
}

/* output:
Color is Red
RED
GREEN
BLUE
Laptop : Dell
Manufacturer : Dell Inc.
*/

/*
 note :
 1. An enum (short for "enumeration") is a special data type in Java that represents a fixed set of constants.
 2. Enums are used to define a collection of related constants that can be treated as a single type.
 3. Enums are defined using the `enum` keyword and can have fields, methods, and constructors.
 4. Each constant in an enum is an instance of the enum type.
 5. Enums provide type safety, meaning you cannot assign a value to an enum variable that is not defined in the enum.
 6. Enums can have methods and fields, allowing you to associate additional data and behavior with each constant.
 7. Enums can be used in switch statements, making it easier to handle different cases based on the enum values.

    8. Enums can implement interfaces, allowing for more complex behavior.
    9. Enums have built-in methods like `values()` (returns an array of all enum constants) and `valueOf(String name)` (returns the enum constant with the specified name).
 ex :
 for (EnumClass c : EnumClass.values()) {
            System.out.println(c);
        }                                   
   

 difference in enum and class :
 1. An enum is a special data type that represents a fixed set of constants, while a class is a blueprint for creating objects that can have state and behavior.
 2. Enums are implicitly final and cannot be subclassed, whereas classes can be extended through inheritance.
 3. Enums have a predefined set of instances (the constants), while classes can have multiple instances created at runtime.
 4. Enums provide built-in methods for working with the constants, while classes require custom methods to manage their state and behavior.
 */