package First_pattern_projekt;

public class Gentleman extends Kingdom_members {
    @Override
    public void getStatus(String Status) {
        super.getStatus(Status);
    }
    public Gentleman(String status){
        getStatus(status);
    }

    @Override
    public String toString() {
        String Gentleman="A Gentleman - originally the so-called landless nobles, who had nothing but a \ntitle behind their souls, but later, they began to call all the nobles in general.";
        return Gentleman;
    }

    public static void main(String[] args) {
        Gentleman gentleman = new Gentleman("Gentleman");
        System.out.println(gentleman.toString());
    }
}
