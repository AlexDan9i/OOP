package OOP.HomeWork4;

public class Main {
    public static void main(String[] args) {
        TeacherController controller = new TeacherController();

        controller.createTeacher("Иван Иванов", "Математика");
        controller.createTeacher("Мария Петрова", "Физика");

        controller.showAllTeachers();

        controller.editTeacher(1, "Иван Сидоров", null);
        
        controller.showAllTeachers();
    }
}