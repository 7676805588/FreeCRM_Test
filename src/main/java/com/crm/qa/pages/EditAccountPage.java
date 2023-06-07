package com.crm.qa.pages;

//import org.apache.bcel.generic.Select;
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.crm.qa.base.TestBase;

public class EditAccountPage extends TestBase {

	// PageFactory or object Repository

	@FindBy(xpath = "//img[@title='naveenopencart']")
	WebElement Logo;

	@FindBy(xpath = "//a[normalize-space()='Edit Information']")
	WebElement Edit_Information;
	// h1[normalize-space()='My Account Information']
	@FindBy(xpath = "//h1[normalize-space()='My Account Information']")
	WebElement My_Account_Information;
	@FindBy(xpath = "//input[@id='input-firstname']")
	WebElement First_Name;
	@FindBy(xpath = "//input[@id='input-lastname']")
	WebElement Last_Name;
	// input[@id='input-email']
	@FindBy(xpath = "//input[@id='input-email']")
	WebElement E_Mail;
	// input[@id='input-telephone']
	@FindBy(xpath = "//input[@id='input-telephone']")
	WebElement Telephone;
	@FindBy(xpath = "//input[@value='Continue']")
	WebElement ContinueBtn;
	@FindBy(xpath = "//a[@class='btn btn-default']")
	WebElement BackBtn;
	@FindBy(xpath = "//img[@title='iMac']")
	WebElement ImacImage;
	@FindBy(xpath = "//select[@id='input-sort']")
	WebElement sortBy;
	// Initialize the above elements
	public EditAccountPage() {
		PageFactory.initElements(driver, this);
	}

	// Different methods in login page

	public String validateEditAccountPageTitle() {
		return driver.getTitle();
	}

	public boolean validateEditAccountPageLogo() {
		System.out.println("Logo of login page is :-" + Logo.getText());
		return Logo.isDisplayed();

	}

	public boolean validateFirstName() {

		return First_Name.isDisplayed();
	}

	public boolean validateLastName() {
		return Last_Name.isDisplayed();
	}

	public boolean validateEMail() {
		return E_Mail.isDisplayed();
	}

	public boolean validateTelephone() {
		return Telephone.isDisplayed();
	}
	public Homepage clickBackBtn() {
		BackBtn.click();
		return new Homepage();
	}

	public LoginPage clickContinueBtn() {
		ContinueBtn.click();
		return new LoginPage();
	}
	
//	public void selectSortByDropDown(String input-sort) {
//		Select select = new Select(driver.findElement(By.id("input-sort")));
//		select.selectByVisibleText(input-sort);
//	}

}
