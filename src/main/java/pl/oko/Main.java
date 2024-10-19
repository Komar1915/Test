package main.java.pl.oko;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        BMICalculator calculator = new BMICalculator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Witaj w kalkulatorze BMI!");

        System.out.println("Podaj wzrost(m): ");
        String input_b = scanner.nextLine().replace(",", ".");
        double b = Double.parseDouble(input_b);

        System.out.println("Podaj wage(kg): ");
        String input_a = scanner.nextLine().replace(",", ".");
        double a = Double.parseDouble(input_a);

        double bmi = calculator.calculateBMI(a, b);
        System.out.printf("Twój BMI: %.2f%n", bmi);

        }

}