package Thread;
class Countable implements Runnable{
    int count = 0;
     public synchronized void increment(){
        count++;
    }
    @Override
    public void run(){
        for(int i=0;i<1000;i++){
            increment();
        }
        //System.out.println("Count value by "+Thread.currentThread().getName()+" is: "+count);
    }
    
}




public class RaceConditionClass {

    public static void main(String[] args) throws InterruptedException {    
        Countable c = new Countable();

        Thread t1 = new Thread(c, "Worker-1");
        Thread t2 = new Thread(c, "Worker-2");

        
        t1.start();
        t1.join();
        System.out.println("Final Count After Thread-1 value is: "+c.count);
        t2.start();
        t2.join();

        System.out.println("Final Count value is: "+c.count);


    
    }


}
