package less4.controller;

import java.util.List;
import less4.model.Teacher;
import less4.model.User;
import less4.service.TeacherServise;
import less4.view.TeacherView;
import less4.view.UserView;

public class TeacherController implements UserController{

    private UserView<Teacher> view = new TeacherView();
    private TeacherServise service = new TeacherServise();

    @Override
    public <T extends User> User create(T user) {
        return user;
    }

    public void sendOnConsole(List<Teacher> teachers) {
        view.sendOnConsole(teachers);
    }

    public Teacher editTeacher(int id, String name, String lastName) throws Exception{

        return service.editTeacher(id, name, lastName);        
    }

}
