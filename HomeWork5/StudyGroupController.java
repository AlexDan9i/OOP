package OOP.HomeWork5;

import java.util.List;

class StudyGroupController {
    private StudyGroupService studyGroupService;

    public StudyGroupController() {
        this.studyGroupService = new StudyGroupService();
    }

    public StudyGroup formStudyGroup(Teacher teacher, List<Student> students) {
        return studyGroupService.createStudyGroup(teacher, students);
    }

    public List<Student> getStudents() {
        return List.of(
                new Student(1, "Иван Иванов"),
                new Student(2, "Петр Петров"),
                new Student(3, "Алексей Сидоров"));
    }

    public Teacher getTeacher() {
        return new Teacher(1, "Андрей Андреев");
    }

    public void showStudyGroup() {
        Teacher teacher = getTeacher();
        List<Student> students = getStudents();
        StudyGroup group = formStudyGroup(teacher, students);
        System.out.println(group);
    }
}