package com.syntax.testcases;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.syntax.pages.HomePage;
import com.syntax.pages.LoginPage;
import com.syntax.pages.LoginPage2;
import com.syntax.utils.BaseClass;
import com.syntax.utils.CommonMethods;
import com.syntax.utils.ConfigsReader;

public class LoginPageTest extends BaseClass{

	@Test(groups="Regression")
	public void loginToOrangeHRM() throws InterruptedException {
		logger=report.createTest("Negative Login");
		logger.info("Logging in with valid credentials");
		LoginPage login=new LoginPage();
		
		CommonMethods.sendText(login.username, "Admin");
		CommonMethods.sendText(login.password, "@JoaQsV8E15");
		CommonMethods.click(login.btnLogin);
		Thread.sleep(3000);
		logger.info("Verifying dashboard text is displayed");
		HomePage home=new HomePage();
		boolean isDisplayed=home.dashboardText.isDisplayed();
		
		Assert.assertTrue(isDisplayed);
		logger.pass("Successfully logged in");
	}
	
	@Test (groups="Regression")
	public void doLogin() {
		logger=report.createTest("Login verification 2");
		LoginPage2 login=new LoginPage2();
		CommonMethods.sendText(login.userName, ConfigsReader.getProperty("username"));
		CommonMethods.sendText(login.password, ConfigsReader.getProperty("password"));
		CommonMethods.click(login.loginBtn);
		
		HomePage home=new HomePage();
		boolean isDisplayed=home.dashboardText.isDisplayed();
		
		Assert.assertTrue(isDisplayed);
	}
	
}







