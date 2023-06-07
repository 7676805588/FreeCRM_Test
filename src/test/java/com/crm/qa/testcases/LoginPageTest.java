package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.Homepage;

import com.crm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {
	LoginPage loginPage;
	Homepage homepage;

	public LoginPageTest() {
		super();
	}

	@BeforeMethod
	public void setup() {
		initilization();
		loginPage = new LoginPage();
	}
	@Test(priority = 1)
	public void loginPageTitleTest() {
		String title = loginPage.validateLoginPageTitle();
		System.out.println("Title of login page is :- "+ title);
		Assert.assertEquals(title,"Your Store");
		
	}
	@Test(priority = 2)
	public void LogoTest() {
		boolean flag = loginPage.validateLogo();
		Assert.assertTrue(flag);
		
	}
	@Test(priority = 3)
	public void LoginLinkTest() {
		
		loginPage.loginTabClick();
	}
	
	@Test(priority = 4)
	public void LoginTest() {
		loginPage.loginTabClick();
		homepage = loginPage.validateLogin(prop.getProperty("username"), prop.getProperty("password"));
	
	}
	

//	
//	@Test(priority = 3)
//	public void searchBoxTest() {
//		boolean flag_2 = loginPage.searchBox();
//		Assert.assertTrue(flag_2);
//	}
//
//	
//
//	@Test(priority = 4)
//	public void loginTest() {
//		homepage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
//	}

	@AfterMethod
	public void tearDown() {
		
		driver.quit();
	}
}
