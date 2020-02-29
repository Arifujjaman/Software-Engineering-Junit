import static org.junit.Assert.*;

import org.junit.Test;

public class CalTest {

	@Test
	public void testArithmetic() {
		Calculator oT = new Calculator();
		assertEquals(5,oT.addition(2,3));
		assertEquals(-1,oT.subtraction(2,3));
		assertEquals(2.0,oT.division(4,2),0.001);
		assertEquals(2,oT.modulus(2,3));
	}
	
	@Test
	public void testBitwise() {
		Calculator oT = new Calculator();
		assertEquals(-8,oT.bitNot(7));
		assertEquals(4,oT.bitAnd(5, 6));
		assertEquals(7,oT.bitOr(5, 6));
		assertEquals(3,oT.bitExOr(5, 6));
		assertEquals(6,oT.bitShiftRight(12));
		assertEquals(6,oT.bitShiftRightZero(12));
		assertEquals(12,oT.bitShiftLeft(6));
	}
	
	@Test
	public void testRelation() {
		Calculator oT = new Calculator();
		assertEquals(true,oT.equalTo(1,1));
		assertEquals(true,oT.notEqualTo(1,10));
		assertEquals(true,oT.greaterThan(10,1));
		assertEquals(false,oT.greaterThanOrEqual(10,100));
		assertEquals(true,oT.lessThan(10,100));
		assertEquals(true,oT.lessThanOrEqual(10,100));
	}
	
	@Test
	public void testLogical() {
		Calculator oT = new Calculator();
		assertEquals(false,oT.logicalNotEqual(true));
		assertEquals(false,oT.logicalAnd(true,false));
		assertEquals(true,oT.logicalOr(true,false));
		assertEquals(true,oT.logicalExOr(true,false));
		assertEquals(true,oT.logicalOr(true,false));
		assertEquals(false,oT.shortCircuitAnd(true,false));
		assertEquals(true,oT.shortCircuitOr(true,false));
	}

}
