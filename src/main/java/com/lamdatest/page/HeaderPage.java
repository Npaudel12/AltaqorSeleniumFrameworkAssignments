package com.lamdatest.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.lamdatest.baselayer.BrowserDriver;
import com.lamdatest.util.TestUtil;

public class HeaderPage {
	private WebDriver driver;
	
	@FindBy(linkText = "Home")
	private WebElement webElmHomeMenu;
	@FindBy(xpath = "//*[@id=\"widget-navbar-217834\"]/ul/li[2]/a/div/span")
	private WebElement webElmSpecialMenu;
	@FindBy(linkText = "Blog")
	private WebElement webElmBlogMenu;
	@FindBy(linkText = "Mega Menu")
	private WebElement webElmMegaMenu;
	@FindBy(xpath = "//*[@id=\"widget-navbar-217834\"]/ul/li[5]/a/div/span")
	private WebElement webElmAddOnsMenu;
	
	@FindBy(linkText = "My account")
	private WebElement webElmMyAccountMenu;
	
	// mouse hover over my account
	@FindBy(linkText = "Login")
	private WebElement webElmLogin;
	@FindBy(linkText = "Register")
	private WebElement webElmRegister;
	
	//intialize all the webelements
	public HeaderPage() {
		driver = BrowserDriver.getWebDriver();
		PageFactory.initElements(driver, this);		
	}
	// Dispaly Methods
	public boolean homeMenuDisplayChecK() {
		return webElmHomeMenu.isDisplayed();
	}
	public boolean specialMenuDisplayChecK() {
		return webElmSpecialMenu.isDisplayed();
	}
	public boolean blogMenuDisplayChecK() {
		return webElmBlogMenu.isDisplayed();
		
	}public boolean megaMenuDisplayChecK() {
		return webElmMegaMenu.isDisplayed();
	}
	public boolean addOnsMenuDisplayChecK() {
		return webElmAddOnsMenu.isDisplayed();
	}
	public boolean myAccountMenuDisplayChecK() {
		return webElmMyAccountMenu.isDisplayed();
	}
	// get text methods
	public String getHomeMenuText() {
		return webElmHomeMenu.getText();	
	}
	public String getSpecialMenuText() {
		return webElmSpecialMenu.getText();	
	}
	public String getBlogMenuText() {
		return webElmBlogMenu.getText();	
	}
	public String getMegaMenuText() {
		return webElmMegaMenu.getText();	
	}
	public String getAddOnsMenuText() {
		return webElmAddOnsMenu.getText();	
	}
	public String getMyAccountMenuText() {
		return webElmMyAccountMenu.getText();	
	}
	// hover over is used multiple times so we used one common method on utility layer to perform hove
	public void hoverOverMyAcountMenu() {
		TestUtil.hoverOverMenu(webElmMyAccountMenu);
		
	}
	
	public boolean loginMenuDisplayCheck() {
		return webElmLogin.isDisplayed();
		
	}
	public boolean registerMenuDisplayCheck() {
		return webElmRegister.isDisplayed();
		
	}
	public RegisterPage clickRegisterMenu() {
		webElmRegister.click();
		return new RegisterPage();
	}
	
	public String getTitleOfRegisterPage() {
		return driver.getTitle();
	}
	

}
