package calc;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void add() throws Exception {
        assertEquals(172, Calculator.add(171,1));
    }

    @Test
    public void sub() throws Exception {
        if(Calculator.sub(1,1) != 0)
            fail("just to show a failing test");
    }

    @Test
    public void mul() throws Exception {
        double negMulResult = Calculator.mul(-2,-2);
        assertEquals(4,Calculator.mul(-2,-2), 0.001);
        if (negMulResult<0){
            fail("Result has to be positive");
        }
    }

    @Test
    public void divInt() throws Exception {
        assertEquals(1,Calculator.divInt(-1,-1), 0.001);
    }

    @Test (expected = IllegalArgumentException.class)
    public void divZeroInt() throws Exception {
        Calculator.divInt(10,0);
    }

    @Test
    public void divReal() throws Exception {
        double divResult = Calculator.divReal(10,3);
        System.out.println("Real Div Value: " + divResult);
        assertEquals(3.333,Calculator.divReal(10,3), 0.01);
    }

    @Test (expected = IllegalArgumentException.class)
    public void divZeroReal() throws Exception {
        Calculator.divReal(10,0);
    }

}