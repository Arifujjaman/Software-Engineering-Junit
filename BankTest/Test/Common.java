import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.After;
import org.junit.Before;


import org.junit.Test;

public class Common {
	public static Account account;
	public static Scanner sc = new Scanner(System.in);
	
	@BeforeClass
	public static void BeforeClass() {
		account=new Account(400);
	}
	
	@AfterClass
	public static void AfterClass() {
		System.out.println("After class");
		sc.close();
	}
	
	
	@Before
	public void Before() {
		System.out.println(" from before");
	}
	
	@After
	public void After() {
		System.out.println(" from after");
	}
	
	@Test
	public void test() {  
		System.out.println(account.getBalance());
	}
	
	@Test
	public void test2() { 
		account.widrow(200);
		System.out.println(account.getBalance());
	}

}
