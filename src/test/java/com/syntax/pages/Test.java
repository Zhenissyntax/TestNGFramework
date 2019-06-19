package com.syntax.pages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.syntax.utils.BaseClass;
import com.syntax.utils.CommonMethods;

public class Test extends BaseClass {
	
	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		CommonMethods.takeScreenshot("hello");
		
	
//		TakesScreenshot ts = (TakesScreenshot) driver;
//		File scr = ts.getScreenshotAs(OutputType.FILE);
//
//		
//		
//		try {
//			FileUtils.copyFile(scr, new File("src\\test\\resources\\testData\\test.png"));
//		} catch (IOException e) {
//			e.printStackTrace();
//			System.out.println("Unable to take screesnhot");
//		}
	}		
		
		
	}
