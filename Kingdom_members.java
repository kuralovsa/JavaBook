package First_pattern_projekt;

public abstract class Kingdom_members implements Kingdom_system {
    @Override
    public void getStatus(String Status) {
        System.out.println("The Kingdom member status is '"+Status+"' !");
    }
}
