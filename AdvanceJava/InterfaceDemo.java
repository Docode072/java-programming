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
        a.introduceYourself();
        X x = new B();
        x.run();
        System.out.println("Age from getAge(): " + A.age);
    }
}


