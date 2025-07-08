package quantum.bookstore;

public class EBook extends Book {
    private String fileType;

    public EBook(String isbn,String title,int year,double price,String authorName,String fileType) {
        super(isbn,title, year,price,authorName);
        this.fileType = fileType;
    }
    public String getFileType() {
        return fileType;
    }
    public int availableStock() {
        return Integer.MAX_VALUE;
    }
    public double buy(int qty) {
        if (qty != 1) {
            throw new IllegalArgumentException("Quantum book store: only one copy per purchase");
        }
        return price;
    }
    public void deliver(int qty,String email,String address) {
        MailService.send(this, email);
    }
}
