import java.util.*;

public class Mart {

    public static void main(String[] args) {

        int n = 3;
        int m = 2;
        int q = 3;

        int a[][] = new int[n][m];
        int b[][] = new int[m][q];
        int c[][] = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};

        Random r = new Random(); //Random from library
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
                a[i][j] = r.nextInt(10);
        }

        System.out.println("Matrix A:=");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
                System.out.print(a[i][j] + "\t");
            System.out.println();
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < q; j++)
                b[i][j] = r.nextInt(10);
        }

        System.out.println("Matrix B:=");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < q; j++)
                System.out.print(b[i][j] + "\t");
            System.out.println();
        }


        System.out.println("Matrix C:=");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < q; j++)
                for (int k = 0; k < m; k++) {
                    c[i][j] += a[i][k] * b[k][j];

                    System.out.print(c[i][j] + "\t");
                }
            System.out.println();

        }
    }
}
