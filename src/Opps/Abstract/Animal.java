package Opps.Abstract;


    abstract class Animal {
        abstract void sound();

        void eat() {
            System.out.println("Animal eats food");
        }
    }

    class Dog extends Animal {
        void sound() {
            System.out.println("Dog barks");
        }

        public static void main(String[] args) {
            Animal al=new Dog();
            al.eat();
            al.sound();
            Dog d =new Dog();
            d.sound();d.eat();
        }
    }


