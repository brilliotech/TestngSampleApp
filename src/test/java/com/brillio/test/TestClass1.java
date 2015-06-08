package com.brillio.test;

import junit.framework.Assert;

import org.testng.annotations.Test;

public class TestClass1 {
	@Test
	public void test4(){
		Assert.assertEquals(true, true);
		System.out.println("Test4 Method Pass.");
	}
	
	@Test
	public void test5(){
		Assert.assertEquals(true, false);
		System.out.println("Test5 Method Fail.");
	}

}
