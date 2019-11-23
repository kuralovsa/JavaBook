import java.util.Scanner;

public class Auto_park {
    public static void main(String[] args) {
        int i,m = 0;
        int sum_of_stud_astana=0;
        Bus bus[]=new Bus[5];
        bus[0]=new Bus(83,"Zhenis",17);
        bus[1]=new Bus(83,"Zhenis",16);
        bus[2]=new Bus(83,"Ablay Khana",15);
        bus[3]=new Bus(40,"Zhenis",28);
        bus[4]=new Bus(50,"Mangylik el",41);
        for (i=0;i<bus.length;i++){
            System.out.println(bus[i]+"\n_------------------------------_");
        }
        for (i=0;i<bus.length;i++){
            sum_of_stud_astana=sum_of_stud_astana+bus[i].Sum_of_pasazhirs;
        }System.out.println("Sum of people on all bus: "+sum_of_stud_astana+"\n_------------------------------_");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number bus : ");
        int n=sc.nextInt();
        for (i=0;i<bus.length;i++){
            if(bus[i].Namber==n){
                System.out.println(bus[i]);
                System.out.println("_------------------------------_");
                m=m+bus[i].Sum_of_pasazhirs;
            }
        }System.out.println("Sum of people on bus №83 : "+m+"\n_------------------------------_");
        System.out.println("Proses of program is finished!"+"\nGood day for every programmer ;-)");
    }
}
class Bus {
    int Namber;
    String Street;
    int Sum_of_pasazhirs;
    public Bus(int namber,String street,int sum_of_pasazhirs){
        this.Street=street;
        this.Namber=namber;
        this.Sum_of_pasazhirs=sum_of_pasazhirs;

    }

    public int getNamber() {
        return Namber;
    }

    public String getStreet() {
        return Street;
    }

    public int getSum_of_pasazhirs() {
        return Sum_of_pasazhirs;
    }

    @Override
    public String toString() {
        String desc="Number of BUS : "+getNamber()+"\nStreet of bus location : "+getStreet()+"\nSum of people on bus: "+getSum_of_pasazhirs();
        return desc;
    }
    void Description(int namber){
        if (namber==83)
            System.out.println(toString());
    }
}