import java.util.Random;

public class Umnozhenie2Matrix {
    public static void main(String[] args) {
        Random rd = new Random();
        double max = 0;
        double[][] m1 = new double[][]{
                {3, 4, 6},
                {5, 6, 7},
                {4, 7, 9}
        };
        double[][] m = new double[3][3];
        int i, j;
        for (i = 0; i < 3; ++i) {
            for (j = 0; j < 3; ++j) {
                if (i == j) {
                    System.out.println("Diagonal elements: " + m1[i][j]);
                    max=m[0][0];
                    if(max<m1[i][j]){
                        max=m1[i][j];
                    }
                }
            }
        }
        System.out.printf("Maximum in matrix diagonal:%s%n ",max);

    }
}