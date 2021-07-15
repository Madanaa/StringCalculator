package calculator.co;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class TestCalculator {
	@Test
    public void emptyStringShouldReturnZero() {
        Calculator cal = new Calculator();
        assertEquals(0, cal.calculate(""));
    }
	@Test
    public void oneNumberShouldReturnItseft() {
        Calculator cal = new Calculator();
        assertEquals(0, cal.calculate("1"));
    }
    
    
}