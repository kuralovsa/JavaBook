package First_pattern_projekt;

public class Princess extends Kingdom_members {
    @Override
    public void getStatus(String Status) {//import the method get Status
        super.getStatus(Status);
    }
    public Princess(String status){//realisations the method get Status
        getStatus(status);
    }

    public static void main(String[] args) {
        Princess princess = new Princess("Princess");// enter the Status of the kingdom member
    }
}
