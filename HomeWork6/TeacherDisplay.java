package OOP.HomeWork6;

// Создаем интерфейс для отображения
interface TeacherDisplay {
    void displayTeacher(Teacher teacher);
}

// Реализация отображения в консоль
class ConsoleTeacherDisplay implements TeacherDisplay {
    @Override
    public void displayTeacher(Teacher teacher) {
        if (teacher != null) {
            System.out.println("Информация о учителе: " + teacher);
        } else {
            System.out.println("Учитель не найден.");
        }
    }
}