import java.util.Scanner;
//Naity blizhachi k sifru polindrom

public class Polindrom1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number");
        int s=sc.nextInt();
        int temp=s;
        int f=0;
        int rev=0;
        while (s>0) {
            f=s%10;
            rev=rev*10+f;
        }
        if (temp==rev) System.out.println("the number is palindrome: "+s);
        else System.out.println("the number is not palindrome: "+s);


    }
}
