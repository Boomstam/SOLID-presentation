package OpenClosed.Good;

public class PrintStudentsApp {
    private static final StudentQuery studentQuery = new StudentFormatter();

    public static void main(String[] args) {
        for (String formattedStudent : studentQuery.getFormattedStudents()) {
            System.out.println(formattedStudent);
        }
    }
}
