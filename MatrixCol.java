public class MatrixCol {
    public static void main(String[] args) {
        double sum1 = 0,sum2=0,sum3=0,max = 0;
        double Matrix[][]={
                {3,6,9},
                {23,4.5,6},
                {12,11,12.3}};
        for (int i=0;i<3;i++){
            for (int j=0;j<Matrix.length;j++){
                if (j==0){
                    double sum=+ Matrix[i][j];
                    sum1+=sum/2;
                }
                if (j==1){
                    double sum=+Matrix[i][j];
                    sum2+=sum/2;
                }
                if (j==2){
                   double sum=+Matrix[i][j];
                   sum3+=sum/2;
                }
                if (i==j){
                    max=Matrix[0][0];
                    if (max<Matrix[i][j]) max=Matrix[i][j];
                }
            }
        }
        System.out.print(" 1 kolona a.sum : "+sum1);
        System.out.print("\n 2 kolona a.sum : "+sum2);
        System.out.print("\n 3 kolona a.sum : "+sum3);
        System.out.print("\n Max of diagonal : "+max);

    }
}
