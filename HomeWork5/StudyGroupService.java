package OOP.HomeWork5;

import java.util.List;

class StudyGroupService {
    public StudyGroup createStudyGroup(Teacher teacher, List<Student> students) {
        return new StudyGroup(teacher, students);
    }
}