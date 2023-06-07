package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.Homepage;
import com.crm.qa.pages.LoginPage;

public class HomepageTest extends TestBase {
	LoginPage loginPage;
	Homepage homepage;

	public HomepageTest() {
		super();
	}

	@BeforeMethod
	public void setup() {
		initilization();
		loginPage = new LoginPage();
		homepage = loginPage.validateLogin(prop.getProperty("username"), prop.getProperty("password"));
	}

	@Test(priority = 0)
	public void HomepageTitleTest() {
		String title = homepage.validateHomepageTitle();
		System.out.println("Title of login page is :- " + title);
		Assert.assertEquals(title, "My Account", "Homepage title is not matching");
	}

	@Test(priority = 1)
	public void validateHomepageLogoTest() {
		boolean flag = homepage.validateHomepageLogo();
		Assert.assertTrue(flag);

	}

	@Test(priority = 2)
	public void EditAccountClickTest() {
		homepage.EditAccountClick();
	}
	 @Test(priority = 3)
	public void homepageTest(){
	 homepage.ResetPasswordClick();
	 
	 }

	@AfterMethod
	public void tearDown() {

		driver.quit();
	}

}
