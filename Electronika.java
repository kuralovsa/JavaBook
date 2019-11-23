import java.util.Scanner;

public class Electronika {
    public static void main(String[] args) {
        Asus as=new Asus();
        Scanner sc= new Scanner(System.in);
        System.out.println("Vvodyte imia proizvoditelia: ");
        String n = sc.nextLine();
        as.Description(n);
    }
}
interface Company_products{
    void getCompany_name();

    void getproducts();



    void price_of_products();

}

class Asus implements Company_products{
    String company_name="ASUS";
    String products;
    double prices;

    @Override
    public void getCompany_name() {
        this.company_name="Asus";
    }

    @Override
    public void getproducts() {
        this.products="Printer "+this.company_name+"rp305x. "+"Price of product: "+(this.prices=120000)+" tg"
                +"\n Laptop"+this.company_name+" Nitro N5. "+"Price of product: "+(this.prices=353990.00)+" tg"
                +"\n Any think"+this.company_name+" any model. "+"Price of product: "+(this.prices=3.00)+" tg" ;
    }

    @Override
    public void price_of_products() {

    }

    public String getProducts() {
        return this.products="Printer "+this.company_name+"rp305x. "+"Price of product: "+(this.prices=120000)+" tg"
                +"\n Laptop"+this.company_name+" Nitro N5. "+"Price of product: "+(this.prices=353990.00)+" tg"
                +"\n Any think "+this.company_name+" any model. "+"Price of product: "+(this.prices=3.00)+" tg" ;
    }

    void Description(String company_name){
    if (company_name.equalsIgnoreCase(this.company_name));
        System.out.println("Company name:"+this.company_name+"\nCompany products:"+getProducts());
    }
}
