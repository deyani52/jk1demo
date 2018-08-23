package com.ddo.bo;

import org.junit.Test;

import junit.framework.Assert;

public class BOTest {

	@Test
	public void testAdd() {
		MyBusinessLogic bo = new MyBusinessLogic();
		Assert.assertEquals(9.0, bo.add(4, 5));
	}
	
	@Test
	public void testSubstract() {
		MyBusinessLogic bo = new MyBusinessLogic();
		Assert.assertEquals(49.0, bo.substrsact(50, 1));
	}
}
