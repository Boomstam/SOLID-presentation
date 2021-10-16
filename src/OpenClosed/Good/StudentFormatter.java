package OpenClosed.Good;

import OpenClosed.Student;
import OpenClosed.StudentDatabase;

import java.util.ArrayList;

public class StudentFormatter implements StudentQuery{

    @Override
    public String[] getFormattedStudents() {
        ArrayList<String> formattedStudents = new ArrayList<>();
        for (Student student : StudentDatabase.students) {
            String formattedStudent = student.getId() + ", ";
            formattedStudent += formatName(student) + ", ";
            formattedStudent += student.getAge() + ", ";
            formattedStudent += formatCity(student);
            formattedStudents.add(formattedStudent);
        }
        return formattedStudents.toArray(new String[0]);
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
