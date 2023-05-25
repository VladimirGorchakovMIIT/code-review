import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void add() {
        assertEquals(3, calculator.add(1, 2));
    }

    @Test
    void dif() {
        assertEquals(3, calculator.dif(5, 2));
    }

    @Test
    void div() {
        assertEquals(3, calculator.div(12, 4));
    }

    @Test
    void times() {
        assertEquals(20, calculator.times(5, 4));
    }

    //Pythagorean theorem
    @Test
    void solver() {
        assertEquals(5, calculator.solver(3, 4));
    }
}
