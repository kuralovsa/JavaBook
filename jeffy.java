import java.util.Arrays;

public class jeffy {
    public static void main(String[] args) {
        String namesalat="kim-chi";
        int obem_komponenta = 0;
        Saebiz s=new Saebiz("Saebiz",43.02);
        luk l= new luk("luk", 40.02);
        Kapusta k=new Kapusta("Kapusta",42.03);
        String salat="\n Sostav Salata: "+namesalat
                +"\n 1. "+s.getName()+" koloriasy : "+s.getKolori()+" "+(obem_komponenta=750)+" gram"
                +"\n 2. "+l.getName()+" koloriasy : "+l.getKolori()+" "+(obem_komponenta=350)+" gram"
                +"\n 3. "+k.getName()+" koloriasy : "+k.getKolori()+" "+(obem_komponenta=600)+" gram\n";
        System.out.print(salat);
        Double[] kolori={s.getKolori(), k.getKolori(),l.getKolori()};
        double n=kolori[2];
        for (int i=0;i<3;i++) {
            if (n<kolori[i]){
                n=kolori[i];
                kolori[0]=n;
            }
        }
        if (s.getKolori()==n){
            System.out.println(s);
            System.out.println(Arrays.toString(kolori));
        }
        else if(l.getKolori()==n)
            System.out.println(l);
        else if(k.getKolori()==n)
            System.out.println(k);
    }

}
class ovoshi{
    String Name;
    Double Kolori;

    public ovoshi(String name,Double kolori){
        this.Kolori=kolori;
        this.Name=name;
    }

    public Double getKolori() {
        return Kolori;
    }

    public String getName() {
        return Name;
    }

    public void setKolori(Double kolori) {
        Kolori = kolori;
    }

    public void setName(String name) {
        Name = name;
    }
}

class Saebiz extends ovoshi {


    public Saebiz(String name, Double kolori) {
        super(name="Sabiz", kolori= 45.00);
        System.out.print(toString());
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void setKolori(Double kolori) {
        super.setKolori(kolori);
    }

    @Override
    public String toString() {
        String Saebiz="\n Nazyvanie : "+getName()
                +"\n Koloria: "+getKolori()+"\n";

        return Saebiz;
    }

}
class Kapusta extends ovoshi{

    public Kapusta(String name,Double kolori) {
        super(name="Kapusta", kolori=37.00);
        System.out.print(toString());
    }

    @Override
    public Double getKolori() {
        return super.getKolori();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setKolori(Double kolori) {
        super.setKolori(kolori);
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String toString() {
        String kop="\n Name: "+getName()
                +"\n Kolori: "+getKolori()+"\n";
        return kop;
    }
}
class luk extends ovoshi{
    String Name="Luk";
    double Kolori=42.03;
    public luk(String name, Double kolori) {
        super(name, kolori);
        name=this.Name;
        kolori=this.Kolori;
        System.out.println(toString());
    }

    @Override
    public void setName(String name) {
        Name = name;
    }

    @Override
    public void setKolori(Double kolori) {
        super.setKolori(kolori);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public Double getKolori() {
        return super.getKolori();
    }

    @Override
    public String toString() {
        String luk="\n Name: "+getName()
                +"\n Kolori: "+getKolori();
        return luk;
    }
}