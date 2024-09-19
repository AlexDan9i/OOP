package OOP.HomeWork7;

import java.util.Scanner;

public class ComplexCalculatorController {
    private ComplexCalculator calculator;

    public ComplexCalculatorController(ComplexCalculator calculator) {
        this.calculator = calculator;
    }

    public void start() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите действительную и мнимую часть первого числа:");
            ComplexNumber a = new ComplexNumber(scanner.nextDouble(), scanner.nextDouble());

            System.out.println("Введите действительную и мнимую часть второго числа:");
            ComplexNumber b = new ComplexNumber(scanner.nextDouble(), scanner.nextDouble());

            System.out.println("Выберите операцию (+, *, /):");
            String operationType = scanner.next();

            Operation operation = OperationFactory.createOperation(operationType);
            ComplexNumber result = calculator.calculate(a, b, operation);

            System.out.println("Результат: " + result);
        }
    }
}