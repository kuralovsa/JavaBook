import java.util.Scanner;

public class N100_filtr {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Number for enter: ");
        long N=sc.nextInt();
        //n nado delit po dline i schitat summu
        if (N>99){
        N%= PowerOfTen(3);
        N/= PowerOfTen(2);
            System.out.println("Zhuzdikter sany : "+N);
        }
        else if (N<=99){
            System.out.println("Number wish you used is not have 100!" +
                    "\n Otinemiz ozge san engiziniz! ");
        }

    }
    static long PowerOfTen(int m){
    long result = 1;
    for (int i=0; i<m;i++)
        result*=10;
        return result;
    }
}
