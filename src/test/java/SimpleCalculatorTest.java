import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SimpleCalculatorTest {

    private SimpleCalculator calculator;

    public SimpleCalculatorTest() {
        this.calculator = new SimpleCalculator();
    }

    @Test
    public void testAdd() {
        int result = calculator.add(2, 3);
        assertEquals(5, result);
    }

    @Test
    public void testSubtract() {
        int result = calculator.subtract(5, 3);
        assertEquals(2, result);
    }

    @Test
    public void testSimulateRandomOperation() {
        boolean result = calculator.simulateRandomOperation();
        // This test may pass or fail randomly
        assertTrue(result);
    }
}
