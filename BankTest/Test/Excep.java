import static org.junit.Assert.*;

import org.junit.Test;

public class Excep {

	@Test(expected=ArrayIndexOutOfBoundsException.class)
	public void test() {
		int arr[] = {1,2,3};
		System.out.println(arr[5]);
	}
	
	@Test(expected=ArithmeticException.class)
	public void test1() {
		int k=5/0;
	}
}
