import java.util.Scanner;

public class AllCharactersCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your string: ");
        String s = sc.nextLine();

        int flag1 = 0; // lowercase letters
        int flag2 = 0; // uppercase letters

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                flag1 |= (1 << (ch - 'a'));
            }

            if (ch >= 'A' && ch <= 'Z') {
                flag2 |= (1 << (ch - 'A'));
            }
        }

        int allLetters = (1 << 26) - 1;

        if (flag1 == allLetters && flag2 == allLetters) {
            System.out.println("It contains all 26 uppercase and lowercase characters");
        } else {
            System.out.println("It doesn't contain all 26 uppercase and lowercase characters");
        }

        sc.close();
    }
}
