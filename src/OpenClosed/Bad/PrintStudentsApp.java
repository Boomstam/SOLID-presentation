package OpenClosed.Bad;

import OpenClosed.Student;

public class PrintStudentsApp {
    private static final StudentService studentService = new StudentService();

    public static void main(String[] args) {
        for (Student student : studentService.getStudents()) {
            String formattedStudent = student.getId() + ", ";
            formattedStudent += studentService.formatName(student) + ", ";
            formattedStudent += student.getAge() + ", ";
            formattedStudent += studentService.formatCity(student);
            System.out.println(formattedStudent);
        }
    }
}
