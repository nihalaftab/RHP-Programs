import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        
        int[][] mat = {
            {10, 20, 30, 40, 50},
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 25},
            {100, 50, 40, 30, 20}
        };

        int rows = 4;
        int cols = 5;

        Scanner sc = new Scanner(System.in);

        
        int r = sc.nextInt();
        int c = sc.nextInt();


        int[][] dir = {
            {-1, -1}, {-1, 0}, {-1, 1},
            {0, -1},           {0, 1},
            {1, -1},  {1, 0},  {1, 1}
        };

        int sum = 0;

        
        for (int k = 0; k < 8; k++) {

            int nr = r + dir[k][0];
            int nc = c + dir[k][1];


            if (nr >= 0 && nr < rows &&
                nc >= 0 && nc < cols) {

                sum += mat[nr][nc];
            }
        }

 
        System.out.println("Sum of neighbors = " + sum);

        sc.close();
    }
}
