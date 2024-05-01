package task6;

public class MathOperations {

    public double calculateResult(double x, double y) {
        double product = x * y;
        double doubleX = 2 * x;
        double tripleY = 3 * y;
        double sqrt = Math.sqrt(x + y);

        double result = product + doubleX - tripleY + sqrt;

        return result;
    }
}
