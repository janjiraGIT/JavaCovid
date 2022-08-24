import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberWeirdTest {
    private int number = 0;
    private NumberWeird numberWeird = new NumberWeird();
    private final String weird = "Weird";
    private final String notWeird = "Not Weird";

    @Test
    void passOddNumberShouldGetWeird() {
        numberWeird = new NumberWeird();
        String word = numberWeird.findNumberWeird(5);
        assertEquals(word, weird);
    }
    @Test
    void passEvenNumberBetween4To5ShouldGetNotWeird() {
        numberWeird = new NumberWeird();
        String word = numberWeird.findNumberWeird(4);
        assertEquals(word, notWeird);
    }
    @Test
    void passEvenNumberBetween6To20ShouldGetWeird() {
        numberWeird = new NumberWeird();
        String word = numberWeird.findNumberWeird(20);
        assertEquals(word, weird);
    }

    @Test
    void passEvenNumberGreaterThan20ShouldGetNotWeird() {
        numberWeird = new NumberWeird();
        String word = numberWeird.findNumberWeird(24);
        assertEquals(word, notWeird);
    }

}