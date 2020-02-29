import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;
public class Accounttest {

	@Test
	public void test1() {
		Account  account = new Account();
		Assert.assertEquals(0, account.getBalance());
	}
	
	@Test
	public void test2() {
		Account  account = new Account(100);
		Assert.assertEquals(100, account.getBalance());
	}
	
	@Test
	public void test3() {
		Account  account = new Account();
		account.deposit(500);
		Assert.assertEquals(500, account.getBalance());
	}
	
	@Test
	public void test4() {
		Account  account = new Account();
		account.deposit(1000);
		account.widrow(300);
		Assert.assertEquals(700, account.getBalance());
	}
	
	@Test
	public void test5() {
		Account  account = new Account();
		account.deposit(-100);
		Assert.assertEquals(0, account.getBalance());
	}
	
	@Test
	public void test6() {
		Account  account = new Account();
		account.widrow(100);
		Assert.assertEquals(0, account.getBalance());
	}
	
	@Test
	public void test7() {
		Account  account = new Account();
		account.deposit(200);
		account.widrow(500);
		Assert.assertEquals(200, account.getBalance());
	}
	
	@Test
	public void test8() {
		Account  account = new Account();
		account.deposit(200);
		account.widrow(-500);
		Assert.assertEquals(200, account.getBalance());
	}

}
