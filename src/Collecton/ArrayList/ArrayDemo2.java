package Collecton.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayDemo2 {
    public static void main(String[] args) {
        ArrayList<Integer> data=new ArrayList<>(); //generic array
        data.add(10);
        data.add(20);
        data.add(400);
        //data.add("sam");
        System.out.println(data);

        Iterator<Integer> itr=data.iterator();
        while(itr.hasNext()){
            if (itr.next()==400){
                itr.remove();
            }
        }
        System.out.println(data);
    }
}
