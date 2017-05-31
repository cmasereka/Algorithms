package lab1.test;

import static org.junit.Assert.*;

import org.junit.Test;

import lab1.GCD;

public class GCDTest {

	@Test
	public void testGetGcd1() {
		GCD gcd = new GCD();
		assertEquals(10, gcd.getGcd(10, 20));
	}
	@Test
	public void testGetGcd2() {
		GCD gcd = new GCD();
		assertEquals(10, gcd.getGcd(30, 20));
	}
	@Test
	public void testGetGcd3() {
		GCD gcd = new GCD();
		assertEquals(15, gcd.getGcd(30, 45));
	}
	@Test
	public void testGetGcd4() {
		GCD gcd = new GCD();
		assertEquals(5, gcd.getGcd(45, 20));
	}
	@Test
	public void testGetGcd5() {
		GCD gcd = new GCD();
		assertEquals(2, gcd.getGcd(8, 6));
	}
	@Test
	public void testGetGcd6() {
		GCD gcd = new GCD();
		assertEquals(7, gcd.getGcd(14, 21));
	}
	@Test
	public void testGetGcd7() {
		GCD gcd = new GCD();
		assertEquals(7, gcd.getGcd(49, 35));
	}

}
