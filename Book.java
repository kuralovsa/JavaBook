public class Book {
    private String name;
    private String author;
    private int isbn;
    private int price;

    public Book(){}
    public Book(String name, String author, int isbn, int price) {
        this.name = name;
        this.author = author;
        this.isbn = isbn;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getIsbn() {
        return isbn;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Book {" +
                "name: " + name +
                "; author: " + author +
                "; isbn: " + isbn +
                "; price: " + price + '}';
    }
}
