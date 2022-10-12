public class BookReader implements BookScreenPrinter {
    private BookPrinter adaptee;

    public BookReader(BookPrinter adaptee) {
        super();
        this.adaptee = adaptee;
    }

    @Override
    public void printToScreen() {
        adaptee.printToScreen();
    }
}