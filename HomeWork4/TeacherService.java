package OOP.HomeWork4;

import java.util.ArrayList;
import java.util.List;

class TeacherService {
    private List<Teacher> teachers;
    private int nextId;

    public TeacherService() {
        teachers = new ArrayList<>();
        nextId = 1;
    }

    public Teacher createTeacher(String name, String subject) {
        Teacher teacher = new Teacher(nextId++, name, subject);
        teachers.add(teacher);
        return teacher;
    }

    public Teacher editTeacher(int id, String newName, String newSubject) {
        for (Teacher teacher : teachers) {
            if (teacher.getId() == id) {
                if (newName != null) {
                    teacher.setName(newName);
                }
                if (newSubject != null) {
                    teacher.setSubject(newSubject);
                }
                return teacher;
            }
        }
        return null;
    }

    public List<Teacher> getAllTeachers() {
        return teachers;
    }
}

class TeacherView {

    public void showAllTeachers(List<Teacher> teachers) {
        if (teachers.isEmpty()) {
            System.out.println("Список учителей пуст.");
        } else {
            System.out.println("Список учителей:");
            for (Teacher teacher : teachers) {
                System.out.println(teacher);
            }
        }
    }

    public void showTeacher(Teacher teacher) {
        if (teacher != null) {
            System.out.println("Информация о учителе: " + teacher);
        } else {
            System.out.println("Учитель не найден.");
        }
    }
}