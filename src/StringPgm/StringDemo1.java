package StringPgm;

public class StringDemo1
{
    public static void main(String[] args) {
        String s1=new String("deepak"); //create 2 obj 1- heap and 2- scp
        String s2=new String("pranav"); //2obj

        System.out.println(s1.equals(s2)); //false

        String s3=new String("deepak"); //1 obj in heap only - scp not created -bcz alreade string are present in scp
        System.out.println(s1.equals(s3)); //true
        String s4="amit";
        String s5="amit";
        System.out.println(s4==s5);
    }
}
