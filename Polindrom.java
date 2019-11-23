import java.util.Scanner;
public class Polindrom {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Vvodite chislo:");
        int n=sc.nextInt();
        int[] a=new int[n];
        for (int s=0;s<n;s++){
            a[s]=sc.nextInt();
        }
        boolean t=true;

            for(int i=0; i<(a.length+1)/2&& t;i++)
                t=a[i]==a[a.length-i-1];
            System.out.println( a+"-Polidrom");

    }
}
