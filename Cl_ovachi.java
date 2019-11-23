public class Cl_ovachi {
    public static void main(String[] args) {
        int i;
        double sum=0;
        cls_ovachi[] Ovachils =new cls_ovachi[5];
        Ovachils[0]=new cls_ovachi("Sabiz",2000.98,2019);
        Ovachils[1]=new cls_ovachi("Kortop",2700.98,2019);
        Ovachils[2]=new cls_ovachi("Tomato",3500.98,2019);
        Ovachils[3]=new cls_ovachi("Onion",4500.98,2018);
        Ovachils[4]=new cls_ovachi("Any ovach",2999.98,2019);
        for (i=0;i<Ovachils.length;i++){
            if(Ovachils[i].year_of_urajai==2019){
                System.out.println("Urazhai etogo goda:"+Ovachils[i].Name+"\n");
            }
        }
        for (i=0;i<Ovachils.length;i++){
            sum=sum+Ovachils[i].Weight;
        }System.out.println("Sum of weight of Ovochi : "+sum+"\n_------------------------------_");
        for (i=0;i<Ovachils.length;i++){
            System.out.println(Ovachils[i]);
        }
    }
}
class cls_ovachi{
    String Name;
    double Weight;
    int year_of_urajai;//angliskiym zhet pei kald ;-)
    public cls_ovachi(String name,double weight,int year_of_urajai){
        this.Name=name;
        this.Weight=weight;
        this.year_of_urajai=year_of_urajai;

    }

    public String getName() {
        return Name;
    }

    public double getWeight() {
        return Weight;
    }

    public int getYear_of_urajai() {
        return year_of_urajai;
    }

    @Override
    public String toString() {
        String desc="Name of vegetable: "+getName()+"\nWeight of vegetable: "+getWeight()+"\nCrop year of vegetable: "+getYear_of_urajai();
        return desc;
    }
    void Description(String name){
        if (name.equalsIgnoreCase(getName()))
            System.out.println(toString());
    }
}