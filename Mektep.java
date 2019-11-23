import javax.swing.*;

/**
 * Zadacha: Sozdanie osnovnogo klassa School i sozdat 2 dcg.class: O.S.Sh i S.S.Sh
 * Mektep yavlaietsya glavnym claasom
 * 1.Sozdat otrebuty y metody
 */
class Mektep {


        String nameschl="Alpamys batyra";
        String status_ofs_chool;
        String items="Math";
        int numbschl=8,sumofstudents,sumofTeachers;
        public void  Action(String nameschl,String status_ofs_chool,String items,int numbschl,int sumofstudents, int sumofTeachers){
            System.out.print("Школа  "+status_ofs_chool+" "+numbschl+" имени "+nameschl+"\n");
            System.out.print("В школе учатся "+sumofstudents+" учиников "+"\n");
            System.out.print("Учителей в школе "+sumofTeachers+"\n");

        }


}

