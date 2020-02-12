package First_pattern_projekt;

public class Duke extends Kingdom_members {
    @Override
    public void getStatus(String Status) {//import the method get Status
        super.getStatus(Status);
    }
    public Duke(String status){//realisations the method get Status
        getStatus(status);
    }

    @Override
    public String toString() {
        String Duke="The duke - (the old nem. Herizogo \"der vor dem Heer zieht\" - \"going before the army\") \nthe dukes were relatives of the royal family, only they could have this title. That is, all \nthe dukes are members of the royal family, no matter what the seventh water on jelly they are.\n" +
                "Appeal: Your Grace.";
        return Duke;
    }

    public static void main(String[] args) {// enter the Status of the kingdom member
        Duke duke = new Duke("Duke");
        System.out.println(duke.toString());
    }
}
