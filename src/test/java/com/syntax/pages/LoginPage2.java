package com.syntax.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.syntax.utils.BaseClass;
import com.syntax.utils.CommonMethods;

public class LoginPage2 extends BaseClass {
	
@FindBy(id="txtUsername")
public WebElement userName;

@FindBy(name="txtPassword")
public WebElement password;


@FindBy(id="btnLogin")
public WebElement loginBtn;

public LoginPage2() {
	PageFactory.initElements(driver, this);
}

public void login(String uname,String pwd) {
	CommonMethods.sendText(userName, uname);
	CommonMethods.sendText(password, pwd);
	CommonMethods.click(loginBtn);
}

}
