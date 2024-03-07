package com.vtiger;

import org.testng.annotations.Test;

public class Sample1Test  {
	@Test(groups="regression")
	public void testScript1_Test() throws InterruptedException {
		System.out.println("testsript1--- for Sample1Test");
	}
	@Test(groups ="smoke")
	public void testScript2_Test() {
		System.out.println("testscript2-- for Sample2test");
	}
	
}
