package Arraypgm;

import javax.swing.*;

public class FindLargesteElement {

    public static void main(String[] args) {

        int arr[]={20,30,40,50,20,85,06,52};

        int largest=Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i]>largest){
                largest=arr[i];
            }

        }
        System.out.println(largest);
    }
}
