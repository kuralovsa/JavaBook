package First_pattern_projekt;

public class Prince extends Kingdom_members {
    @Override
    public void getStatus(String Status) {//import the method get Status
        super.getStatus(Status);
    }
    public Prince(String status){//realisations the method get Status
        getStatus(status);
    }

    @Override
    public String toString() {
        String Prince="Prince - (German: Prinz, English and French. Prince, Spanish. Principe, from lat. Princeps - first)\n" +
                "One of the highest titles of members of the aristocracy. At present, the correspondence of the term “prince” \nin Western European languages is used both in the generalized abstract sense (“sovereign”, “monarch”), \nand in several specific meanings. The female version of the title is the princess, \nbut princesses are also called princesses.\n" +
                "Address: Your Highness.";
        return Prince;
    }

    public static void main(String[] args) {// enter the Status of the kingdom member
        Prince prince = new Prince("Prince");
        System.out.println(prince.toString());
    }
}
