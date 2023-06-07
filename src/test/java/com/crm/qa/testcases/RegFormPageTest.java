package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.crm.qa.base.TestBase;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.RegFormPage;
import com.crm.qa.pages.RegistrationSuccessPage;
import com.crm.qa.util.TestUtil;

public class RegFormPageTest extends TestBase {
	LoginPage loginPage;
	RegFormPage regFormPage;
	RegistrationSuccessPage registrationSuccessPage;
	String sheetName ="Registration";
	public RegFormPageTest() {
		super();
	}

	@BeforeMethod
	public void setup() {
		initilization();
		loginPage = new LoginPage();
		regFormPage = new RegFormPage();
	}

	@Test(priority = 1)
	public void validateRegFormPageTitleTest() {
		String title = regFormPage.validateRegFormPageTitle();
		System.out.println("Title of regFormPage page is :- " + title);
		Assert.assertEquals(title, "Your Store");

	}

	@Test(priority = 2)
	public void validateRegFormPagelogoTest() {
		boolean flag = regFormPage.validateRegFormPagelogo();
		Assert.assertTrue(flag);

	}

	@Test(priority = 3)
	public void registrationLinkClickTest() {

		regFormPage.registrationTabClick();
	}
	@DataProvider
	public Object[][] getOpencartTestData() {
		Object data[][]=TestUtil.getTestData(sheetName);
		return data;
	}
	

//	 @Test(priority = 4)
//	 public void registrationTest() {
////	 registrationLinkClickTest();
//	 regFormPage.registrationTabClick();
//	 registrationSuccessPage =
//	 regFormPage.enterRegistrationDetails(prop.getProperty("firstname"),prop.getProperty("lastname"),prop.getProperty("username"),prop.getProperty("telephone"),prop.getProperty("r_password"),prop.getProperty("cn_password"));
	
	
	 @Test(priority = 4,dataProvider="getOpencartTestData")
	 public void registrationTest(String firstName,String lastName,String email,String telephone,String password,String cnfpassword) {
//	 registrationLinkClickTest();
	 regFormPage.registrationTabClick();
//	 registrationSuccessPage =
//			 regFormPage.enterRegistrationDetails(prop.getProperty("firstname"),prop.getProperty("lastname"),prop.getProperty("username"),prop.getProperty("telephone"),prop.getProperty("r_password"),prop.getProperty("cn_password"));
	 registrationSuccessPage = regFormPage.enterRegistrationDetails(firstName,lastName,email,telephone,password,cnfpassword);
	 
	 }
	 @AfterMethod
		public void tearDown() throws Throwable {
			Thread.sleep(3000);
			driver.quit();
		}

}
