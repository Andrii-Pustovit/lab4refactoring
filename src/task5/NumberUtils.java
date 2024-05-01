package task5;

public class NumberUtils {

    public static int calculateTotal(int a, int b) {
        // Вбудовування методу
        return a + b;
    }

    public static void printTotal(int a, int b) {
        // Виведення результату обчислення
        int total = calculateTotal(a, b);
        System.out.println("Total: " + total);
    }
}
