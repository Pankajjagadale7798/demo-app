package Opps.Abstract;

public class MainApp1 extends  Demo {
    public static void main(String[] args) {
        MainApp1 m=new MainApp1(); // non static block//constructor
        System.out.println("a:"+Demo.a);//static blcok/ static variable //
        Demo.info(); //static concrete method
        System.out.println("d:"+m.d);//non static variable
    }

    @Override
    void test() {
        System.out.println("override Abstarct Method");
    }
}
