package Opps.Interface;

interface Payment {
    void pay();
}

class CreditCard implements Payment {
    public void pay() {
        System.out.println("Payment via Credit Card");
    }
}

class UPI implements Payment {
    public void pay() {
        System.out.println("Payment via UPI");
    }
}
 class MainApp{
     public static void main(String[] args) {
//         CreditCard c1= new CreditCard();
//         c1.pay();
         Payment p1=new CreditCard();
         p1.pay();
         Payment p2=new UPI();
         p2.pay();


     }
 }

