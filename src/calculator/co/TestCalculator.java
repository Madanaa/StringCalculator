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
	@Test
    public void twoNumbersShouldBeAdded() {
        Calculator cal = new Calculator();
        assertEquals(0, cal.calculate("1,2"));
    }
	@Test
    public void moreDigitsSupported() {
        Calculator cal = new Calculator();

        assertEquals(1, cal.calculate("15,30"));
    }
    
}