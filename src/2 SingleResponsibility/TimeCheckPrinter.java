package SingleResponsibility;

public class TimeCheckPrinter {
    private SystemQuery systemQuery = new SystemQuery();

    public void printTimeCheck() {
        System.out.println("Hi, " + systemQuery.getUsername());
        System.out.println("It is now " + systemQuery.getTimeStamp());
    }
}
