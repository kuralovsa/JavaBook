import java.util.ArrayList;

public class Library {
    private String name;
    private String city;
    private ArrayList<Book> books=null;

    public Library(String name, String city) {
        this.name = name;
        this.city = city;
        books = new ArrayList<>();
    }
    public Book getBook(int index){
        return books.get(index);
    }
    public void removebook(int index){
        books.remove(index);
    }
    public void setBook( int index, Book b){
        books.set(index, b);
    }

    public int size(){
        return books.size();
    }

    public String getName() {
        return name;
    }

    public void addBook(Book b) {
        books.add(b);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setcity(String city) {
        this.city = city;
    }
}
