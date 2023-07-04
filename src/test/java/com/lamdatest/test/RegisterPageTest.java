package com.lamdatest.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.lamdatest.baselayer.BrowserDriver;
import com.lamdatest.page.HeaderPage;
import com.lamdatest.page.RegisterPage;
import com.lamdatest.util.TestUtil;

public class RegisterPageTest {
	private HeaderPage headerPage;
	RegisterPage registerPage;
	
	@BeforeMethod
	public void setUp() {
		BrowserDriver.start();
		headerPage = new HeaderPage();
		headerPage.hoverOverMyAcountMenu();
		registerPage = headerPage.clickRegisterMenu();
	}
	@Test(priority =1)
	public void verfyTitleOfRegisterPage() {
		Assert.assertEquals(registerPage.getRegisterPageTitle(), "Register Account");
		
	}
  @Test(priority = 2)
  public void verifyHeaderElm() {
	 Assert.assertEquals(registerPage.headerElmCheck(), true, "Register account must be present");
	 Assert.assertEquals(registerPage.getHeaderElmText(), "Register Account", "Both must match");
	    
  }
  @Test(priority =3)
  public void verifyAllWebElementDisplayOnRegPage() {
	  Assert.assertEquals(registerPage.firstNameLabelCheck(), true, "First name must be present");
	  Assert.assertEquals(registerPage.lastNameLabelCheck(), true, "last name must be present");
	  Assert.assertEquals(registerPage.emailLabelCheck(), true, "Email must be present");
	  Assert.assertEquals(registerPage.phLabelCheck(), true, "Phone num.  must be present");
	  Assert.assertEquals(registerPage.cPwdLabelCheck(), true, "Confirm password must be present");
	  Assert.assertEquals(registerPage.pwdLabelCheck(), true, "Password must be present");
	  Assert.assertEquals(registerPage.subscribeLabelCheck(), true, "Subscribe e must be present");
	  Assert.assertEquals(registerPage.agreeLabelCheck(), true, "Privacy policy must be present");
	  Assert.assertEquals(registerPage.continueLabelCheck(), true, "Continue label must be present");  
  }
  
  @Test(priority =4)
  public void verifyAllContentOfLabelOnRegPage() {
	  Assert.assertEquals(registerPage.getFnameLblText(), "First Name", "First name must be matched");
	  Assert.assertEquals(registerPage.getLnameLblText(), "Last Name", "last name must be matched");
	  Assert.assertEquals(registerPage.getEmailLblText(), "E-Mail", "Email must be matched");
	  Assert.assertEquals(registerPage.getPhoneLblText(), "Telephone", "Phone num.  must be pmatched");
	  Assert.assertEquals(registerPage.getCpwdText(), "Password Confirm", "Confirm password must be matched");
	  Assert.assertEquals(registerPage.getPwdLblText(), "Password", "Password must be matched");
	  Assert.assertEquals(registerPage.getsuscribeWebElmText(), "Subscribe", "Subscribe e must be matched");
	 
  }

  @Test(priority = 5)
  public void verifyRegstrationWithoutEnteringValue() {
	  registerPage.clickContinue();
	  Assert.assertEquals(registerPage.warningWebElmCheck(), true, " Warning Msg must display");
	  Assert.assertEquals(registerPage.getWarningText(), "Warning: You must agree to the Privacy Policy!", " they must matched");	  
  }
  @Test(priority =6)
  public void verifyPrivacyPolicyWithAgreeWithoutAnyValue() {
	  registerPage.clickPrivacayPolicy();
	  registerPage.clickContinue();
	  
	  // need to figureout
	// Assert.assertEquals(registerPage.warningWebElmCheck(), false, " Warning Msg shouldnot display");
  }
 /* 
@DataProvider
public Object[][] getValidTestDataForRegistration(){
	  Object[][] testData = TestUtil.readTestData("ValidTestDta");
	  return testData;
	  
  }

@ Test (priority = 7)
public void verifyRegistrationWithValidTestData(String firstName, String lastName, String	email, String	telephone, 	String password	, String confirmPassword, String subscribe
)*/
  @ Test (priority = 7)
public void verifyRegistrationWithValidTestData(){
	registerPage.enterFname("Narayan");
	registerPage.enterLname("Paudel");
	
}
  @AfterMethod
	public void tearDown() {
		BrowserDriver.close();
	}
  
}
