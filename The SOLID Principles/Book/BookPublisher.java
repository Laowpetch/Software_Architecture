public class BookPublisher implements BookFilePrinter {
    private BookPrinter adaptee;

    public BookPublisher(BookPrinter adaptee) {
        super();
        this.adaptee = adaptee;
    }

    @Override
    public void printToFile() {
        adaptee.printToFile();
    }
}