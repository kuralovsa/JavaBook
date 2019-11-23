import java.util.Scanner;
class Struct_Student {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        System.out.println("Enter number of function: "+"\n 1. Enter the data of patients"+"\n 2.Demo mode"+"\n 3. Exit");
        int n=sn.nextInt();
        switch (n){
            case 1:
                Patient pt=new Patient();
                Scanner sc1=new Scanner(System.in);
                System.out.print("Soname: ");
                pt.Soname=sc1.nextLine();
                Scanner sc2=new Scanner(System.in);
                System.out.print("Name: ");
                pt.Nume=sc2.nextLine();
                Scanner sc3=new Scanner(System.in);
                System.out.print("Middle name of patient: ");
                pt.Middle_name=sc3.nextLine();
                Scanner sc4=new Scanner(System.in);
                System.out.print("Adres of patient ");
                pt.Adres=sc4.nextLine();
                Scanner sc5=new Scanner(System.in);
                System.out.print("Diagnosis of patient: ");
                pt.Diagnosis=sc5.nextLine();
                Scanner sc6=new Scanner(System.in);
                System.out.print("Patient MedCard number: ");
                pt.number_med_Card=sc6.nextLine();
                Scanner sc7=new Scanner(System.in);
                System.out.print("Phone number of patient:");
                pt.Phone_number=sc7.nextLine();
                Scanner sc8=new Scanner(System.in);
                System.out.print("Number of patient: ");
                pt.id=sc8.nextLine();
                pt.get(pt.Soname,pt.Nume,pt.Middle_name,pt.Adres,pt.Diagnosis,pt.id,pt.number_med_Card,pt.Phone_number);
                pt.set();
                break;
            case 2:
                Patient pn=new Patient();
                pn.set();
                break;
            case 3:
                break;
            default:
                System.out.println("In program it`s function is not fount!"+"\n Please enter the different number!");
        }
    }
}
class Patient {
    String id="1";
    String Soname="Kuralov";
    String Nume="Serikbay";
    String Middle_name="Adambay uly";
    String Adres="Q.Zhetisay k.Bogenbay y.16 ";
    String Diagnosis="Deni sau";
    String number_med_Card="2234";
    String Phone_number="87012345678" ;

    void get(String Soname, String Nume, String middle_name, String adres, String diagnosis, java.lang.String id, String number_med_Card, String phone_number){
        this.Adres=adres;
        this.id=id;
        this.number_med_Card=number_med_Card;
        this.Phone_number=phone_number;
        this.Nume=Nume;
        this.Soname=Soname;
        this.Middle_name=middle_name;
        this.Diagnosis=diagnosis;
        Scanner sc=new Scanner(System.in);

    }
    void set(){
        System.out.println("№ "+id+" | "+Soname+" "+Nume+" "+Middle_name+" with Diagnosis "+Diagnosis);
    }
}