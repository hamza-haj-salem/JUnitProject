package Assertions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import Calcul.Calculator;

@DisplayName("Calculator Operation Test .. Class 😉 @$ ")
public class CalculatorTest {
	
	@DisplayName(" Test Addition of two numbers .. 😉​")
	@Test
	public void addTest() {
		Calculator calculator = new Calculator();
		int addition = calculator.add(2, 3);
		assertEquals(5, addition);
	}
	
	@DisplayName(" Test sUB of two numbers .. 😉​")
	@Test
	public void substractTest() {
		Calculator calculator = new Calculator();
		int subs = calculator.substract(2, 3);
		assertEquals(-1, subs);
	}

	@DisplayName(" Test Multi of two numbers .. 😉​")
	@Test
	public void multiplyTest() {
		Calculator calculator = new Calculator();
		int multipl = calculator.multiply(2, 3);
		assertEquals(5, multipl);
	}
	
	@DisplayName(" Test Divi of two numbers .. 😉​")
	@Test
	public void divisionTest() {
		Calculator calculator = new Calculator();
		int div = calculator.divide(2, 1);
		assertEquals(5, div);
	}

}
