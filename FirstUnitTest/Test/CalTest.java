import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class CalTest {

	@Test
	public void testadd() {
		calculator cal = new calculator();
		Assert.assertEquals(10,cal.add(6, 4));
		Assert.assertEquals(11,cal.add(6, 5));
		Assert.assertEquals(12,cal.add(6, 6));
	}
	
	@Test
	public void testmult() {
		calculator cal = new calculator();
		Assert.assertEquals(24,cal.mult(6, 4));
		Assert.assertEquals(30,cal.mult(6, 5));
		Assert.assertEquals(36,cal.mult(6, 6));
	}

}
