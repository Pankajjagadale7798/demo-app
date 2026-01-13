package StringPgm;

public class ReverseString {
    public static void main(String[] args) {

        String str = "pankaj jagdale";

        String reverse="";
        for (int i = 0; i <str.length() ; i++) {
              reverse = str.charAt(i) + reverse; //charAt()-use to check the charcter present & specified position
                                                 // it always accept index & return character o/p

        }
        System.out.println(reverse);

    }

//        String str = "pankaj jagdale";
//
//        char[] data=str.toCharArray();  //this fun used to convert string value into character array
//
//        String reverse="";
//        for (int i = 0; i <data.length ; i++) {
//
//            System.out.println(data[i]);
//        }
//        System.out.println("===========");
//        for (int i = data.length-1; i >=0 ; i--) {
//
//            System.out.println(data[i]);
//        }


    }
