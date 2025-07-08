package quantum.bookstore;

public class QuantumBookstoreFullTest {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        Book paper = new PaperBook("PB001", "Java Fundamentals", 2012, 150.0, "Youssef Sherif", 8);
        Book ebook = new EBook("EB001", "Machine Learning", 2021, 95.0, "Samy Hany", "pdf");
        Book showcase = new ShowcaseBook("SH001", "Rare Manuscript", 1890, "Dr. Mido");

        inventory.addBook(paper);
        inventory.addBook(ebook);
        inventory.addBook(showcase);

        inventory.listBooks();
        System.out.println();

        inventory.removeOutdatedBooks(50);
        System.out.println();

        inventory.buyBook("PB001", 2, "reader@example.com", "456 Nile Street");
        inventory.buyBook("EB001", 1, "reader@example.com", null);
        System.out.println();

        inventory.listBooks();
    }
}