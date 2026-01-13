package Arraypgm;

import java.util.Scanner;

public class AvailableNo {
    public static void main(String[] args) {

        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter No");
        int no=sc1.nextInt();

        boolean found=false;
        int []arr={10,20,30,40,60,50,80,70,90};

        for (int i = 0; i < arr.length; i++) {

            if(no==arr[i]){

                found=true;
               // System.out.println("No Exist");  //sk-  sout

            }

        }
        System.out.println(found?"Number is  Exist/Valid":"number does not Exist!!!");

    }
}
