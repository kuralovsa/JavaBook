import java.util.Scanner;
public class Main_of_poezd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\n "+"ЮК (Almaty, Shimkent, Turkistan, Taraz)"+"\n n-> ");
        System.out.print("n-> ");
        String n = scanner.nextLine();
        if (n.equalsIgnoreCase("Shimkent")) {
            poezd shimkent = new poezd();
            System.out.print("Шымкент" + "\n Время " + shimkent.vremia + "\n Номер поезда" + shimkent.nomer + "\n Что желаете (плацкард,купе,люкс)"+"\n ");
            String a = scanner.nextLine();
            if (a.equalsIgnoreCase("Plaskart")) {
                System.out.println(shimkent.p);
            } else if (a.equalsIgnoreCase("Kupe")) {
                System.out.println(shimkent.k);
            } else if (a.equalsIgnoreCase("lux")) {
                System.out.println(shimkent.l);
            }
            System.out.println("Число мест " + shimkent.chislomest);
        }
        if (n.equalsIgnoreCase("Almaty")) {
            poezd Almaty = new poezd();
            System.out.print("Almaty " + "\n Время " + Almaty.vremia + "\n Номер поезда" + Almaty.nomer + "\n Что желаете (плацкард,купе,люкс)"+"\n ");
            String a = scanner.nextLine();
            if (a.equalsIgnoreCase("Plaskart")) {
                System.out.println(Almaty.p);
            } else if (a.equalsIgnoreCase("Kupe")) {
                System.out.println(Almaty.k);
            } else if (a.equalsIgnoreCase("lux")) {
                System.out.println(Almaty.l);
            }
            System.out.println("Число мест " + Almaty.chislomest);
        }
        if (n.equalsIgnoreCase("Taraz")) {
            poezd Taraz = new poezd();
            System.out.print("Taraz " + "\n Время " + Taraz.vremia + "\n Номер поезда" + Taraz.nomer + "\n Что желаете (плацкард,купе,люкс)"+"\n ");
            String a = scanner.nextLine();
            if (a.equalsIgnoreCase("Plaskart")) {
                System.out.println(Taraz.p);
            } else if (a.equalsIgnoreCase("Kupe")) {
                System.out.println(Taraz.k);
            } else if (a.equalsIgnoreCase("lux")) {
                System.out.println(Taraz.l);
            }
            System.out.println("Число мест " + Taraz.chislomest);
        }
        if (n.equalsIgnoreCase("Turkistan")) {
            poezd Turkistan = new poezd();
            System.out.print(n + "\n Время " + Turkistan.vremia + "\n Номер поезда" + Turkistan.nomer + "\n Что желаете (плацкард,купе,люкс)"+"\n ");
            String a = scanner.nextLine();
            if (a.equalsIgnoreCase("Plaskart")) {
                System.out.println(Turkistan.p);
                System.out.println("Число мест " + Turkistan.chislomest);
            } else if (a.equalsIgnoreCase("Kupe")) {
                System.out.println(Turkistan.k);
                System.out.println("Число мест " + Turkistan.chislomest);
            } else if (a.equalsIgnoreCase("lux")) {
                System.out.println(Turkistan.l);
                System.out.println("Число мест " + Turkistan.chislomest);
            }
        }
    }
}