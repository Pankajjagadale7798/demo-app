package StringPgm;

public class StringDemo {

    public static void main(String[] args) {
        String roleFromDB = new String("ADMIN");
        String role = roleFromDB.intern();

        if (role == "ADMIN") {
            System.out.println("Admin Access");
        }

    }
}
