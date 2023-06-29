package com.lamdatest.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.lamdatest.baselayer.BrowserDriver;
import com.lamdatest.page.RegisterPage;

public class RegisterPageTest {
	
  private RegisterPage registerPage;
  @BeforeMethod
  public void setUp() {
	  BrowserDriver.start();
	  registerPage = new RegisterPage();
  }
  @Test(priority = 1)
  public void verifyHeaderElm() {
	 Assert.assertEquals(registerPage.headerElmCheck(), true, "Register account must be present");
	   
  }
  @Test(priority =2)
  public void verifyAllLabelPresent() {
	  Assert.assertEquals(registerPage.firstNameLabelCheck(), true, "First name  must be present");
	  
  }
  @Test(priority =3 )
  public void verifyAllTextFieldSend() {
	registerPage.firstNameTextSend();
	
  }
  @AfterMethod
	public void tearDown() {
		BrowserDriver.close();
	}
  
}
