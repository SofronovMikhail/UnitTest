package com.example;

public class MainHW {
    // HW 3.1. Нужно покрыть тестами метод на 100%
    // Метод проверяет, является ли целое число записанное в переменную n, чётным
    // (true) либо нечётным (false).
    public static boolean EvenOddNumber(int n) {
        boolean end = true;
        if (n % 2 != 0) {
            end = false;
        }
        return end;
    }

    // HW 3.2. Нужно написать метод который проверяет, попадает ли переданное число
    // в интервал (25;100) и возвращает true, если попадает и false - если нет,
    // покрыть тестами метод на 100%
    public static boolean NumberInInterval(int n) {
        boolean end = false;
        if (n > 25 && n < 100) {
            end = true;
        }
        return end;
    }
}
