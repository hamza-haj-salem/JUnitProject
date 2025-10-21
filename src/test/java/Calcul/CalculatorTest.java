package Calcul;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	public void addTest() {
		Calculator calculator = new Calculator();
		int actualRes = calculator.add(2, 3);
		assertEquals(6, actualRes);
	}

}
