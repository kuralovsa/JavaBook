package First_pattern_projekt;

public class Marquis extends Kingdom_members {
    @Override
    public void getStatus(String Status) {
        super.getStatus(Status);
    }
    public Marquis(String status){
        getStatus(status);
    }

    public static void main(String[] args) {
        Marquis marquis = new Marquis("Marquis");
    }
}
