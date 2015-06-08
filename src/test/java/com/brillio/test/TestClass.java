package com.brillio.test;

import junit.framework.Assert;

import org.testng.annotations.Test;

public class TestClass {

	@Test
	public void test1(){
		Assert.assertEquals(true, true);
		System.out.println("Test1 Method Pass.");
	}
	
	@Test
	public void test2(){
		Assert.assertEquals(true, true);
		System.out.println("Test2 Method Pass.");
	}
	
	/*@Test
	public void test3(){
		Assert.assertEquals(true, false);
		System.out.println("Test3 Method Fail.");
	}*/
}
