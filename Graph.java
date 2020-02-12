package First_pattern_projekt;

public class Graph extends Kingdom_members {
    @Override
    public void getStatus(String Status) {
        super.getStatus(Status);
    }
    public Graph(String status){
        getStatus(status);
    }

    public static void main(String[] args) {
        Graph graph = new Graph("Graph");
    }
}
