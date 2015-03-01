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

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class EntityTeam_Test {

	@Test
	@Parameters("propertyname")
	public void method(String p) {
		System.out.println(p);
		Assert.assertTrue(false);
	}
	
}
