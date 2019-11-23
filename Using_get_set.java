public class Using_get_set {
    private int s=154;
    void get(int s){
        this.s=s;
    }
    void set(){
        System.out.println("Chislo:"+this.s);
    }
}
class Using{
    public static void main(String[] args) {
        Using_get_set st=new Using_get_set();
        st.get(1000000);
        st.set();
    }
}
