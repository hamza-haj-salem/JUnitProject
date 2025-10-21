package Assertions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import Calcul.Calculator;

public class DisabledCalculatorTest {
	
	//Run TOUTE LA CLASS EN JUNIT ET ON VA REMARQUER QUE UNIQUEMENT LE TEST DE METH
	// ADD NE S4EFFECTUE PAS
	
	@Disabled("Disabled until bug is fixed") // ce msg ne s'affiche pas j sais pas pourq
	@Test
	public void addTest() {
		Calculator calculator = new Calculator();
		int addition = calculator.add(2, 3);
		assertEquals(5, addition);
	}
	
	
	@Test
	public void substractTest() {
		Calculator calculator = new Calculator();
		int subs = calculator.substract(3, 2);
		assertEquals(1, subs);
	}

	
	@Test
	public void multiplyTest() {
		Calculator calculator = new Calculator();
		int multipl = calculator.multiply(2, 3);
		assertEquals(6, multipl);
	}
	
	
	@Test
	public void divisionTest() {
		Calculator calculator = new Calculator();
		int div = calculator.divide(2, 1);
		assertEquals(2, div);
	}

}
