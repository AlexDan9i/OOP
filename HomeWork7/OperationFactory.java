package OOP.HomeWork7;

public class OperationFactory {
    public static Operation createOperation(String operationType) {
        switch (operationType.toLowerCase()) {
            case "+":
                return new Addition();
            case "*":
                return new Multiplication();
            case "/":
                return new Division();
            default:
                throw new IllegalArgumentException("Неизвестная операция: " + operationType);
        }
    }
}