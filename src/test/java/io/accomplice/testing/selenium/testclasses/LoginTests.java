/*
* Copyright (c) 2013-2014 Software AG, Darmstadt, Germany 
* and/or Software AG USA Inc., Reston, VA, USA, and/or 
* its subsidiaries and or/its affiliates and/or their 
* licensors.
* Use, reproduction, transfer, publication or disclosure 
* is prohibited except as specifically provided for in your 
* License Agreement with Software AG.
*/

package io.accomplice.testing.selenium.testclasses;

import junit.framework.Assert;

import org.testng.annotations.Test;

@Test(groups = {"LOGIN-1"})
public class LoginTests {

	@Test
	public void test_Login1() {
		System.out.println("runnig test1");
		Assert.assertTrue(true);
	}

	@Test
	public void test_Login2() {
		System.out.println("runnig test2");
		Assert.assertTrue(true);
	}
}
