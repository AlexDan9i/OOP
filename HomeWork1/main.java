package OOP.HomeWork1;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        HotDrink tea = new HotDrink("Tea", 250, 80);
        HotDrink coffee = new HotDrink("Coffee", 200, 90);
        HotDrink hotChocolate = new HotDrink("Hot Chocolate", 300, 70);

        HotDrinkVenMachine vendingMachine = new HotDrinkVenMachine();
        vendingMachine.addHotDrink(tea);
        vendingMachine.addHotDrink(coffee);
        vendingMachine.addHotDrink(hotChocolate);

        Scanner scanner = new Scanner(System.in);
        String name;
        int volume;
        int temperature;

        while (true) {
            System.out.print("Введите название напитка: ");
            name = scanner.nextLine();

            while (true) {
                System.out.print("Введите объем напитка (в мл): ");
                String volumeInput = scanner.nextLine();
                if (volumeInput.isEmpty()) {
                    System.out.println("Объем не может быть пустым! Пожалуйста, введите объем.");
                    continue;
                }
                try {
                    volume = Integer.parseInt(volumeInput);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Некорректный ввод! Пожалуйста, введите числовое значение.");
                }
            }

            while (true) {
                System.out.print("Введите температуру напитка (в °C): ");
                String temperatureInput = scanner.nextLine();
                if (temperatureInput.isEmpty()) {
                    System.out.println("Температура не может быть пустой! Пожалуйста, введите температуру.");
                    continue;
                }
                try {
                    temperature = Integer.parseInt(temperatureInput);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Некорректный ввод! Пожалуйста, введите числовое значение.");
                }
            }

            HotDrink requestedDrink = vendingMachine.getProduct(name, volume, temperature);

            if (requestedDrink != null) {
                System.out.println("Выдан напиток: " + requestedDrink);
                break;
            } else {
                System.out.println("Такой напиток не найден. Пожалуйста, попробуйте снова.");
            }
        }

        scanner.close();
    }
}
