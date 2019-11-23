import java.util.Scanner;
import java.util.ArrayList;

public class App {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        Library lib = new Library("Abay","Almaty");
        int choose;

        while (true){
            System.out.println(lib.getName()+lib.getCity());
            System.out.println("1. Add book");
            System.out.println("2. View books");
            System.out.println("3. Remove books");
            System.out.println("4. Sort by name");
            System.out.println("5. Price sum of all books");
            System.out.println("0. Exit");
            choose=in.nextInt();
            if(choose==0){
                break;
            }
            else if(choose==1){
                System.out.print("Enter book name: ");
                String name;
                name=in.next();
                System.out.print("Enter book author: ");
                String author;
                author=in.next();
                System.out.print("Enter book isbn: ");
                int isbn=in.nextInt();
                System.out.print("Enter book price: ");
                int price=in.nextInt();
                lib.addBook(new Book(name,author,isbn,price ));
            }
            else if(choose==2){
                for(int i=0 ; i<lib.size(); i++){
                    System.out.println(lib.getBook(i));
                }
            }
            else if(choose==3){
                for(int i=0 ; i<lib.size();i++){
                    System.out.println((i+1)+" "+lib.getBook(i));
                    System.out.println("Number to book:");
                    int n=in.nextInt();
                    lib.removebook(n-1);
                }
            }
            else if(choose==4){
                for(int i=0 ; i<lib.size();i++){
                    for(int j=0 ; j<lib.size()-1;j++){
                        if(lib.getBook(i).getName().compareTo(lib.getBook(j).getName())>0){
                            Book s;
                            s=lib.getBook(i);
                            lib.setBook(i, lib.getBook(j));
                            lib.setBook(j,s );
                        }
                    }
                }
            }
            else if(choose==5){
                int sum=0;
                for(int i=0 ; i<lib.size();i++){
                    sum=sum+lib.getBook(i).getPrice();
                }
                System.out.println(sum);
            }
        }
    }
}
