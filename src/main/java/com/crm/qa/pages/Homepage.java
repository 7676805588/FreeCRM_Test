package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class Homepage extends TestBase {
	// PageFactory or object Repository
	@FindBy(xpath = "//img[@title='naveenopencart']")
	WebElement HomepageLogo;
	@FindBy(xpath = "//a[normalize-space()='Edit Account']")
	WebElement EditAccount;
	@FindBy(xpath = "//a[normalize-space()='Password']")
	WebElement ResetPassword;
	@FindBy(xpath = "//a[normalize-space()='Address Book']")
	WebElement AddressBook;
	@FindBy(xpath = "//a[@class='list-group-item'][normalize-space()='Order History']")
	WebElement WishList;
	@FindBy(xpath = "//a[normalize-space()='Desktops']")
	WebElement DesktopLink;
	@FindBy(xpath = "//a[normalize-space()='Mac (1)']")
	WebElement DesktopLinkMac;
	
	
	// Initialize the above elements
		public Homepage() {
			PageFactory.initElements(driver, this);
		}
		// Different methods in login page

		public String validateHomepageTitle() {
			return driver.getTitle();

		}

		public boolean validateHomepageLogo() {
			System.out.println("Logo of login page is :-"+HomepageLogo.getText());
			return HomepageLogo.isDisplayed();

		}

		public EditAccountPage EditAccountClick() {
			EditAccount.click();
			return new EditAccountPage();
			
		}
		public ResetPasswordPage ResetPasswordClick() {
			ResetPassword.click();
			return new ResetPasswordPage();
			
		}
		public AddressBookPage AddressBookClick() {
			AddressBook.click();	
			return new AddressBookPage();
		}
		public WishListPage WishListClick() {
			WishList.click();	
			return new WishListPage();
		}
		public void clickOnDesktopOptionsMac() {
			Actions action =new Actions(driver);
			action.moveToElement(DesktopLink).build().perform();
			DesktopLinkMac.click();
		}
//		public Homepage validateLogin(String un,String pwd)  {
//			loginTabClick();
//			JavascriptExecutor js = (JavascriptExecutor)driver;
//			js.executeScript("window.scrollBy(0,250)");
//			
//			username.sendKeys(un);
//			js.executeScript("arguments[0].scrollIntoView();", password);
//			password.sendKeys(pwd);
//			js.executeScript("arguments[0].scrollIntoView();", loginbtn);
//			loginbtn.click();
//			return new Homepage();
//			
//		}

}
