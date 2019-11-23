import java.util.Scanner;
public class Scannerkoda {
    public static void main(String[] args) {
        int n=123;
        Scanner s=new Scanner(System.in);
        System.out.println("Vvodi imya polzovatelya:");
        int m=s.nextInt();
        if(m==n){
            System.out.println("Privet"+n+"!");
        }
        else if (m!=123){
            System.out.println("nevernoe imya");
        }
    }
}
