package OOP.HomeWork7;

import java.util.logging.Logger;
import java.util.logging.Level;

public class ComplexCalculator {
    private static final Logger logger = Logger.getLogger(ComplexCalculator.class.getName());

    public ComplexNumber calculate(ComplexNumber a, ComplexNumber b, Operation operation) {
        logger.log(Level.INFO, "Выполняется операция: {0} с числами {1} и {2}",
                new Object[] { operation.getClass().getSimpleName(), a, b });
        ComplexNumber result = operation.execute(a, b);
        logger.log(Level.INFO, "Результат операции: {0}", result);
        return result;
    }
}