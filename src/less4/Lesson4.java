package less4;

import less4.controller.TeacherController;
import less4.data.DataBase;
import less4.service.TeacherServise;
import static less4.service.TeacherServise.getTeachers;

public class Lesson4 {

    public static void main(String[] args) throws Exception {
    DataBase.fillDB();
        // new StudentController()
        //         .sendOnConsole(List.of(new Student(1, "Sasha", "Ivanov"),
        //                 new Student(1, "Ira", "Ivanova")));
        
        new TeacherController().sendOnConsole(getTeachers());
        new TeacherServise().createTeacher(3, "Vitaliy", "Pupkin");
        new TeacherController().editTeacher(1, "Leonid", "Nemov");
        new TeacherController().sendOnConsole(getTeachers());
    }
    

    // public static List<Teacher> getTeachers() {
    //    Teacher t1 = new Teacher(1, "Alex", "Petrov");
    //    Teacher t2 = new Teacher(1, "Lena", "Petrova");
    //    return List.of(t1, t2);
   //}
}
