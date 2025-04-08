import java.util.Random;

public class SimpleCalculator {

    private Random random;

    public SimpleCalculator() {
        this.random = new Random();
    }

    /**
     * Adds two numbers together.
     * @param a the first number
     * @param b the second number
     * @return the sum of a and b
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * Subtracts one number from another.
     * @param a the first number
     * @param b the second number
     * @return the difference of a and b
     */
    public int subtract(int a, int b) {
        return a - b;
    }

    /**
     * Simulates a random operation that may succeed or fail.
     * @return true if the operation succeeds, false otherwise
     */
    public boolean simulateRandomOperation() {
        return random.nextBoolean();
    }
}
