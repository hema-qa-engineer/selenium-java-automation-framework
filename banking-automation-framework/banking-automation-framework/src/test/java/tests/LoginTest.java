package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;

public class LoginTest extends BaseTest {

   /* @Test
    public void validLoginTest() {

        LoginPage login = new LoginPage(driver);
        login.login("john", "demo");

    }
    
    */
	//adding assertion to validate exp vs act results. if val fails test case also fails
	  @Test
	    public void validLoginTest() {

	        LoginPage login = new LoginPage(driver);
	        login.login("john", "demo");

	        // Assertion (check if login successful)
	        String title = driver.getTitle();
	        Assert.assertTrue(title.contains("ParaBank"), "Login failed");
	
}