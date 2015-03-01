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

import io.accomplice.testing.selenium.utils.TeamUtils;
import junit.framework.Assert;

import org.testng.annotations.Test;

public class TeamTests {

	@Test
	public void test_CreateTeam(String name) {
		TeamUtils.createTeam(name);
		Assert.assertTrue(TeamUtils.isTeamPresent(name));
		//String xpath = JSONREADER.get("test_CreateTeam").get("xpathTextBox")
	}
	
}
