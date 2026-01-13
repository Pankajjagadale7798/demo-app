package Collecton.ArrayList;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(30);
        list.add(20);
        list.add(50);
        list.add(40);
        list.add(30);
        list.add(null);

        ArrayList<Integer> list2=new ArrayList<>(list);

        list2.add(666);
       // list2.addAll(list);
        System.out.println(list2); //option 1

//        //option-2  regular for loop
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }
//        System.out.println("=================");
//        //option -3  enhanced for loop
//        for(Integer i:list){
//            System.out.println(i);
//        }

        System.out.println("=================");

       // option -4   iterator interface
    }
}
