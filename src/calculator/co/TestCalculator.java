package calculator.co;

import org.junit.Test;


public class TestCalculator {
	@Test
    public void stringReturnsZero(){
    	Calculator cal = new Calculator();
    	equals(cal.calculate("",0));
    }
	
}
