package Thread;

/*
Real-World Example: Consumer-Producer Problem
statment:
In a factory, a Producer creates items and places them in a shared storage area (buffer).
A Consumer takes items from this storage area for processing.
you can implement this scenario using the Runnable interface for both Producer and Consumer classes.
task: Implement the Producer and Consumer classes using Runnable interface in Java.
      to work in a multi-threaded environment.and ensure proper synchronization between them.

*/

class SharedBuffer  {
    private int items;
    boolean available = false;
    public SharedBuffer(int items){
        this.items = items;
    }

    public synchronized void produce(int item) throws InterruptedException {
        while(available){
            wait();
        }
        this.items = item;
        System.out.println("Producing items: " + items);
        available = true;
        notify();
    }

    public synchronized void consume() throws InterruptedException{
        while(!available){
            wait();
        }
        System.out.println("Consuming items: " + items);
        available = false;
        notify();
    }
}

class Consumer implements Runnable {
    SharedBuffer buffer;
    public Consumer(SharedBuffer buffer){
        this.buffer = buffer;
    }
    @Override
    public void run() {

        for(int i = 0; i< 5; i++){
            try{
                buffer.consume();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}

class Producer implements Runnable {
    SharedBuffer buffer; // reference to shared buffer

    public Producer(SharedBuffer buffer){
        this.buffer = buffer;
    }
    @Override
    public void run() {
        for(int i = 0; i < 5; i++){
            try {
                buffer.produce(i);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}


public class ConsumerProducer {
    public static void main(String [] args){
        SharedBuffer buffer = new SharedBuffer(1);

        Thread producerThread = new Thread(new Producer(buffer), "Producer-1");
        Thread consumerThread = new Thread(new Consumer(buffer), "Consumer-1");

        consumerThread.start();
        producerThread.start();





    }

}

/*
note:
t 
*/
