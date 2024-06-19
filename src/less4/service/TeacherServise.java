package less4.service;

import java.util.List;
import less4.data.DataBase;
import less4.model.Teacher;

public class TeacherServise {

    public Teacher createTeacher(int id, String name, String last) {

        Teacher teacher = new Teacher(id, name, last);

        DataBase.teachersDB.add(teacher);
        return teacher;
    }

    public static List<Teacher> getTeachers() {
    
    return DataBase.teachersDB;
    
    }

    public Teacher editTeacher(int id, String name, String last) throws Exception{

        Teacher teacher = DataBase.teachersDB.stream()
        .filter(t -> t.getId() == id).findFirst().orElse(null);    
        if (teacher == null) {
            throw new Exception("Teacher not found");
        }
        teacher.name = name;
        teacher.lastName = last;

        
        return teacher;
    }

}
