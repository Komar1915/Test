package test.java.pl.oko;

import main.java.pl.oko.BMICalculator;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class BMICalculatorTest {
    private BMICalculator bmiCalculator;

    @BeforeEach
    public void setUp() {
        bmiCalculator = new BMICalculator();
    }

    @Test
    public void testCalculateBMI_ValidInputs() {
        assertEquals(22.86, bmiCalculator.calculateBMI(70, 1.75));
        assertEquals(19.53, bmiCalculator.calculateBMI(50, 1.60));
        assertEquals(27.78, bmiCalculator.calculateBMI(90, 1.80));
        assertEquals(16.78, bmiCalculator.calculateBMI(50, 1.85));
        assertEquals(30.00, bmiCalculator.calculateBMI(90, 1.75));
    }

    @Test
    public void testCalculateBMI_ZeroHeight() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            bmiCalculator.calculateBMI(70, 0);
        });
        assertEquals("Wzrost nie może być ponizej 0", exception.getMessage());
    }

    @Test
    public void testCalculateBMI_NegativeHeight() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            bmiCalculator.calculateBMI(70, -1.75);
        });
        assertEquals("Wzrost nie może być ponizej 0", exception.getMessage());
    }

    @Test
    public void testCalculateBMI_NegativeWeight() {
        double negativeWeight = -70;
        double height = 1.75;

        assertEquals(0.0, bmiCalculator.calculateBMI(negativeWeight, height), 0.01);
    }

}
