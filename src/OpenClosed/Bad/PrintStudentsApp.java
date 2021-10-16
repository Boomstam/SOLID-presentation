package OpenClosed.Bad;

import OpenClosed.Student;
import OpenClosed.StudentDatabase;

public class PrintStudentsApp {
    public static void main(String[] args) {
        for (Student student : StudentDatabase.students) {
            String formattedStudent = student.getId() + ", ";
            formattedStudent += formatName(student) + ", ";
            formattedStudent += student.getAge() + ", ";
            formattedStudent += formatCity(student);
            System.out.println(formattedStudent);
        }
    }

    private static String formatName(Student student){
        String name = "Unknown";
        if(student.getFirstName() == null && student.getLastName() == null) return name;
        if(student.getFirstName() == null) return student.getLastName();
        if(student.getLastName() == null) return student.getFirstName();
        return student.getFirstName() + " " + student.getLastName();
    }

    private static String formatCity(Student student){
        if(student.getCity() == null) return "Unknown";
        return student.getCity();
    }
}
