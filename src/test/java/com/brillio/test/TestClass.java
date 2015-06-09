package com.brillio.test;

import junit.framework.Assert;

import org.testng.annotations.Test;

public class TestClass {

	@Test
	public void test1(){
		System.out.println("Test1 Method Pass.");
		Assert.assertEquals(true, true);
	}
	
	@Test
	public void test2(){
		System.out.println("Test2 Method Pass.");
		Assert.assertEquals(true, true);
	}
	
	@Test
	public void test3(){
		System.out.println("Test3 Method Fail.");
		Assert.assertEquals(true, false);
	}
}
