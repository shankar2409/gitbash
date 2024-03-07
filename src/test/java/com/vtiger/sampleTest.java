package com.vtiger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;


public class sampleTest {
	@Test(groups= {"smoke","regression"})
	public void testScript1_Test() {
		System.out.println("testScript-1 for sample Test--");
	}

	@Test(groups="regression")
	public void testScript2_Test() {
		System.out.println("testscript2-- for sampleTest");
	}

}
