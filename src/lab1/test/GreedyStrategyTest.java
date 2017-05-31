package lab1.test;

import static org.junit.Assert.*;

import org.junit.Test;

import lab1.GreedyStrategy;

public class GreedyStrategyTest {

	@Test
	public void testHasSubSet() {
		GreedyStrategy gs = new GreedyStrategy();
		assertTrue(gs.hasSubSet(new int[]{3, 5, 6, 2}, 10));
	}
	
	@Test
	public void testHasSubSet2() {
		GreedyStrategy gs = new GreedyStrategy();
		
		//The algorithm wont work in all cases of inputs
		assertTrue(gs.hasSubSet(new int[]{3, 5, 6, 2}, 6));
	}

}
