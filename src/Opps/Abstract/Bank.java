package Opps.Abstract;

public abstract class Bank {

       abstract double getInterastRate();

       void display(){
           System.out.println("Welcome to Bank");
       }
}

    class SBI extends Bank{

    void info(){
        System.out.println("khbsufb");
    }

        @Override
        double getInterastRate() {
            return 6.5;
        }
    }
    class HDFC extends Bank{


        @Override
        double getInterastRate() {
            return 7.0;
        }
    }

    class MainApp{
        public static void main(String[] args) {
            Bank b=new SBI();  //upcasting
            System.out.println(b.getInterastRate());
            b.display();
            b=new HDFC();  //upcasting
            System.out.println(b.getInterastRate());

        }
    }
