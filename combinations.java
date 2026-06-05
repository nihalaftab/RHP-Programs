 import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your string: ");
        String s = sc.next();

        int n = s.length();

        for (int i = 1; i < (1 << n); i++) {
            StringBuilder ans = new StringBuilder();

            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) > 0) {
                    ans.append(s.charAt(j));
                }
            }

            System.out.println(ans);
        }

        sc.close();
    }
}
