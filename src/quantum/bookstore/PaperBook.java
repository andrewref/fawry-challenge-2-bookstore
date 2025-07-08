package quantum.bookstore;

public class PaperBook extends Book {
    private int stock;

    public PaperBook(String isbn,String title,int year,double price,String authorName,int stock) {
        super(isbn,title, year,price,authorName);
        this.stock = stock;
    }
    public int availableStock() {
        return stock;
    }
    public double buy(int qty) {
        if (qty <= 0) {
            throw new IllegalArgumentException("Quantity must be positive");
        }
        if (qty > stock) {
            throw new IllegalStateException("Quantum book store: stock too low");
        }
        stock -= qty;
        return price * qty;
    }
    public void deliver(int qty,String email,String address) {
        ShippingService.ship(this, qty, address);
    }
}
