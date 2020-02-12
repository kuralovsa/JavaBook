package First_pattern_projekt;

public class King extends Kingdom_members {
    String status;
    @Override
    public void getStatus(String Status) {//import the method get Status
        super.getStatus(Status);
        this.status=Status;
    }
    public King(String status){//realisations the method get Status
        this.status=status;
        getStatus(status);
    }

    @Override
    public String toString() {
        String King="the male ruler of an independent state, especially \none who inherits the position by right of birth.";
        return King;
    }

    public static void main(String[] args) {// enter the Status of the kingdom member
        King k= new King("King");
        System.out.println(k.toString());
    }
}
