package test.java.pl.oko;

import main.java.pl.oko.StringUtilities;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class StringUtilitiesTest {

    private StringUtilities strinhutil = new StringUtilities();

    @BeforeAll
    static void runBeforeAll (){
        System.out.println("Przypadki testowe na lańcuchach znaków\n");
    }

    @BeforeEach
    void runBeforeEach (){
        System.out.println("Rozpoczynam przypadek testowy");
    }



    @Test
    @DisplayName("Sprawdzam czy lańcuch znaków jest odwrócony")
    public void testReverse() {
        assertEquals("dcba", strinhutil.Reverse("abcd"));
        assertEquals("54321", strinhutil.Reverse("12345"));
        assertNull(strinhutil.Reverse(null));
    }

    @Test
    @DisplayName("Sprawdzam czy zostały usunięte białe znaki")
    public void testTrimWhitespace() {
        assertEquals("Pchaszsięwgips!!", strinhutil.trimWhitespace("  Pchasz   się w gips  !!"));
        assertEquals("", strinhutil.trimWhitespace("   "));
        assertNull(strinhutil.trimWhitespace(null));
    }

    @Test
    @DisplayName("Sprawdzam czy lańcuch znaków jest palindromem")
    public void testIsPalindrome() {
        assertTrue(strinhutil.isPalindrome("Kobyła ma mały bok"));
        assertFalse(strinhutil.isPalindrome("Hello World"));
        assertTrue(strinhutil.isPalindrome("Kajak"));
        assertFalse(strinhutil.isPalindrome(null));
    }

    @Test
    @DisplayName("Sprawdzam czy lańcuch znaków jest to CamelCase")
    public void testToCamelCase() {
        assertEquals("HelloWorld", strinhutil.toCamelCase("   hello    world   "));
        assertEquals("AlaMialaKota", strinhutil.toCamelCase("Ala miala kota"));
        assertNull(strinhutil.toCamelCase(null));
    }

    @Test
    @DisplayName("Sprawdzam czy lańcuch znaków zawiera tylko cyfry")
    public void testContainsOnlyDigits() {
        assertTrue(strinhutil.containsOnlyDigits("12345"));
        assertFalse(strinhutil.containsOnlyDigits("123a45"));
        assertFalse(strinhutil.containsOnlyDigits("12 345"));
        assertFalse(strinhutil.containsOnlyDigits(null));
    }

    @Test
    @DisplayName("Sprawdzam czy lańcuch znaków zawiera konkrętną literę")
    public void testCountCharacterOccurrences() {
        assertEquals(2, strinhutil.countCharacterOccurrences("hello", 'l'));
        assertEquals(0, strinhutil.countCharacterOccurrences("hello", 'z'));
        assertEquals(3, strinhutil.countCharacterOccurrences("banana", 'a'));
        assertEquals(0, strinhutil.countCharacterOccurrences(null, 'a'));
    }

    @AfterEach
    void runAfterEach (){
        System.out.println("\nTest został wykonany\n");
    }

    @AfterAll
    static void runAfterAll (){
        System.out.println("Zakończyłem przypadki testowe na lańcuchach znaków");
    }
}