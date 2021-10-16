package SingleResponsibility;

public class Application {
    private static final TimeCheckPrinter timeCheckPrinter = new TimeCheckPrinter();

    public static void main(String[] args) {
        timeCheckPrinter.printTimeCheck();
    }
}
