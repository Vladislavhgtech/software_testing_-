package main.java.ru.miet.testing;

public interface Calculator {

    /**
     * Вычисляет сумму двух чисел
     */
    double sum(double a, double b);


    /**
     * Вычисляет разность двух чисел a - b
     */
    double subtract(double a, double b);

    /**
     * Вычисляет произведение двух чисел
     */
    double multiply(double a, double b);

    /**
     * Вычисляет отношение числа а к числу b.
     * Должен выбросить {@link ArithmeticException} если |b| < 10e-8
     */
    double divide(double a, double b);
}
