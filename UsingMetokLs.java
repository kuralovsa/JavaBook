public class UsingMetokLs {
    public static void main(String[] args) {
        MyLabe:
        for (int i=0;i<100;i++){
            for (int j=0;j<100;j++){
                if (i!=j) continue ;
                if ((j%3==0)||(i%2==0)) break  ;
                if (i+j>20) break MyLabe;
                System.out.println(i+" : "+j);
            }
        }
    }
}
