import java.util.*;

public class vowel {
    public static void main(String[] args) {
        System.out.println("Enter an alphabet");
        Scanner sc = new Scanner(System.in);

        boolean x = sc.hasNextInt();
        if (x == true) {
            System.out.println("Wrong input");
        } else {
            char ch = sc.next().charAt(0);

            if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O'
                    || ch == 'u' || ch == 'U') {
                System.out.println("its a vowel");
            } else {
                System.out.println("Its a consonant");
            }
        }

    }


}
