/**
 * Class Jay sandardy aralyktan terip aluga arnalgan
 */
public class ProsSan {
    public static void main(String[] args){
        int n=100;
        int i;
        int j;
        for (i=2;i<100;i++){
            int count=0;// count ka 0 maninberip otyramyz
            for (j=2;j<i;j++){
                if(i%j==0) {//Jay sandar tek ozyne gana kaldyksyz bolinui sharty
                    count+=1;//San kurama bolsa birdy mensikteydi
                }
            }
            if(count==0)System.out.println(i+" ");
        }
    }
}
