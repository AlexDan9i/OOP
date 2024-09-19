// TeacherService будет отвечать только за бизнес-логику, оставив хранение данных классу TeacherRepository.
package OOP.HomeWork6;

import java.util.List;

class TeacherService {
    private TeacherRepository teacherRepository;

    public TeacherService(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    public Teacher createTeacher(String name, String subject) {
        return teacherRepository.addTeacher(name, subject);
    }

    public Teacher editTeacher(int id, String newName, String newSubject) {
        Teacher teacher = teacherRepository.findTeacherById(id);
        if (teacher != null) {
            if (newName != null) {
                teacher.setName(newName);
            }
            if (newSubject != null) {
                teacher.setSubject(newSubject);
            }
        }
        return teacher;
    }

    public List<Teacher> getAllTeachers() {
        return teacherRepository.findAllTeachers();
    }
}