package AdvanceJava;
interface  A{
    int add(int a, int b);
}

public class LamdaExpression {
    public static void main(String [] args){

        A obj = (a, b) -> a + b; // lambda expression to define the add method

        System.out.println("Sum: " + obj.add(5, 10));
    }
}

/*
 note :
 1. A lambda expression is a concise way to represent an anonymous function that can be passed around as if it were an object.
 2. Lambda expressions are primarily used to implement functional interfaces (interfaces with a single abstract method) in a more compact and readable way.
*/
