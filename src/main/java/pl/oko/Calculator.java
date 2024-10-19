package main.java.pl.oko;

/**
 *  TODO: do wszystkich metod dopisz odpowiadające im testy jednostkowe
 */
public class Calculator {

    // Metoda dodawania
    public double add(double a, double b) {
        double result = a + b;
        System.out.println( a + " + " + b + " = " + result);
        return result;
    }

    // Metoda odejmowania
    public double subtract(double a, double b) {
        double result = a - b;
        System.out.println( a + " - " + b + " = " + result);
        return result;
    }

    // Metoda mnożenia
    public double multiply(double a, double b) {
        double result = a * b;
        System.out.println( a + " * " + b + " = " + result);
        return result;
    }

    // Metoda dzielenia
    public double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Błąd: dzielenie przez zero!");
            throw new IllegalArgumentException("Dzielenie przez zero nie jest dozwolone.");
        }
        double result = a / b;
        System.out.println( a + " / " + b + " = " + result);
        return result;
    }
}


