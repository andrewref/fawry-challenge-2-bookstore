package quantum.bookstore;

import java.time.Year;

public abstract class Book {
    protected String isbn;
    protected String title;
    protected int yearPublished;
    protected double price;
    protected String authorName;

    public Book(String isbn,String title,int yearPublished,double price,String authorName) {
        this.isbn = isbn;
        this.title = title;
        this.yearPublished = yearPublished;
        this.price = price;
        this.authorName = authorName;
    }
    public String getIsbn() {
        return isbn;
    }
    public String getTitle() {
        return title;
    }
    public int getYearPublished() {
        return yearPublished;
    }
    public double getPrice() {
        return price;
    }
    public String getAuthorName() {
        return authorName;
    }
    public boolean isOutdated(int years) {
        int currentYear =Year.now().getValue();
        return currentYear - yearPublished > years;
    }
    public abstract int availableStock();

    public abstract double buy(int qty);

    public abstract void deliver(int qty,String email,String address);
}
