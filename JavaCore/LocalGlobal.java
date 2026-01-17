package JavaCore;
class Modify{
    int a=10; // instance variable
    static int b=20; // static variable or Class variable
    
    void changeValues(){
        a=a+5; // modifying instance variable
        b=b+5; // modifying static variable
    }

    void displayValues(){
        System.out.println("Instance variable a: " + a);
        System.out.println("Static variable b: " + b);
    }

    void addValue(int val){
        a = a + val; // modifying instance variable using local parameter
    }

    void changeLocal(int val){
        val = val + 10; // modifying local variable
        //System.out.println("Modified local variable val inside method: " + val);
    }
    public void changeName(String name){
        name = name + " Programming"; // modifying local variable
        //System.out.println("Modified local variable name inside method: " + name);
    }
    void changeByReference(Modify obj){
        obj.a = obj.a + 10; // modifying instance variable using object reference
    }
} 

public class LocalGlobal {
    public static void main(String[] args) {
        int value = 1;
        String name="Java"; 
        Modify obj1 = new Modify();

        // obj1.changeName(name); // passing local variable to method -> passed by value
        // System.out.println("Value of local variable name: " + name);
        // obj1.addValue(value); // passing local variable to method
        // obj1.displayValues();
        // System.out.println("Value of local variable value: " + value);
        Modify obj2 = new Modify();
        // obj2.addValue(value);
        // obj2.displayValues();
        obj1.changeByReference(obj2);
        obj2.displayValues();



        // System.out.println("Initial values for obj1:");
        // obj1.displayValues();

        // System.out.println("\nInitial values for obj2:");
        // obj2.displayValues();

        // obj1.changeValues();
        // System.out.println("\nAfter modifying values in obj1:");

        // System.out.println("Values for obj1:");
        // obj1.displayValues();

        // System.out.println("\nValues for obj2 (should reflect change in static variable):");
        // obj2.displayValues();
    }
}
