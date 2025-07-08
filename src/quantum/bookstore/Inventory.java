package quantum.bookstore;

import java.util.*;

public class Inventory {
    private final Map<String, Book> books =new HashMap<>();

    public void addBook(Book book) {
        books.put(book.getIsbn(), book);
        System.out.println("Quantum book store: added " +book.getTitle());
    }
    public List<Book> removeOutdatedBooks(int years) {
        List<Book> removed = new ArrayList<>();
        Iterator<Book> it = books.values().iterator();
        while (it.hasNext()) {
            Book b = it.next();
            if (b.isOutdated(years)) {
                removed.add(b);
                it.remove();
                System.out.println("Quantum book store: removed " +b.getTitle());
            }
        }
        return removed;
    }
    public double buyBook(String isbn,int qty,String email,String address) {
        Book b = books.get(isbn);
        if (b == null) {
            throw new NoSuchElementException("Quantum book store: ISBN not found");
        }
        double total = b.buy(qty);
        b.deliver(qty, email, address);
        System.out.println("Quantum book store: paid " + total);
        return total;
    }
    public void listBooks() {
        for (Book book : books.values()) {
            System.out.println("Quantum book store: "+book.getIsbn()+ " " +book.getTitle()+" by "+book.getAuthorName());
        }
    }
}
