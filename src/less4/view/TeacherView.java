package less4.view;

import java.util.List;
import less4.model.Teacher;

public class TeacherView implements UserView<Teacher> {

    @Override
    public void sendOnConsole(List<Teacher> teachers) {
        System.out.println(teachers);
    }

}
