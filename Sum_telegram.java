import java.util.Scanner;

public class Sum_telegram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the text of telegram:"
                +"\nPrice of word: (word<=5==5tg),(word<=10==10tg),(word=>10==15tg)");
        String text1=sc.nextLine();
        String text=text1;
        String[] S_text=text.split(" ");
        int n=S_text.length;
        int price=5;
        int sum_of_telegram=0;
        int sum_of_telegram2=0;
        int sum_of_telegram3=0;
        int count1=0;
        int count2=0;
        int count3=0;
        for (int i=0;i<n;i++){
            if (S_text[i].length()<=5){
                price=5;
                count1=count1+1;
                sum_of_telegram=+price*count1;
            }
            else if (S_text[i].length()>=10){
                price=15;
                count2=count2+1;
                sum_of_telegram2=+count2*price;
            }

            else if (S_text[i].length()>5 && S_text[i].length()<10){
                price=10;
                count3=count3+1;
                sum_of_telegram3=+count3*price;
            }

        }
        int sum;
        sum=sum_of_telegram+sum_of_telegram2+sum_of_telegram3;
        System.out.println("sum: "+sum
                +"\n 5*: "+count1
                +"  "+sum_of_telegram+
                "\n 15*: "+count2+"  "
                +sum_of_telegram2+
                "\n 10*:"+count3
                +"  "+sum_of_telegram3);
    }
}
