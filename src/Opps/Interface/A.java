package Opps.Interface;

interface A {
    default void show() {
        System.out.println("A");
    }
}

interface B {
    default void show() {
        System.out.println("B");
    }
}

class C implements A, B {

    public void show() {
        A.super.show();
        System.out.println("bbb");
    }
}
class Main{
    public static void main(String[] args) {
        C c1=new C();//sub obj
        c1.show();

    }
}
