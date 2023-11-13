package com.example;

public class App {
    public static void main(String[] args) {

    }

    public String ListComparison(double midleValue1, double midleValue2) {
        if (midleValue1 > midleValue2) {
            return "Первый список имеет большее среднее значение";
        }
        if (midleValue1 < midleValue2) {
            return "Второй список имеет большее среднее значение";
        } else {
            return "Средние значения равны";
        }
    }
}
