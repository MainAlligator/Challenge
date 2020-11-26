package com.company;

public class Main {

    public static void main(String[] args) {

        int a = 3;
        int b = -14;
        int c = -5;

        double x, x1, x2; // variables


        final  double D = b * b - 4 * a * c; // Discriminant
        System.out.println(D);
        if (D > 0) {
            x1 = (-b + Math.sqrt(D)) / (2 * a);
            x2 = (-b - Math.sqrt(D)) / (2 * a);

            System.out.println("x1 = " + x1 + " x2 = " + x2);
        }
        if (D == 0) {
            x = -b / (2 * a);
            System.out.println("x = " + x);
        }
        if (D < 0) {
            System.out.println("Уравнение не имеет корней");
        }
        // write your code here
    }
}
