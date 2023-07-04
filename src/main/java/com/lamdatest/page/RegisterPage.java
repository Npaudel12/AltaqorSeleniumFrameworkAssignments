package com.lamdatest.page;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.lamdatest.baselayer.BrowserDriver;

public class RegisterPage {
	
	private WebDriver driver;
	@FindBy(how= How.XPATH, using = "//h1[text()='Register Account']")
	private WebElement webElmRegisterAccount;
	
	@FindBy(xpath = "//label[text()='First Name']")
	private WebElement fnameWebElmLbl;
	
	@FindBy(xpath = "//label[text()='Last Name']")
	private WebElement lnameWeElmLbl;
	
	@FindBy(xpath = "//label[@for='input-email']")
	private WebElement emailWebElmLbl;
	@FindBy(xpath = "//label[text()='Telephone']")
	private WebElement phWebElmLbl;
	@FindBy(xpath = "//label[text()='Password']")
	private WebElement pwdWebElmLbl;
	@FindBy(xpath = "//label[text()='Password Confirm']")
	private WebElement confirmpWebElmLbl;
	@FindBy(xpath = "//label[text()='Subscribe']")
	private WebElement subscribeWebElmLbl;
	@FindBy(xpath = "//label[text()='Yes']")
	private WebElement yesWebElm;
	@FindBy(xpath = "//label[text()='No']")
	private WebElement noWebElm;
	@FindBy(xpath = "//label[@for='input-agree']")
	private WebElement agreeWebElm;
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement continueWebElm;
	
	@FindBy(how = How.ID, using = "input-firstname")
	private WebElement webElmFirstNameTxt;
	@FindBy(how = How.ID, using = "input-lastname")
	private WebElement webElmLastNameTxt;
	@FindBy(how = How.ID, using = "input-email")
	private WebElement webElmEmailTxt;
	@FindBy(how = How.ID, using = "input-telephone")
	private WebElement webElmPhnTxt;
	@FindBy(how = How.ID, using = "input-password")
	private WebElement webElmPwdTxt;
	@FindBy(how = How.ID, using = "input-confirm")
	private WebElement webElmCPwdTxt;
	@FindBy(xpath="(//div[@id='account-register']//div)[1]")
	private WebElement warningWebElm;
	
	
	public RegisterPage() {
		driver = BrowserDriver.getWebDriver();
		PageFactory.initElements(driver, this);
		
	}
	public String getRegisterPageTitle() {
		return driver.getTitle();
		
	}
	public boolean headerElmCheck() {
		return webElmRegisterAccount.isDisplayed();
		
	}
	public String getHeaderElmText() {
		return webElmRegisterAccount.getText();
	}
	public boolean firstNameLabelCheck() {
		return fnameWebElmLbl.isDisplayed();
	}
	public boolean lastNameLabelCheck() {
		return lnameWeElmLbl.isDisplayed();
	}
	public boolean emailLabelCheck() {
		return emailWebElmLbl.isDisplayed();
	}
	public boolean phLabelCheck() {
		return phWebElmLbl.isDisplayed();
	}
	public boolean pwdLabelCheck() {
		return pwdWebElmLbl.isDisplayed();
	}
	public boolean cPwdLabelCheck() {
		return confirmpWebElmLbl.isDisplayed();
	}
	public boolean subscribeLabelCheck() {
			return subscribeWebElmLbl.isDisplayed();
		
	}
	public boolean yesLabelCheck() {
		return yesWebElm.isDisplayed();
	}
	public boolean noLabelCheck() {
		return noWebElm.isDisplayed();
	}
	public boolean agreeLabelCheck() {
		return agreeWebElm.isDisplayed();
	}
	public boolean continueLabelCheck() {
		return continueWebElm.isDisplayed();
	}
	public String getFnameLblText() {
		return fnameWebElmLbl.getText();
		
	}
	public String getLnameLblText() {
		return lnameWeElmLbl.getText();
		
	}
	public String getPhoneLblText() {
		return phWebElmLbl.getText();
		
	}
	public String getEmailLblText() {
		return emailWebElmLbl.getText();
		
	}
	public String getPwdLblText() {
		return pwdWebElmLbl.getText();
		
	}
	public String getCpwdText() {
		return confirmpWebElmLbl.getText();
		
	}
	public String getsuscribeWebElmText() {
		return subscribeWebElmLbl.getText();
	}
	public void clickContinue() {
		continueWebElm.click();
	}
	public boolean warningWebElmCheck() {
		
		try {
			warningWebElm.isDisplayed();
			return true;
		}catch (Exception e) {
			return false;
		}
	
		
	
	}
	public String getWarningText() {
		return warningWebElm.getText();
	}
	public void clickPrivacayPolicy() {
	agreeWebElm.click();
	}
	// enter values in registration page
	public void enterFname(String firstName) {
		webElmFirstNameTxt.sendKeys(firstName);
		
	}
	
	public void enterLname(String lastName) {
		webElmLastNameTxt.sendKeys(lastName);
	}
	
	
}
