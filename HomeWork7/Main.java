package OOP.HomeWork7;

public class Main {
    public static void main(String[] args) {
        ComplexCalculator calculator = new ComplexCalculator();
        ComplexCalculatorController controller = new ComplexCalculatorController(calculator);
        controller.start();
    }
}