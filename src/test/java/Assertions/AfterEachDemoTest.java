package Assertions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Calcul.Calculator;

public class AfterEachDemoTest {
	
private Calculator calculator ;
	
	@BeforeEach
	void setUp() {
		 calculator = new Calculator();
		 System.out.println("setUp meth calling ..");
	}
	
	@AfterEach
	void tearDown() {
		calculator = null;
		 System.out.println("TearDown meth calling ..");
	}
	
	@Test
	public void addTest() {
		int addition = calculator.add(2, 3);
		assertEquals(5, addition);
		System.out.println("add meth calling ..");
	}
	
	
	@Test
	public void substractTest() {
		int subs = calculator.substract(3, 2);
		assertEquals(1, subs);
		System.out.println("sub meth calling ..");
	}

	
	@Test
	public void multiplyTest() {
		int multipl = calculator.multiply(2, 3);
		assertEquals(6, multipl);
		System.out.println("multiply meth calling ..");
	}
	
	
	@Test
	public void divisionTest() {
		int div = calculator.divide(2, 1);
		assertEquals(2, div);
		System.out.println("division meth calling ..");
	}


}
