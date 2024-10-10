import java.util.Scanner;
import java.util.ArrayList;

public class reverse1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter username: ");
        //will github see this change?

        String username = scanner.nextLine();
        System.out.println("your name is: " + username);

        ArrayList<String> reverseThis = new ArrayList<String>();

        // to do | add each letter into the reverseThis array
        for (int i = 0; i < username.length(); i++) {
            reverseThis.add(String.valueOf(username.charAt(i)));
        }

        // prints out everything one by one
        for (int i = username.length() - 1; i >= 0; i--) {
            System.out.print(username.charAt(i));
            if (i != 0) {
                System.out.print(", ");
            }
        }

    }
}
