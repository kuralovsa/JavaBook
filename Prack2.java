public class Prack2 {

    public static void main(String[] args) {
        int sum=0;
        int i=1;
        String s;i=1;
        for(;i<=100;i++){
            sum+=i;

        }
        System.out.println("Sum of chislo on for="+sum);

        while (i<=100){
            sum+=i;
            i++;

        }System.out.println("Sum of chislo on while="+sum);

        do{
            sum+=i;
            i++;
        }while (i<=100);
        System.out.println("Sum of chislo on do while="+sum);
        if ((s="java")=="java") {System.out.println(s+"tru");}
        else System.out.println(s+"hjscldvlj");
        System.out.println(args[2]);

    }
}