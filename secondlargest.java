import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int first = a[0];
        int second = -1;

        for (int i = 1; i < n; i++) {

            if (a[i] > first) {
                second = first;
                first = a[i];
            } else if (a[i] != first && a[i] > second) {
                second = a[i];
            }
        }

        System.out.println(second);

        sc.close();
    }
}
