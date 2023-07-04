package com.lamdatest.test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.lamdatest.baselayer.BrowserDriver;
import com.lamdatest.page.HeaderPage;

public class HeaderPageTest {
	
	private HeaderPage headerPage;
	@BeforeMethod
	public void setUp() {
		BrowserDriver.start();
		headerPage = new HeaderPage();
	}
	@Test(priority = 1)
	public void verifyAllWebElmPresentsOnHeader() {
		// Web Elm present check
		Assert.assertEquals(headerPage.homeMenuDisplayChecK(), true, "Home Menu Must Be Present");
		Assert.assertEquals(headerPage.specialMenuDisplayChecK(), true, "Special Menu Must Be Present");
		Assert.assertEquals(headerPage.blogMenuDisplayChecK(), true, "Blog Menu Must Be Present");
		Assert.assertEquals(headerPage.megaMenuDisplayChecK(), true, "Mega Menu Must Be Present");
		Assert.assertEquals(headerPage.addOnsMenuDisplayChecK(), true, "Add Ons Menu Must Be Present");
		Assert.assertEquals(headerPage.myAccountMenuDisplayChecK(), true, "My Account Menu Must Be Present");
		
	}
     @Test(priority = 2)
	public void verifyContentsOfHeaderMenu() {
		
		Assert.assertEquals(headerPage.getHomeMenuText(), "Home", "They Must be Matched ");
		Assert.assertEquals(headerPage.getSpecialMenuText(), "Special", "They Must be Matched ");
		Assert.assertEquals(headerPage.getBlogMenuText(), "Blog", "They Must be Matched ");
		Assert.assertEquals(headerPage.getAddOnsMenuText(), "AddOns", "They Must be Matched ");
		Assert.assertEquals(headerPage.getMegaMenuText(), "Mega Menu", "They Must be Matched ");
		Assert.assertEquals(headerPage.getMyAccountMenuText(), "My account", "They Must be Matched ");
	}
     @Test(priority = 3)
     public void verifyMouseHoverOverMyAccountMenu() {
    	 headerPage.hoverOverMyAcountMenu();
    	 Assert.assertEquals(headerPage.loginMenuDisplayCheck(), true, "Add Ons Menu Must Be Present");
 		Assert.assertEquals(headerPage.registerMenuDisplayCheck(), true, "My Account Menu Must Be Present");
    }
     @Test(priority = 4)
     public void verifyClickOnRegisterMenu() {
    	 headerPage.hoverOverMyAcountMenu();
    	 headerPage.clickRegisterMenu();
    	 Assert.assertEquals(headerPage.getTitleOfRegisterPage(), "Register Account", " Title must Matched");
     }
	@AfterMethod
	public void tearDown() {
		BrowserDriver.close();
	}
	

}
