public class Sum_of_kind_num {
    public static void main(String[] args) {
        int number=1114;
        int g=0;
        int t=0;
        int[] temp_array=new int[4];
        int d=0;
       for (int j=4;1<=j;j--){
            temp_array[0]=number%(int)Math.pow(10,j);
            g=number%(int)Math.pow(10,j-(j-1));
            System.out.println("D0="+temp_array[0]+" "+((int)Math.pow(10,j)));
        }
       for (int j=4;1<=j;j--){
            temp_array[1]=(number-temp_array[0])/(int)Math.pow(10,j);
            if(temp_array[1]!=0) {temp_array[1]=(number-temp_array[0])/(int)Math.pow(10,j);
                System.out.println("D1="+temp_array[1]);
                t=temp_array[1];
                break;

            }g=temp_array[1];
            if (g!=t || t!=0){
                temp_array[2]=temp_array[1];
                System.out.println("D2="+temp_array[2]);
            }
        }
        int[] n={1,1,0,5,5,5};
        int count=0,s=0,k=0;
        for(int i=0;i<n.length;i++){
            if (n[0]==n[i]){
                count+=1;
                System.out.println("Sum of "+n[0]+"="+count);
            }
            else if(n[count]==n[i]){
                s+=1;
                System.out.println("Sum of "+n[i]+"="+s);
            }
            else if (n[s+count]==n[i]){
                k+=1;
                System.out.println("Sum of "+n[s+count]+"="+k);
            }
        }
    }
}
