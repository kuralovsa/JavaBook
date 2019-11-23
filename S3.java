import java.util.Scanner;
public class S3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Vvodite chislo x: ");
        double x=in.nextDouble();
        Scanner ss = new Scanner(System.in);
        System.out.println("Vvodite chislo y: ");
        double y=in.nextDouble();
        Scanner gg = new Scanner(System.in);
        System.out.println("Vvodite chislo z: ");
        double z=in.nextDouble();
        if(x+y+z<1){
            double min=x;
            if (min>y) min=y;
            if (min>z) min=z;
            if (min==x) x=(z+y)/2;
            if (min==y) y=(z+x)/2;
            if (min==z) z=(x+y)/2;
        }
        else if (x>y) y=(x+z)/2;
        else x=(y+z)/2;
        System.out.println(x+" "+y+" "+z+"");
        return;

    }
}
