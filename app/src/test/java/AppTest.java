package app.src.test.java;

import com.vismedia.App;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    void addReturnsCorrectSum() {
        assertEquals(12, App.add(5, 7));
    }

    @Test
    void addHandlesZero() {
        assertEquals(7, App.add(0, 7));
        assertEquals(7, App.add(7, 0));
    }

    @Test
    void addHandlesNegativeValues() {
        assertEquals(-3, App.add(-1, -2));
        assertEquals(-1, App.add(2, -3));
    }

    @Test
    void addIsCommutative() {
        assertEquals(App.add(10, 3), App.add(3, 10));
    }

    @Test
    void addEdgeCaseIntegerLimit() {
        // Overflow case
        int result = App.add(Integer.MAX_VALUE, 1);
        // This demonstrates wraparound behavior
        assertTrue(result < 0);
    }
    
}
