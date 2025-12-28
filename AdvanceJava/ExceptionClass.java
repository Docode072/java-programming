package AdvanceJava;
class ValidException extends Exception {
    public ValidException(String message) {
        super(message);
    }
}

public class ExceptionClass {
    public static void validAge(int age) throws ValidException {
        if (age < 18) {
            throw new ValidException("Invalid age. Age must be 18 or older.");
        }
    }
    public static void main(String[] args) {
        try {
            validAge(16);
        } catch (ValidException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }

}
/*
 note :
 1. A custom exception class in Java is a user-defined class that extends the Exception class (or one of its subclasses) to create a specific type of exception tailored to the needs of an application.
 2. Custom exceptions allow developers to provide more meaningful error messages and handle specific error conditions in a more controlled manner.
 3. By creating custom exception classes, developers can improve code readability and maintainability by clearly indicating the nature of the exceptions that may be thrown and caught in their applications.
 4. Custom exception classes can include additional fields and methods to provide more context about the error, making it easier to diagnose and fix issues.

*/

