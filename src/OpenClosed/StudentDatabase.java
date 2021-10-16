package OpenClosed;

import OpenClosed.Good.StudentQuery;
import OpenClosed.Student;

public class StudentDatabase {
    public static final Student[] students = new Student[]{
            new Student(1, null, "Zuckerberg", 34, "San Francisco"),
            new Student(2, "Jamie", null, 23, "London"),
            new Student(3, "Clint", "Eastwood", 77, "San Francisco"),
            new Student(4, null, null, 25, "Austin"),
            new Student(5, "Ariana", "Grande", 21, null),
    };
}
