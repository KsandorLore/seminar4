package less4.data;

import java.util.ArrayList;
import java.util.List;
import less4.model.Student;
import less4.model.Teacher;

public class DataBase {

    public static final List<Student> studentsDB = new ArrayList<>();

    public static final List<Teacher> teachersDB = new ArrayList<>();

    public static void fillDB(){
        Teacher t1 = new Teacher(1, "Alexey", "Petrov");
        Teacher t2 = new Teacher(2, "Lena", "Petrova");
        teachersDB.add(t1);
        teachersDB.add(t2);
        Student s1 = new Student(1, "Sasha", "Ivanov");
        Student s2 = new Student(2, "Ira", "Ivanova");
        studentsDB.add(s1);
        studentsDB.add(s2);
    }
}
