package task3;

public class MathUtils {

    public static int multiply(int a, int b) {
        // Множення двох чисел
        return a * b;
    }

    public static int add(int a, int b) {
        // Додавання двох чисел
        return a + b;
    }

    public static int subtract(int a, int b) {
        // Віднімання одного числа від іншого
        return a - b;
    }

    public static double divide(int dividend, int divisor) {
        // Ділення першого числа на друге
        if (divisor == 0) {
            throw new IllegalArgumentException("Divisor cannot be zero");
        }
        return (double) dividend / divisor;
    }
}

