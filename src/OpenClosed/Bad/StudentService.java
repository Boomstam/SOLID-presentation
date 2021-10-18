package OpenClosed.Bad;

import OpenClosed.Student;
import OpenClosed.StudentDatabase;

public class StudentService {
    public Student[] getStudents(){
        return StudentDatabase.students;
    }

    public static String formatName(Student student){
        String name = "Unknown";
        if(student.getFirstName() == null && student.getLastName() == null) return name;
        if(student.getFirstName() == null) return student.getLastName();
        if(student.getLastName() == null) return student.getFirstName();
        return student.getFirstName() + " " + student.getLastName();
    }

    public static String formatCity(Student student){
        if(student.getCity() == null) return "Unknown";
        return student.getCity();
    }
}
