// Новый класс TeacherRepository отвечает только за хранение учителей.
package OOP.HomeWork6;

import java.util.List;
import java.util.ArrayList;

class TeacherRepository {
    private List<Teacher> teachers;
    private int nextId;

    public TeacherRepository() {
        teachers = new ArrayList<>();
        nextId = 1;
    }

    public Teacher addTeacher(String name, String subject) {
        Teacher teacher = new Teacher(nextId++, name, subject);
        teachers.add(teacher);
        return teacher;
    }

    public Teacher findTeacherById(int id) {
        for (Teacher teacher : teachers) {
            if (teacher.getId() == id) {
                return teacher;
            }
        }
        return null;
    }

    public List<Teacher> findAllTeachers() {
        return teachers;
    }
}