package test.java.pl.oko;

import main.java.pl.oko.UnitsConverter;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class UnitsConverterTest {

    private UnitsConverter unitconv = new UnitsConverter();

    @BeforeAll
    static void runBeforeAll (){
        System.out.println("Przypadki testowe konweretera\n");
    }

    @BeforeEach
    void runBeforeEach (){
        System.out.println("Rozpoczynam przypadek testowy");
    }



    @Test
    @DisplayName("Sprawdzam czy prawidłowo przeliczone kilogramy na funty")
    public void testKilo_to_pounds() {
        assertEquals(44.09, unitconv.kilo_to_pounds(20));
        assertEquals(110.23, unitconv.kilo_to_pounds(50));

    }

    @Test
    @DisplayName("Sprawdzam czy prawidłowo przeliczono mile na kilomentry")
    public void testMiles_to_kilometrs() {
        assertEquals(72.42,unitconv.miles_to_kilometrs(45));
        assertEquals(154.50,unitconv.miles_to_kilometrs(96));
    }

    @Test
    @DisplayName("Sprawdzam czy prawidłowo przeliczono mile na kilomentry")
    public void testLiters_to_gallons() {
        assertEquals(0.26,unitconv.liters_to_gallons(1));
        assertEquals(1.09,unitconv.liters_to_gallons(5));
    }

    @Test
    @DisplayName("Sprawdzam czy prawidłowo przeliczono stopnie Celsiusza na stopnie Farenhaita")
    public void testCelsius_to_fahrenheit() {
        assertEquals(71.60,unitconv.celsius_to_fahrenheit(22));
        assertEquals(14.00,unitconv.celsius_to_fahrenheit(-10));
    }

    @Test
    @DisplayName("Sprawdzam czy prawidłowo przeliczono cale na centymetry")
    public void testInches_to_centimeters() {
        assertEquals(25.40,unitconv.inches_to_centimeters(10));
        assertEquals(10.16,unitconv.inches_to_centimeters(4));
    }

    @AfterEach
    void runAfterEach (){
        System.out.println("\nTest został wykonany\n");
    }

    @AfterAll
    static void runAfterAll (){
        System.out.println("Zakończyłem przypadki testowe");
    }
}
