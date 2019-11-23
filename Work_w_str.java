import java.util.Arrays;
import java.util.Scanner;

public class Work_w_str {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the text with '{}':");
        String text1=sc.nextLine();
        String text=text1;
        String[] S_text=text.split(" ");
        int n = 0;
        for (String wods:S_text){
            if(wods.equalsIgnoreCase("{")) {
                wods = "";
            }
            if(wods.equalsIgnoreCase("}")){
                wods="";
                continue;
            }
            for (int i = 0;i < S_text.length; i++){
                if (S_text[i].equalsIgnoreCase("{")){
                    S_text[i]="";
                    S_text[i+1]="";
                    n=i;

                }
                if (S_text[i].equalsIgnoreCase("}")){
                    S_text[i]="";
                    int m=i;
                    int k=i-n;
                    for (int s=1;s<=k;s++){
                    S_text[i-s]="";
                        System.out.println(Arrays.toString(S_text));}
                }
            }
            System.out.print(wods+" ");

        }
    }
}
