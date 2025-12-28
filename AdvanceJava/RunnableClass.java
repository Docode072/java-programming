package AdvanceJava;



public class RunnableClass {
    public static void main(String[] args) {
        Runnable r = () -> { // Anonymous Inner class it will work only for @FunctionalInterface i.e Runnable is @FunctionalInterface.
            for (int i = 0; i < 5; i++) {
                System.out.println("Runnable running: " + Thread.currentThread().getName());
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread t1 = new Thread(r, "Worker-1");
        Thread t2 = new Thread(r, "Worker-2");

        t1.start();
        t2.start();
    }
}

/* 
What is Runnable?

Runnable is a functional interface with a single method run().
You implement it when you want your class to perform a task but not become a thread itself.

Real-World Example

Same restaurant 🍽️

Cooking task = Runnable

Chef who executes it = Thread


| Feature                     | Thread                      | Runnable                 |
| --------------------------- | --------------------------- | ------------------------ |
| Type                        | Class                       | Interface                |
| Inheritance                 | Cannot extend another class | Can extend another class |
| Flexibility                 | Less                        | More                     |
| Best Practice               | ❌ Not recommended           | ✅ Recommended            |
| Separation of Task & Thread | ❌ No                        | ✅ Yes                    |

Real-World Combined Example (Office Printer)
Scenario

Multiple employees want to print documents at the same time.

Ex :

Runnable (Task)
class PrintJob implements Runnable {
    private String document;

    PrintJob(String document) {
        this.document = document;
    }

    public void run() {
        System.out.println("Printing: " + document);
    }
}

Thread Execution
public class OfficePrinter {
    public static void main(String[] args) {
        Thread t1 = new Thread(new PrintJob("Resume.pdf"));
        Thread t2 = new Thread(new PrintJob("Invoice.pdf"));

        t1.start();
        t2.start();
    }
}


*/
