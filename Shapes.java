import java.util.Scanner;

class MyClass {
    int Re;
    Scanner sc=new Scanner(System.in);
    int s=sc.nextInt();
        void set(int Re,int s){
// Использование ссылки this:
            this.Re=Re;
        }
        void get(){
// Инструкция перехода на новую строку \n:
            int i=0;
            for(i=1;i<=s;i++) this.Re=this.Re*i;
            System.out.println("Значения полей:\nRe="+this.Re+"!");
        }

    static class ThisDemo{
        public static void main(String[] args){
            MyClass obj=new MyClass();
            System.out.println("Chislo factoriala:");
            obj.set(1,obj.s);
            obj.get();}

    }
}
