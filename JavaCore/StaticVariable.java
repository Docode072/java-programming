package JavaCore;

class Mobile {
   String brand;
   static String name;
   int price;
// it is used to inITIALIZED ONCE
// used for initialized static variable
   static
   {
      System.out.println("static block initiated!");
      name = "Smartphone";
   }

   public Mobile(){

      System.out.println("Constructor called");
      brand = "";
      //name = "Smartphone"; // it will load everytime of object creation so we can use status block to initialize it;
      price = 200;
   }


   public  void show(){
      System.out.println(name + " : " + brand + " : " + price);
   }
   public static void show1(Mobile obj){
      System.out.println(name + " : " + obj.brand + " : " + obj.price);
   }

    
}

public class StaticVariable {
    public static void main(String[] args) throws ClassNotFoundException {
    //     Mobile obj1 = new Mobile();
    //     obj1.brand = "Apple";
    //    // Mobile.name = "Smartphone";
    //     obj1.price = 1800;

    //     Mobile obj2 = new Mobile();
    //     obj2.brand = "Moto";
    //    // Mobile.name = "Foldable";// common variable to all
    //     obj2.price = 1500;


    //     Mobile.show1(obj1);
    //     obj2.show();

    // you can initialize your class with creating its object in java
    Class.forName("JavaCore.Mobile");

    }
}
