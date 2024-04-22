package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;

    }

    public int multiply(int y) {
        return x * y;
    }

    public static int minus(int y) {
        return y - x;
    }

    public int divide(int y) {
        return y / x;
    }

    public int sumAllOperation(int y) {
        return sum(y) + multiply(y) + minus(y) + divide(y);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result = calculator.multiply(5);
        System.out.println(result);
        int result1 = minus(20);
        System.out.println(result1);
        Calculator calculator1 = new Calculator();
        int result2 = calculator1.divide(50);
        System.out.println(result2);
        Calculator calculator2 = new Calculator();
        int result3 = calculator2.sumAllOperation(10);
        System.out.println(result3);
        System.out.println(calculator.sumAllOperation(3));

    }
}
