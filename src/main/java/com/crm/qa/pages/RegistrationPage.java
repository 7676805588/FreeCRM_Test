package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.JavascriptExecutor;

import com.crm.qa.base.TestBase;

public class RegistrationPage extends TestBase  {
	// PageFactory or object Repository
		@FindBy(xpath="//span[@class='caret']")
		WebElement MyAccountSign;
		
		@FindBy(xpath="//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Register']")
		WebElement RegisterLink;
		
		@FindBy(xpath="//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Login']")
		WebElement LoginLink;
		
		@FindBy(xpath="//img[@title='naveenopencart']")
		WebElement RegistrationPageLogo;
		
		@FindBy(xpath="//a[normalize-space()='Desktops']")
		WebElement DesktopTab;
		
		@FindBy(xpath="//a[normalize-space()='Laptops & Notebooks']")
		WebElement LaptopTab;

		// Initialize the above elements
		public RegistrationPage() {
			PageFactory.initElements(driver, this);
		}
		// Different methods in login page

		public String validateRegistrationPageTitle() {
			return driver.getTitle();

		}

		public boolean validateRegLogo() {
			System.out.println("Logo of login page is :-"+RegistrationPageLogo.getText());
			return RegistrationPageLogo.isDisplayed();

		}
		public boolean validateRegDesktopTab() {
			DesktopTab.click();
			return DesktopTab.isEnabled();
		}
		public boolean validateRegLaptopTab() {
			return LaptopTab.isDisplayed();
		}
		public boolean validateMyAccountSign() {
			MyAccountSign.click();
			return MyAccountSign.isEnabled();
		}
		public RegFormPage selectRegister() {
			RegisterLink.click();
			return new RegFormPage();
		}
		
//		public Homepage validateLogin(String un,String pwd) {
//			loginTabClick();
//			JavascriptExecutor js = (JavascriptExecutor) driver;
//			js.executeScript("arguments[0].scrollIntoView();", username);
//			
////			username.sendKeys(un);
////			js.executeScript("arguments[0].scrollIntoView();", password);
////			password.sendKeys(pwd);
////			js.executeScript("arguments[0].scrollIntoView();", loginbtn);
////			loginbtn.click();
//			return new Homepage();
			

	}


