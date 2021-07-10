package Asseration;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestCases {
	
	SoftAssert sa = new SoftAssert();   // need to create object of the SoftAssert.
	
	@Test
	public void Testone(){
		
		System.out.println("Open Browser");
		System.out.println("Open URL");
       //Example for soft Assert.
		sa.assertEquals(false, true);
		
		System.out.println("Enter UserName");
		System.out.println("Enter Password");
		System.out.println("Enter Login Button");
		//Example for Hard Assets.
		//Assert.assertEquals(true, false);
		Assert.assertEquals(true, true);
		
		//sa.assertAll();  // show your test case are fail

	}
	
//	assertEqual(String actual,String expected)
//	assertEqual(String actual,String expected, String message)
//	assertEquals(boolean actual,boolean expected)
//	assertTrue(condition)
//	assertTrue(condition, message)
//	assertFalse(condition)
//	assertFalse(condition, message)

}

// in hard assert system we not execute next step 