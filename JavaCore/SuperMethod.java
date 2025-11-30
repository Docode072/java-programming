package JavaCore;

class A extends Object{
   public A(){
     super();
     System.out.println("A in");
   }

   public A(int a){
      System.out.println("A in int");
   }
    
}

class B extends A {

    public B(){
        super();
        System.out.println("B in");
    }

    public B(int n){
        //super(); // you can only use one of them ( super() or this())
        this(n, 10);
        System.out.println("B in int");
    }
    public B(int a, int b){
        super(a);
        System.out.println("B in double int");
    }



    
} 

public class SuperMethod {
    public static void main(String[] args) {
         B b = new B(8);

    }
}
/* output -> 
A in int
B in double int
B in int
*/