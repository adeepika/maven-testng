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

import io.accomplice.testing.selenium.utils.LoginUtils;

import java.util.Map;

import junit.framework.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.TestException;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

@Test(groups = {"LOGIN-1"})
public final class LoginTests {

	@Test
	public void testLogin() {
		final WebDriver driver = new FirefoxDriver();
		
		Map<String, Object> args = ImmutableMap.<String, Object>builder()
										.put("DRIVER", driver)
										.put("URL", "http://alpha.accomplice.io")
										.put("USERNAME", "deepika.arora@accomplice.io")
										.put("PASSWORD", "deepika")
										.build();
										
		try {
			LoginUtils.login(args);
			Assert.assertTrue(true);
		} catch(TestException e) {
			Assert.assertTrue(e.getMessage(), false);
		}
	}
	
}
