package OOP.HomeWork6;

import java.util.List;

class TeacherView {
    private TeacherDisplay teacherDisplay;

    public TeacherView(TeacherDisplay teacherDisplay) {
        this.teacherDisplay = teacherDisplay;
    }

    public void showTeacher(Teacher teacher) {
        teacherDisplay.displayTeacher(teacher);
    }

    public void showAllTeachers(List<Teacher> teachers) {
        if (teachers.isEmpty()) {
            System.out.println("Список учителей пуст.");
        } else {
            for (Teacher teacher : teachers) {
                teacherDisplay.displayTeacher(teacher);
            }
        }
    }
}
