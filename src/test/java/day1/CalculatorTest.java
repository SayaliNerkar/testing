package day1;




import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

	Calculator calculator;
	
	@BeforeEach
	public  void init() {
		calculator = new Calculator();
		System.out.println(calculator);;
		System.out.println("init");
	}
	@Test
	public void testAdd() {
		int result = calculator.add(1, 3);
		assertEquals(4, result);
		
		result = calculator.add(-1, -3);
		assertEquals(-4, result);
		
		result = calculator.add(-1, 3);
		assertEquals(2, result);
	}
	
	@Test
	public void testAddFloat() {
		float result = calculator.add(1.2F, 3.1F);
		assertEquals(4.3f, result);
		
		result = calculator.add(2.5F, 3.1F);
		assertEquals(5.6f, result);
	}

	@Test
	public void testDivide() {
		float result = calculator.divide(10, 5);
		assertEquals(2, result);
		
		try {
		result = calculator.divide(0, 10);
		assertEquals(0.0, result);
		}catch (Exception e) {
			assertNotNull(e);
			assertEquals(ArithmeticException.class, e.getClass());
		}
		result = calculator.divide(2, 4);
		assertEquals(0, result);

		result = calculator.divide(2, 4);
		assertEquals(0, result);
	}
}
