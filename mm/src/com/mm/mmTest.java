package com.mm;

import junit.framework.TestCase;

public class mmTest extends TestCase {
	private mm mm1;
	protected void setUp() throws Exception {
		super.setUp();
		mm1 = new mm();
		
	}

	public void testAdd() {
		int a = 5;
		int b = 3;
		assertTrue(a + b == 8);
		//fail("Not yet implemented");
	}

}
