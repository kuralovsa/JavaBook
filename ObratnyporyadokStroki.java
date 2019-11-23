import java.util.Scanner;
public class ObratnyporyadokStroki {
    public static void main(String[] args) {
        Scanner nn=new Scanner(System.in);
        System.out.println("Soz zhaz:");
        String s=nn.nextLine();
        System.out.println(s);
        String r= new StringBuffer(s).reverse().toString();
        System.out.println(r);
    }
}
