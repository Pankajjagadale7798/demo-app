package Opps.Abstract;

 public abstract class Demo{


     //1.static notstatic variable
     static int a=20;
     double d=35.30;

     // non static absract /concrete method

     abstract void test();//abstarct method

     void display(){
         System.out.println("Display Concreate method");
     }
 //static concreate method

     static void info(){
         System.out.println("static info method");

     }
     //Constructor
      public Demo(){
          System.out.println(" Constructor");

      }
      //static non static block
     static {
          System.out.println("static block");
      }
     {
         System.out.println("non static block");
     }



}
