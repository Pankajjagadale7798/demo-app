package practice_pgm;

public class FindSecondLargest {
    public static void main(String[] args) {


        int arr[] = {20, 52, 62, 42, 70, 41, 23};

        int largest = Integer.MIN_VALUE;
        int second = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {

                second = largest;
                largest = arr[i];
                    
        } else if (arr[i]>second) {
                   second=arr[i];
            }
            }
            System.out.println(second);
        System.out.println(largest);

        }
    }