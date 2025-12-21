package JavaCore;

class A{
    public void display(){
        System.out.println("Inside class A");
    }
    static class B{
        public void display(){
            System.out.println("Inside class B");
        }
    }
}
class C{
    public void display(){
        System.out.println("Inside class C");
    }
}
public class InnerClass {
    public static void main(String[] args) {
        A a = new A();
        a.display();
        A.B a1 = new A.B();
        a1.display();
        C c = new C();
        c.display();
    }

}
/*
Inner class ≠ inheritance
Polymorphism requires extends or implements
Here, A.B is a static inner class of A, not a subclass of A.C
So, A.B cannot be assigned to a variable of type A.


WHY inner classes are used (REAL reasons)
1️⃣ Logical grouping (clean design)
When a class is only meaningful inside another class, we nest it.
2️⃣ Increased encapsulation
Inner classes can access the members (including private) of the outer class.
3️⃣ More readable and maintainable code
Keeping related classes together makes code easier to read and maintain.
4️⃣ Event handling (in GUI applications)
Inner classes are often used for event listeners in GUI applications.
5️⃣ Implementing helper classes
Inner classes can serve as helper classes that are only relevant to the outer class.

Interview -> Inner classes help with encapsulation, grouping, and cleaner APIs.”
 */