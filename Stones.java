import java.util.Scanner;

public class Stones {
    public static void main(String[] args) {
        int i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Вводите марку авто : ");
        String n=sc.nextLine();
        Stone Kamen[]=new Stone[5];
        Kamen[0]=new Stone("Almas: Pink Pantera",12.6,2000);
        Kamen[1]=new Stone("Almas: Blu ocean",12.6,3500);
        Kamen[2]=new Stone("Almas: Secret of killer",12.6,1500);
        Kamen[3]=new Stone("Almas: Japan stone",7.6,900);
        Kamen[4]=new Stone("Almas: blu diamond",5.6,600);
        for (i=0;i<Kamen.length;i++){
            Kamen[i].Description(n);
        }
        System.out.println("\n _--------------------------------------------------_\n");
        for (i=0;i<Kamen.length;i++){
            if(Kamen[i].Price>1000) {
                System.out.println("Kamni dorozhe 1000$: "+ Kamen[i]);
                System.out.println("\n _------------------------------------------_\n");
            }
            }
        }
}


class Stone {
    String Name;
    double Carat;
    int Price;
    public Stone(String name,double carat,int price){
        this.Carat=carat;
        this.Name=name;
        this.Price=price;

    }

    public String getName() {
        return Name;
    }

    public double getCarat() {
        return Carat;
    }

    public int getPrice() {
        return Price;
    }

    @Override
    public String toString() {
        String desc="Name of Stone: "+getName()+"\nWeight of Stone(carat): "+getCarat()+"\nPrice of Stone(USD): "+getPrice();
        return desc;
    }
    void Description(String name){
        if (name.equalsIgnoreCase(getName()))
            System.out.println(toString());
    }
}