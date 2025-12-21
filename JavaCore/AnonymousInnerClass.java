package JavaCore;

class A{
    public void display(){
        System.out.println("Inside class A");
    }

    // class B{ // non-static inner class created for demonstration of anonymous inner class
    //     public void display(){
    //         System.out.println("Inside class B");
    //     }
    // } // we can use this class B to create object of B but here we will create anonymous inner class of A
}   


public class AnonymousInnerClass {

    public static void main(String[] args) {
        // Creating an instance of the anonymous inner class
        A a = new A() {
            @Override
            public void display() {
                System.out.println("Inside anonymous inner class");
            }
        };
        a.display();
    }

}

/*
Anonymous inner classes are used to instantiate classes that may not be reused elsewhere.
They enable you to make your code more concise and readable by avoiding the need for a separate named class.
 */
