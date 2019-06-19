package com.syntax.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.syntax.utils.BaseClass;

public class AddEmployee extends BaseClass {

	@FindBy(xpath = "//span[text()='PIM']")
	public WebElement PIM;

	
	@FindBy(id="middleName")
    public WebElement middleName;
	
	@FindBy(xpath = "//span[text()='Add Employee']")
	public WebElement addEmp;
	
	 @FindBy(xpath="//div[@id='location_inputfileddiv']//ul")
	    public WebElement locationList;
	 
	 @FindBy(xpath="//span[@id='pim.navbar.employeeName']")
	    public WebElement empCheck;
	
	@FindBy (id="systemUserSaveBtn")
	public WebElement saveBtn;

	@FindBy(css = "input#firstName")
	public WebElement firstName;

	@FindBy(css = "input#lastName")
	public WebElement lastName;

	@FindBy(id = "employeeId")
	public WebElement idEmp;

	
	 @FindBy(xpath="//div[@id='location_inputfileddiv']//input")
	    public WebElement location;
	 
	 
	public AddEmployee() {
		PageFactory.initElements(driver, this);

	}
}
