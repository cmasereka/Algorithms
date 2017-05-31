package lab1.test;

import static org.junit.Assert.*;

import org.junit.Test;

import lab1.SubSet;

public class SubSetTest {

	@Test
	public void test1() {
		SubSet subset = new SubSet();
		int[] array = { 2, 3, 5, 7, 10, 20, 30, 40 };
		assertTrue(subset.hasSubSet(array, 10));
	}
	@Test
	public void test2() {
		SubSet subset = new SubSet();
		int[] array = { 2, 3, 5, 7, 10, 20, 30, 40 };
		assertTrue(subset.hasSubSet(array, 13));
	}
	@Test
	public void test3() {
		SubSet subset = new SubSet();
		int[] array = { 2, 3, 5, 7, 10, 20, 30, 40 };
		assertTrue(subset.hasSubSet(array, 18));
	}
//	@Test
//	public void test4() {
//		SubSet subset = new SubSet();
//		int[] array = { 2, 3, 5, 7, 10, 20, 30, 40 };
//		assertTrue(subset.hasSubSet(array, 10));
//	}
//	@Test
//	public void test5() {
//		SubSet subset = new SubSet();
//		int[] array = { 2, 3, 5, 7, 10, 20, 30, 40 };
//		assertTrue(subset.hasSubSet(array, 10));
//	}
//	@Test
//	public void test6() {
//		SubSet subset = new SubSet();
//		int[] array = { 2, 3, 5, 7, 10, 20, 30, 40 };
//		assertTrue(subset.hasSubSet(array, 10));
//	}

}
