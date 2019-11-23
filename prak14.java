import java.util.Scanner;
public class prak14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Chislo dlya vyvoda facktoriala: ");
        int n=sc.nextInt();
        int s=1;
        int k=1,v=1;
        int j=1,h=1;
        if(n==0) {
            System.out.println("0!= is not facktarial");
        }
        if(n==1) System.out.println("1!=1");
        for (int i=1;i<=n;i++){
            s*=i;
            System.out.println("N="+i+"N!="+s+"!");
        }
        while (j<=n){
            if (n==0) break;
            k*=j;
            j++;

        }if (n!=0)System.out.println("N="+n+" N Factoryal On while: "+s+"!");
        do {
            if (n==0) break;
            v*=h;
            h++;
        }while (h<=n);
        if (n!=0)System.out.println("N="+n+" N factorial on Do While: "+v+"!");

    }
}
