package First_pattern_projekt;

public class Queen extends Kingdom_members {
    @Override
    public void getStatus(String Status) {//import the method get Status
        super.getStatus(Status);
    }
    public Queen(String status){//realisations the method get Status
        getStatus(status);
    }

    @Override
    public String toString() {
        String Queen="The female ruler of an independent state, especially \none who inherits the position by right of birth.";
        return Queen;
    }

    public static void main(String[] args) {// enter the Status of the kingdom member
        Queen Q= new Queen("Queen");
        System.out.println(Q.toString());
    }
}
