package main.java.pl.oko;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Witaj w prostym kalkulatorze!");
        System.out.println("Wybierz operację: ");
        System.out.println("1 - Dodawanie");
        System.out.println("2 - Odejmowanie");
        System.out.println("3 - Mnożenie");
        System.out.println("4 - Dzielenie");

        int choice = scanner.nextInt();

        System.out.println("Podaj pierwszą liczbę:");
        double a = scanner.nextDouble();

        System.out.println("Podaj drugą liczbę:");
        double b = scanner.nextDouble();

        switch (choice) {
            case 1:
                calculator.add(a, b);
                break;
            case 2:
                calculator.subtract(a, b);
                break;
            case 3:
                calculator.multiply(a, b);
                break;
            case 4:
                try {
                    calculator.divide(a, b);
                } catch (ArithmeticException e) {
                    System.out.println("Błąd: " + e.getMessage());
                }
                break;
            default:
                System.out.println("Nieznana operacja.");
        }

        scanner.close();
    }
}