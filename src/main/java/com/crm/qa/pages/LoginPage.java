package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.JavascriptExecutor;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {
	// PageFactory or object Repository
	@FindBy(xpath = "//img[@title='naveenopencart']")
	WebElement Opencartlogo;

	@FindBy(xpath = "//i[@class='fa fa-user']")
	WebElement MyAccountLink;
	@FindBy(xpath = "//a[normalize-space()='Login']")
	WebElement LoginLink;
	@FindBy(xpath = "//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Register']")
	WebElement RegistrationLink;
	@FindBy(xpath = "//input[@id='input-email']")
	WebElement username;
	@FindBy(xpath = "//input[@id='input-password']")
	WebElement password;
	@FindBy(xpath = "//input[@value='Login']")
	WebElement loginbtn;
	
	
	
	
////div[@class='overview-box monthly-views']


	// Initialize the above elements
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	// Different methods in login page

	public String validateLoginPageTitle() {
		return driver.getTitle();

	}

	public boolean validateLogo() {
		System.out.println("Logo of login page is :-"+Opencartlogo.getText());
		return Opencartlogo.isDisplayed();

	}

	public void loginTabClick() {
		MyAccountLink.click();
		LoginLink.click();
	}
	public RegFormPage registrationLinkClick() {
		MyAccountLink.click();
		RegistrationLink.click();
		return new RegFormPage();
	}
	public Homepage validateLogin(String un,String pwd)  {
		loginTabClick();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,250)");
		
		username.sendKeys(un);
		js.executeScript("arguments[0].scrollIntoView();", password);
		password.sendKeys(pwd);
		js.executeScript("arguments[0].scrollIntoView();", loginbtn);
		loginbtn.click();
		return new Homepage();
		
	}

	
}
