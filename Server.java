public class Server {
    public static void main(String[] args){
        int n =99;
        int i ;
        int j ;
/**     int w;
 *      int z;
 *     */
        int[] array = {100};
        for ( i = 2; i < n; i++) {


        for ( j = i * i; j <= n; j += i) {
            if (j < n) break;
            array[j] = 1;
        }
        }
        for (i=2; i<=n ; i++){

            System.out.println(i);}

    }
}
