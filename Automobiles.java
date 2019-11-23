/**Main class Automobiles and all methods and options of this class
 * 1.Publish of the main class and add
 *
 *
 *
 * **/
public class Automobiles {
    String Model;
    String type;
    int Year_of_car ;
    /**konstruktor classa Automobiles **/
    public Automobiles(String Model,String type,int Year_of_car){
        this.Model=Model;
        this.type=type;
        this.Year_of_car=Year_of_car;
    }
    /**pustou konstruktor dlya reshenie problem s noslediem **/
    public Automobiles() {

    }

    public String getModel(){
        return Model;
    }

    public String getType() {
        return type;
    }

    public int getYear_of_car() {
        return Year_of_car;
    }

    public void setModel(String Model){
        this.Model=Model;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setYear_of_car(int year_of_car) {
        this.Year_of_car = year_of_car;
    }
    /** Vyvod informasi s pomoshu toString() **/
    public String toString(){
        StringBuilder A=new StringBuilder();
        A.append("\n Model of auto: "+getModel());
        A.append("\n Type of auto: "+getType());
        A.append("\n Year of car: "+getYear_of_car());
        return A.toString();
    }
    /** Chto to na podobie filtrasy vyvidimyh dannyh**/
    void Description(String Model){
        if (Model.equalsIgnoreCase(getModel())){
            System.out.println(toString());
        }
    }


}
/**Class kolesa avto i ego elements**/
class Wheel extends Automobiles {
    String type_Disk,Model;
    int Size_Disk;
    String Status_of_Disk;
    String Tire_model;
    String Size_Tire;
    String Status_of_Wheel;
    String Type_Disk;


    @SuppressWarnings("WeakerAccess")
    public Wheel(String model, String type_Disk, int size_Disk, String status_of_disk, String tire_model, String size_Tire, String status_of_Wheel){
        super.Model=model;
        this.Size_Tire=size_Tire;
        this.Size_Disk=size_Disk;
        this.Status_of_Disk=status_of_disk;
        this.Status_of_Wheel=status_of_Wheel;
        this.Tire_model=tire_model;
        this.Type_Disk=type_Disk;
    }


    public String getModel() {
        super.getModel();
        return Model;
    }

    public String getSize_Tire() {
        return Size_Tire;
    }

    public String getStatus_of_Disk() {
        return Status_of_Disk;
    }

    public String getStatus_of_Wheel() {
        return Status_of_Wheel;
    }

    public String getTire_model() {
        return Tire_model;
    }

    public String getType_Disk() {
        return type_Disk;
    }

    @Override
    public void setModel(String model) {
        Model = model;
    }

    public int getSize_Disk() {
        return Size_Disk;
    }

    public void setSize_Disk(int size_Disk) {
        this.Size_Disk = size_Disk;
    }

    public void setType_Disk(String type_Disk) {
        this.type_Disk = type_Disk;
    }

    public void setSize_Tire(String size_Tire) {
        this.Size_Tire=size_Tire;
    }

    public void setTire_model(String tire_model) {
        this.Tire_model = tire_model;
    }

    public void setStatus_of_Disk(String status_of_Disk) {
        this.Status_of_Disk=status_of_Disk;
    }

    public void setStatus_of_Wheel(String status_of_Wheel) {
        this.Status_of_Wheel = status_of_Wheel;
    }
    public String toString(){
        StringBuilder w=new StringBuilder();
        w.append("\n Size of Tire: "+getSize_Tire());
        w.append("\n Size of Disk: "+getSize_Disk());
        w.append("\n Модель диска: "+getStatus_of_Disk());
        w.append("\n Sostoyanie Shiny: "+getStatus_of_Wheel());
        w.append("\n Model Shiny: "+getTire_model());
        w.append("\n Type Diska: " +getType_Disk());
        return w.toString();
    }
    /** Chto to na podobie filtrasy vyvidimyh dannyh**/
    void Description(String model){
        if (model.equalsIgnoreCase(getModel())) {
            System.out.println(toString());
        }
        }

}

/**class dvigatel i ego osnovnye opisanie **/
class Engine extends Automobiles {
    double Size_of_Engine;
    String type_of_Engine,Model;
    int Power_of_Engine;
    String Status_of_Engine;
    @SuppressWarnings("WeakerAccess")
    public Engine(String model, String type_of_Engine, double size_of_Engine, int power_of_Engine, String status_of_Engine){
        super.Model=model;
        this.Power_of_Engine = power_of_Engine;
        this.Size_of_Engine = size_of_Engine;
        this.type_of_Engine=type_of_Engine;
        this.Status_of_Engine=status_of_Engine;
    }

    public String getModel() {
        super.getModel();
        return Model;
    }

    public double getSize_of_Engine() {
        return Size_of_Engine;
    }

    public int getPower_of_Engine() {
        return Power_of_Engine;
    }

    public String getType_of_Engine() {
        return type_of_Engine;
    }

    public String getStatus_of_Engine() {
        return Status_of_Engine;
    }

    @Override
    public void setModel(String model) {
        super.Model = model;
    }

    public void setPower_of_Engine(int power_of_Engine) {
        this.Power_of_Engine = power_of_Engine;
    }

    public void setSize_of_Engine(double size_of_Engine) {
        this.Size_of_Engine = size_of_Engine;
    }

    public void setType_of_Engine(String type_of_Engine) {
        this.type_of_Engine = type_of_Engine;
    }

    public void setStatus_of_Engine(String status_of_Engine) {
        this.Status_of_Engine=status_of_Engine;
    }

    @Override
    public String toString() {
        String e = "\n Marka Auto :" + getModel() +
                "\n Type dvigitelya: " + getType_of_Engine() +
                "\n L.s v dvizhke: " + getPower_of_Engine() +
                "\n Obem dvizhka: " + getSize_of_Engine() +
                "\n Sostoyanie Dvizhka: " + getStatus_of_Engine();
        return e;
    }

    void Description(String model){
        if (model.equalsIgnoreCase(getModel())){
            System.out.println(toString());
        }
    }
}
