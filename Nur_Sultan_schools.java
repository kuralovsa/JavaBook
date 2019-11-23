import java.util.Scanner;

public class Nur_Sultan_schools {
    public static void main(String[] args) {
        int i;
        int sum_of_stud_astana=0;
        School Nur_schools[]=new School[5];
        Nur_schools[0]=new School("Akhmet Zhubanov","Zhenis",700);
        Nur_schools[1]=new School("Pushkin","Zhenis",600);
        Nur_schools[2]=new School("Nur-Sultan","Ablay Khana",500);
        Nur_schools[3]=new School("Akhmet Baitursunov","Zhenis",800);
        Nur_schools[4]=new School("Abay Kunanbaiev","Mangylik el",200);
        for (i=0;i<Nur_schools.length;i++){
            System.out.println(Nur_schools[i]+"\n_------------------------------_");
        }
        for (i=0;i<Nur_schools.length;i++){
            sum_of_stud_astana=sum_of_stud_astana+Nur_schools[i].Sum_of_students;
        }System.out.println("Sum of school students of Nur-Sultan: "+sum_of_stud_astana+"\n_------------------------------_");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the school street : ");
        String n=sc.nextLine();
        for (i=0;i<Nur_schools.length;i++){
            if(n.equalsIgnoreCase("Zhenis")){
                Nur_schools[i].Description(n);
                System.out.println("_------------------------------_");
            }
        }
        System.out.println("Proses of program is finished!"+"\nGood day for every programmer ;-)");
    }
}
class School {
    String Name;
    String Street;
    int Sum_of_students;
    public School(String name,String street,int sum_of_students){
        this.Street=street;
        this.Name=name;
        this.Sum_of_students=sum_of_students;

    }

    public String getName() {
        return Name;
    }

    public String getStreet() {
        return Street;
    }

    public int getSum_of_students() {
        return Sum_of_students;
    }

    @Override
    public String toString() {
        String desc="Name of School : "+getName()+"\nStreet of school : "+getStreet()+"\nSum of students : "+getSum_of_students();
        return desc;
    }
    void Description(String street){
        if (street.equalsIgnoreCase(getStreet()))
            System.out.println(toString());
    }
}