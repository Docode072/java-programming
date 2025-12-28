package Thread;

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread is running: " + Thread.currentThread().getName());
    }

    void startThread() {
        start();
    }
    public void show(){
        for(int i=0 ; i < 20; i++){
            System.out.println("Hi from MyThread");
            try {
           //Thread.yield(); // static method
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                    ex.printStackTrace();
            }
        }
    }
}

class YourThread extends Thread {
    @Override
    public void run() {
        System.out.println("YourThread is running: " + Thread.currentThread().getName());
    }
    public void show(){
        for(int i=0 ; i < 20; i++){

            System.out.println("Hello from YourThread");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

}


public class ThreadClass {
   public static void main (String [] args){
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.startThread();
        t2.startThread();

        YourThread t3 = new YourThread();
        YourThread t4 = new YourThread();
        t3.start();
        t4.start();

      // t1.show();
       try {
           //Thread.yield(); // static method
           Thread.sleep(10);
       } catch (InterruptedException ex) {
            ex.printStackTrace();
       }
      // t4.show();



      

   }
}

/*
 note :
 1. In Java, the Thread class is a built-in class that represents a thread of execution in a program. It provides methods to create, manage, and control threads.
 2. To create a thread in Java, you can either extend the Thread class and override its run() method or implement the Runnable interface and pass an instance of the Runnable implementation to a Thread object.
 3. The Thread class provides various methods such as 
 start(), run(), sleep(), join(), yield(), and interrupt() to manage thread behavior.
 4. Threads in Java can run concurrently, allowing multiple tasks to be executed simultaneously, which can improve the performance of applications that require parallel processing or responsiveness.
 5. Java provides built-in support for thread synchronization and inter-thread communication through mechanisms like synchronized blocks/methods, wait(), notify(), and notifyAll() methods.
*/
/*
thread lifecycle:
1. New: A thread is created but not yet started.
2. Runnable: The thread is eligible to run but may not be running yet.
3. Running: The thread is actively executing its run() method.
4. Blocked/Waiting: The thread is temporarily paused, waiting for a resource or condition.
5. Terminated: The thread has completed its execution or has been stopped.  

you can get the current thread using Thread.currentThread() method.
also can status of thread using isAlive() method.
getstate() method to get the current state of a thread.
*/

