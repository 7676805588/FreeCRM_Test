package com.crm.qa.pages;

import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class RegFormPage extends TestBase {
	// PageFactory or object Repository
	@FindBy(xpath = "//i[@class='fa fa-user']")
	WebElement MyAccountLink;
	@FindBy(xpath = "//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Register']")
	WebElement RegistrationLink;
	@FindBy(xpath = "//img[@title='naveenopencart']")
	WebElement RegFormPagelogo;
	@FindBy(xpath = "//h1[normalize-space()='Register Account']")
	WebElement RegisterAccount;
	@FindBy(xpath = "//legend[normalize-space()='Your Personal Details']")
	WebElement YourPersonalDetails;
	@FindBy(xpath = "//input[@id='input-firstname']")
	WebElement FirstName;
	@FindBy(xpath = "//input[@id='input-lastname']")
	WebElement LastName;
	@FindBy(xpath = "//input[@id='input-email']")
	WebElement EMail;
	@FindBy(xpath = "//input[@id='input-telephone']")
	WebElement Telephone;
	@FindBy(xpath = "//input[@id='input-password']")
	WebElement Password;
	@FindBy(xpath = "//input[@id='input-confirm']")
	WebElement PasswordConfirm;

	@FindBy(xpath = "//input[@name='agree']")
	WebElement regPolicyCheckbox;
	@FindBy(xpath = "//input[@value='Continue']")
	WebElement clickContinuebtn;

	// Initialize the above elements
	public RegFormPage() {
		PageFactory.initElements(driver, this);
	}

	// Different methods in login page
	//
	public String validateRegFormPageTitle() {
		return driver.getTitle();

	}

	public boolean validateRegFormPagelogo() {
		System.out.println("Logo of login page is :-" + RegFormPagelogo.getText());
		return RegFormPagelogo.isDisplayed();

	}

	public boolean validateregFormHeader() {
		return RegisterAccount.isDisplayed();
	}

	public boolean validateregFormHeaderLine() {
		return YourPersonalDetails.isDisplayed();
	}

	public void registrationTabClick() {

		MyAccountLink.click();
		RegistrationLink.click();

	}

	public RegistrationSuccessPage enterRegistrationDetails(String f_Name, String l_Name, String e_mail, String ph_no,
			String n_pwd, String cnf_Pass) {
		registrationTabClick();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)");
		FirstName.click();
		js.executeScript("arguments[0].scrollIntoView();", FirstName);
		FirstName.sendKeys(f_Name);
		LastName.click();
		js.executeScript("arguments[0].scrollIntoView();", LastName);
		LastName.sendKeys(l_Name);
		EMail.click();
		js.executeScript("arguments[0].scrollIntoView();", EMail);
		EMail.sendKeys(e_mail);
		
		Telephone.click();
		js.executeScript("arguments[0].scrollIntoView();", Telephone);
		Telephone.sendKeys(ph_no);
		Password.click();
		js.executeScript("arguments[0].scrollIntoView();", Password);
		Password.sendKeys(n_pwd);
		PasswordConfirm.click();
		js.executeScript("arguments[0].scrollIntoView();", PasswordConfirm);
		PasswordConfirm.sendKeys(cnf_Pass);
		
		//js.executeScript("arguments[0].scrollIntoView();", regPolicyCheckbox);
		regPolicyCheckbox.click();
		clickContinuebtn.click();
//		loginTabClick();
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy(0,250)");
//		
//		username.sendKeys(un);
//		js.executeScript("arguments[0].scrollIntoView();", password);
//		password.sendKeys(pwd);
//		js.executeScript("arguments[0].scrollIntoView();", loginbtn);
//		loginbtn.click();

		return new RegistrationSuccessPage();

	}

	{

		// JavascriptExecutor js = (JavascriptExecutor) driver;
		// js.executeScript("arguments[0].scrollIntoView();", username);

		// js.executeScript("arguments[0].scrollIntoView();", password);

		// js.executeScript("arguments[0].scrollIntoView();", loginbtn);
		// loginbtn.click();
		// return new Homepage();
	}
	// public void loginTabClick() {
	// LoginLinkTab.click();
	// }
	// public Homepage validateLogin(String un,String pwd) {
	// loginTabClick();
	// JavascriptExecutor js = (JavascriptExecutor) driver;
	// js.executeScript("arguments[0].scrollIntoView();", username);
	//
	//// username.sendKeys(un);
	//// js.executeScript("arguments[0].scrollIntoView();", password);
	//// password.sendKeys(pwd);
	//// js.executeScript("arguments[0].scrollIntoView();", loginbtn);
	//// loginbtn.click();
	// return new Homepage();
	//
	// }

}
