import java.util.Scanner;

public class PangramCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        int mask = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = Character.toLowerCase(s.charAt(i));

            if (ch >= 'a' && ch <= 'z') {
                mask |= (1 << (ch - 'a'));
            }
        }

        if (mask == (1 << 26) - 1) {
            System.out.println("Pangram");
        } else {
            System.out.println("Not a Pangram");
        }

        sc.close();
    }
}
