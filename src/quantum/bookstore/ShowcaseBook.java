package quantum.bookstore;

public class ShowcaseBook extends Book {
    public ShowcaseBook(String isbn,String title,int year,String authorName) {
        super(isbn,title,year, 0.0,authorName);
    }
    public int availableStock() {
        return 0;
    }
    public double buy(int qty) {
        throw new UnsupportedOperationException("Quantum book store: not for sale");
    }
    public void deliver(int qty,String email,String address) {
    }
}
