public class Smena_elementov_massiva {
    public static void main(String[] args) {
        int n=3;
        int[] array={11,3,6};
        int[] temp_array=new int[n];

        for(int i=0;i<=n;i++){
            if (i==0){
                temp_array[0]=array[2];
                System.out.print("New array:"+temp_array[i]+" ");
            }
            if (i==1) {
                temp_array[1]=array[1];
                System.out.print(temp_array[i]+" ");
            }
            if (i==2){
                temp_array[2]=array[0];
                System.out.print(temp_array[i]+" ");
                array[0]=temp_array[0];
                array[1]=temp_array[1];
                array[2]=temp_array[2];
                System.out.println("New line:"+array[0]+" "+array[1]+" "+array[2]);
                break;
            }
        }
        for (int j=0;j<=2;j++) System.out.print("Old array:"+j+"-index :"+array[j]+"  ");
    }
}
