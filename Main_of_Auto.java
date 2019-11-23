import java.util.Scanner;
public class Main_of_Auto {
    public static void main(String[] args) {
        int i,j;
        Scanner sc=new Scanner(System.in);
        System.out.println("Вводите марку авто : ");
        String n=sc.nextLine();
        Automobiles auto[]=new Automobiles[5];
        auto[0]= new Automobiles("Porshe","Legkovoi",2006);
        auto[1]= new Automobiles("Mercedes","legkovoi",2018);
        auto[2]= new Automobiles("BMW","Legkovoi",1996);
        auto[3]= new Automobiles("Audi","Legkovoi",2015);
        auto[4]= new Automobiles("Lada2107","Legkovoi",2013);

        for (i=0;i<auto.length;i++){
            auto[i].Description(n);
        }
        Wheel wheel[]=new Wheel[5];
        wheel[0]= new Wheel("BMW"," Litye",16,"American Racing","Mishlen","17","Na hodu");
        wheel[1]= new Wheel("Porshe"," Litye",19,"Italian Reacing","Belshina","R 19","Na hodu");
        wheel[2]= new Wheel("Mercedes"," Kovannye",17,"AMG","Mishlen","R17 uzkie","Menyat na zimnye");
        wheel[3]= new Wheel("Audi","Litye",17,"GM","Westleck","R 17","Na hodu");
        wheel[4]= new Wheel("Lada2107","Kovany",13,null,"Bellshina","r 13","Vsegda na xodu, exe.exe.exe.exe :-)");
        for ( j=0;j<auto.length;j++){
            wheel[j].Description(n);
        }
        Engine engine[]=new Engine[5];
        engine[0]= new Engine("BMW","V6 GM",3.2,260,"Na hodu");
        engine[1]= new Engine("Porshe","v8 GM",4.2,350,"Na hodu");
        engine[2]= new Engine("Mercedes","V12 AMG",6.0,394,"Na hodu");
        engine[3]= new Engine("Audi","V8 GM",3.6,310,"Na hodu");
        engine[4]=new Engine("Lada2107","i4 USSR",1.3,70,"Bez polomok");
        for ( j=0;j<auto.length;j++){
            engine[j].Description(n);
        }
        if(n.equalsIgnoreCase("Mercedes")) {
            System.out.print("\n Vyvod : Tachka " + engine[2].Model + " s dvigitelem " + engine[2].type_of_Engine + " i Shiny v avto " + wheel[2].Status_of_Wheel);
            System.out.print("\n Problemy s motorom ne imeutsya! ;-) ");
        }
        if (n.equalsIgnoreCase("Porshe")){
            System.out.print("\n Vyvod : Tachka "+ engine[1].Model + " s dvigitelem " + engine[1].type_of_Engine + " i Shiny v avto " + wheel[1].Status_of_Wheel);
            System.out.print("\n Problemy s motorom ne imeutsya! ;-) ");
        }
        if (n.equalsIgnoreCase("BMW")){
            System.out.print("\n Vyvod : Tachka "+ engine[0].Model + " s dvigitelem " + engine[0].type_of_Engine + " i Shiny v avto " + wheel[0].Status_of_Wheel);
            System.out.print("\n Problemy s motorom ne imeutsya! ;-) ");
        }
       if (n.equalsIgnoreCase("Audi")){
          System.out.print("\n Vyvod : Tachka "+auto[3].Model+" with engine "+ engine[3].type_of_Engine+" i Shiny v avto "+ wheel[3].Status_of_Wheel);
           System.out.print("\n Problemy s motorom ne imeutsya! ;-) ");
       }
       if (n.equalsIgnoreCase("Lada2107")){
           System.out.print("\n Vyvod : Tachka "+auto[4].Model+" with engine "+ engine[4].type_of_Engine+" i Shiny v avto "+ wheel[4].Status_of_Wheel);
           System.out.print("\n Sostoyanie motora:"+engine[4].Status_of_Engine);
           System.out.print("\n Problemy s motorom ne imeutsya! ;-) ");
       }
    }
}