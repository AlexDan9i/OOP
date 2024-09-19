package OOP.HomeWork6;

import java.util.List;

class TeacherController {
    private TeacherService teacherService;
    private TeacherView teacherView;

    public TeacherController(TeacherService teacherService, TeacherView teacherView) {
        this.teacherService = teacherService;
        this.teacherView = teacherView;
    }

    public void createTeacher(String name, String subject) {
        Teacher teacher = teacherService.createTeacher(name, subject);
        System.out.println("Учитель " + teacher.getName() + " успешно добавлен.");
    }

    public void editTeacher(int id, String newName, String newSubject) {
        Teacher teacher = teacherService.editTeacher(id, newName, newSubject);
        if (teacher != null) {
            System.out.println("Учитель с ID " + id + " успешно обновлен.");
        } else {
            System.out.println("Учитель с ID " + id + " не найден.");
        }
    }

    public void showAllTeachers() {
        List<Teacher> teachers = teacherService.getAllTeachers();
        teacherView.showAllTeachers(teachers);
    }
}