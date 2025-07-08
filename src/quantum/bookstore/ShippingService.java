package quantum.bookstore;

public class ShippingService {
    public static void ship(PaperBook book,int qty,String address) {
        System.out.println("Quantum book store: shipping " + qty +" of " + book.getTitle() +" to " + address);
    }
}
