package com.lamdatest.page;

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
	private WebElement webElmFirstNameLbl;
	
	@FindBy(xpath = "//label[text()='Last Name']")
	private WebElement webElmLastNameLbl;
	
	@FindBy(xpath = "//label[text()='First Name']")
	private WebElement webElmEmlLbl;
	@FindBy(how = How.ID, using = "input-firstname")
	private WebElement webElmFirstNameTxt;
	@FindBy(how = How.ID, using = "input-lastName")
	private WebElement webElmLastNameTxt;
	@FindBy(how = How.ID, using = "input-email")
	private WebElement webElmEmailTxt;
	
	public RegisterPage() {
		driver = BrowserDriver.getWebDriver();
		PageFactory.initElements(driver, this);
		
	}
	public boolean headerElmCheck() {
		return webElmRegisterAccount.isDisplayed();
	}
	public boolean firstNameLabelCheck() {
		return webElmFirstNameLbl.isDisplayed();
	}
	
	public void firstNameTextSend() {
		webElmFirstNameTxt.sendKeys("Narayan");
		
	}
	

}
