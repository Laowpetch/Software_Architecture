import java.util.List;

public class MainReader {
    public static void main(String[] args) {
        Book book = new Book("Tyland",
                List.of("I", "moved", "here", "recently", "too"));

        BookPrinter bookPrinter = new BookPrinter(book);
        BookReader reader = new BookReader(bookPrinter);
        reader.printToScreen();
    }
}