import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class TriTest {

	@Test
	public void test() {
		Triangle tr = new Triangle();
		assertEquals("INVALID INPUT", tr.triangle(0,0,20));
		assertEquals("EQUILATERAL",tr.triangle(4,4,4));
		assertEquals("SCALENE",tr.triangle(4,5,6));
		assertEquals("ISOSCELES",tr.triangle(4,4,5));
		assertEquals("NOT A TRIANGLE",tr.triangle(4,1,3));
		
	}

}
 