package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.EditAccountPage;
import com.crm.qa.pages.Homepage;
import com.crm.qa.pages.LoginPage;

public class EditAccountPageTest extends TestBase {

	LoginPage loginPage;
	Homepage homepage;
	EditAccountPage editAccountPage;

	public EditAccountPageTest() {
		super();
	}

	@BeforeMethod
	public void setup() {
		initilization();
		loginPage = new LoginPage();
		homepage = loginPage.validateLogin(prop.getProperty("username"), prop.getProperty("password"));
		editAccountPage =homepage.EditAccountClick();
	}

	@Test(priority = 0)
	public void EditAccountPageTitleTest() {
		String title = editAccountPage.validateEditAccountPageTitle();
		System.out.println("Title of login page is :- " + title);
		Assert.assertEquals(title, "My Account Information", "Edit Account page title is not matching");
	}

	@Test(priority = 1)
	public void validateEditAccountPageTest() {
		boolean flag = editAccountPage.validateEditAccountPageLogo();
		Assert.assertTrue(flag);

	}

	@Test(priority = 2)
	public void validateFirstNameTest() {
		editAccountPage.validateFirstName();
	}

	@Test(priority = 3)
	public void validateLastNameTest() {
		editAccountPage.validateLastName();
	}

	@Test(priority = 4)
	public void vvalidateEMailTest() {
		editAccountPage.validateEMail();
	}

	@Test(priority = 5)
	public void validateTelephoneTest() {
		editAccountPage.validateTelephone();
	}
	@Test(priority = 6)
	public void validateclickBackBtnTest() {
		editAccountPage.clickBackBtn();
	}
	@Test(priority = 7)
	public void validateclickContinueBtnTest() {
		editAccountPage.clickContinueBtn();
	}
	
	@AfterMethod
	public void tearDown() {

		driver.quit();
	}
}
