package test.java.pl.oko;

import main.java.pl.oko.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    private Calculator calculator = new Calculator();

    @Test
    public void testAdd() {
        System.out.println("Testowanie dodawania...");
        assertEquals(5, calculator.add(2, 3));
        assertEquals(19, calculator.add(10, 9));
        assertEquals(10, calculator.add(2, 8));
    }

    @Test
    public void testSubtract() {
        System.out.println("Testowanie odejmowania...");
        assertEquals(1, calculator.subtract(5, 4));
        assertEquals(-2, calculator.subtract(2, 4));
        assertEquals(7, calculator.subtract(15, 8));
    }

    @Test
    public void testMultiply() {
        System.out.println("Testowanie mnożenia...");
        assertEquals(20, calculator.multiply(4, 5));
        assertEquals(6, calculator.multiply(2, 3));
        assertEquals(25, calculator.multiply(5, 5));
    }

    @Test
    public void testDivide() {
        System.out.println("Testowanie dzielenia...");
        assertEquals(2, calculator.divide(10, 5));
        assertEquals(14, calculator.divide(28, 2));
        assertEquals(3, calculator.divide(9, 3));
    }

    @Test
    public void testDivideByZero() {
        System.out.println("Testowanie dzielenia przez zero...");
        calculator.divide(10, 0);
    }
}
