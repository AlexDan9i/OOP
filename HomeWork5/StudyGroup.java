package OOP.HomeWork5;

import java.util.List;

class StudyGroup {
    private Teacher teacher;
    private List<Student> students;

    public StudyGroup(Teacher teacher, List<Student> students) {
        this.teacher = teacher;
        this.students = students;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public List<Student> getStudents() {
        return students;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(teacher).append("\n");
        sb.append("Список студентов:\n");
        for (Student student : students) {
            sb.append(student).append("\n");
        }
        return sb.toString();
    }
}