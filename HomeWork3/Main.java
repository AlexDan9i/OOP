package OOP.HomeWork3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Создаем учебные группы
        StudyGroup group1 = new StudyGroup("Group 1");
        StudyGroup group2 = new StudyGroup("Group 2");
        StudyGroup group3 = new StudyGroup("Group 3");
        StudyGroup group4 = new StudyGroup("Group 4");

        // Создаем потоки
        Stream stream1 = new Stream(List.of(group1, group2));
        Stream stream2 = new Stream(List.of(group3));
        Stream stream3 = new Stream(List.of(group4, group1, group3));

        // Создаем список потоков
        List<Stream> streams = new ArrayList<>();
        streams.add(stream1);
        streams.add(stream2);
        streams.add(stream3);

        // Создаем контроллер и сортируем потоки
        Controller controller = new Controller();
        controller.sortStreams(streams);

        // Выводим результат
        for (Stream stream : streams) {
            System.out.println("Поток с " + stream.getGroupCount() + " группами");
        }
    }
}