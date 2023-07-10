package org.example;

public class MathOperation {
    public static void main(String[] args) {
        int a = 15;
        int b = 20;
        System.out.println(sum(a,b));
        System.out.println(mul(a,b));
    }
    public static int sum (int a, int b) {
        return a+b;
    }
    public static int mul (int a, int b) {
        return a*b;
    }
}
