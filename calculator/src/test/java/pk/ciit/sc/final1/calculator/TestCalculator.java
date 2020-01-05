package pk.ciit.sc.final1.calculator;
import static org.junit.Assert.*;
import org.junit.Test;

public class TestCalculator 
{
private static Calculator calculator = new Calculator();
	
		@Test
	public void findMaxTestCase1() {
		assertEquals(4,calculator.findMax(1,3,4));
		
	}
	@Test
	public void findMaxTestCase2() {
		assertEquals(0,calculator.findMax(-12,0,-2));	
		}
	@Test
	public void findMaxTestCase3() {
		assertEquals(12,calculator.findMax(-200,-10,12));	
	}
	
	
	@Test(expected=IllegalArgumentException.class)
	public void squareTestCase1() {
		assertEquals(5,calculator.square(14));
		}
	@Test
	public void squareTestCase2() {
		assertEquals(9,calculator.square(3));
	
	}
		
	@Test
	public void squareTestCase3() {
		assertEquals(81,calculator.square(9));
	
	}		
	@Test
	public void cubeTestCase1() {
		assertEquals(8,calculator.cube(2));
	}	
	@Test
	public void cubeTestCase2() {
		assertEquals(-8,calculator.cube(-2));
	}
	@Test
	public void cubeTestCase3() {
		assertEquals(0,calculator.cube(0));
	}
	
}
