package quantum.bookstore;

public class MailService {
    public static void send(EBook book,String email) {
        System.out.println("Quantum book store: emailing " + book.getTitle() +" to " + email);
    }
}
