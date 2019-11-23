import java.util.Scanner;
 class Notebook {
    Scanner sc=new Scanner(System.in);
    double day;
    int month;
    int year;
    String text;

    public double getDay() {
        return day;
    }

    private double getDate(double day, int month, int year) {
        return getDate(day, month, year);
    }

    public Notebook(double day, int month, int year,String text){
        this.text=text;
        this.year=year;
        this.day=day;
        this.month=month;

    }

    public String getText() {
        return text;
    }

    public String toString(){
        StringBuilder a=new StringBuilder();
        a.append("in the data : "+this.day+"."+this.month+"."+this.year
                +"\n Text:"+getText());
        return a.toString();
    }
    public void Description(double day){

    }


    static class MyInner{
        public static void main(String[] args) {
          Notebook n=new Notebook(12,12,2019,"I can code!");
            System.out.println(n.toString());

        }
    }
}
