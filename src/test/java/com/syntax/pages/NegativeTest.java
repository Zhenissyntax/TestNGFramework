package com.syntax.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.syntax.utils.BaseClass;
import com.syntax.utils.CommonMethods;

public class NegativeTest extends BaseClass {
	@Test
	public void NegativeLogin()  {
		
		LoginPage login=new LoginPage();
		
		CommonMethods.sendText(login.username, "Admin123");
		CommonMethods.sendText(login.password, "@JoaQsV8E1123");
		CommonMethods.click(login.btnLogin);
	
		WebElement error=driver.findElement(By.cssSelector("div.toast-message"));
		if(error.isDisplayed()) {
			System.out.println("Unable to LOG IN");
		} else {
			System.out.println("Logged in");
		}
	
}
	
}

