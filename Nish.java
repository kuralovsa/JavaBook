import java.util.Scanner;

class Nish extends Mektep {
    @Override
    public void Action(String nameschl, String status_ofs_chool, String items, int numbschl, int sumofstudents, int sumofTeachers) {
        super.Action(nameschl, status_ofs_chool="Scecial School", items, numbschl, sumofstudents, sumofTeachers);
    }
}
class Main {
    public static void main(String[] args) {
            Mektep mp = new Mektep();
            mp.Action("Abay", "gemnasia", "obshie Predmety", 119, 722, 68);
            Nish ns = new Nish();

            ns.Action("Nazarbaev", "Special School", "Special Items", 1, 450, 45);

    }
}