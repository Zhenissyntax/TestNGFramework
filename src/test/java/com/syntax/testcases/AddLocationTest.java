package com.syntax.testcases;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.syntax.pages.AddEmployee;
import com.syntax.pages.AddLocation;
import com.syntax.pages.HomePage;
import com.syntax.pages.LoginPage2;
import com.syntax.utils.BaseClass;
import com.syntax.utils.CommonMethods;
import com.syntax.utils.ConfigsReader;

public class AddLocationTest extends BaseClass {
	/*
	 * Test Case: Add Location 1. Login to OrangeHRM 2. From Admin --> Organization
	 * select Locations 3. Add 5 different locations by providing complete required
	 * details (Use data provider) 4. Save location and verify it has been
	 * successfully saved.
	 */
	@Test(dataProvider = "Location Details")
	public void addLocation(String Name, String Country,  String city, String zip,
			String phone, String fax, String address) throws InterruptedException {

		LoginPage2 login = new LoginPage2();
		HomePage home = new HomePage();
		AddLocation addLoc = new AddLocation();
		// login to the OrangeHRM
		login.login(ConfigsReader.getProperty("username"), ConfigsReader.getProperty("password"));
		// navigate to admin

		CommonMethods.click(home.admin);
		// navigate organization
		CommonMethods.click(home.organization);
		// navigate to locations
		CommonMethods.click(home.location);
		// click AddLocation
		CommonMethods.click(home.addLocation);
		CommonMethods.sendText(addLoc.Name, Name);
		CommonMethods.click(addLoc.country);
	    CommonMethods.selectList(addLoc.countryList, Country);
		
	    
		CommonMethods.sendText(addLoc.city, city);
		CommonMethods.sendText(addLoc.zipCode, zip);
		CommonMethods.sendText(addLoc.phone, phone);
		CommonMethods.sendText(addLoc.fax, fax);
		CommonMethods.sendText(addLoc.address, address);
	   
	  
		Thread.sleep(5000);
		CommonMethods.click(addLoc.Save);
		// verify employee is added
	Thread.sleep(5000);
		// navigate to admin

	
	}

	@DataProvider(name = "Location Details")
	public Object[][] getData() {
//String Name, String Country, String timeZone, String province, String city, String zip, String phone, String fax, String address)

		Object[][] data = new Object[5][7];
		// 1 set
		data[0][0] = "Facebook";
		data[0][1] = "Czech Republic";
		
		data[0][2] = "San-Francisco";
		data[0][3] = "99156";
		data[0][4] = "7894571599";
		data[0][5] = "156487987";
		data[0][6] = "55000 Freedom blvd.";

		// 2 set
		data[1][0] = "Apple";
		data[1][1] = "UCzech Republic";
		
		data[1][2] = "San-Francisco";
		data[1][3] = "784655";
		data[1][4] = "2407845501";
		data[1][5] = "5778917747";
		data[1][6] = "7788 Sky ave.";

		// 3 set
		data[2][0] = "Tesla";
		data[2][1] = "Czech Republic";
		
		data[2][2] = "New-York";
		data[2][3] = "287488";
		data[2][4] = "78945784488";
		data[2][5] = "156488489";
		data[2][6] = "777 Tesla blvd.";

		// 4 set
		data[3][0] = "BofA";
		data[3][1] = "Czech Republic";
		
		data[3][2] = "San-Francisco";
		data[3][3] = "77894";
		data[3][4] = "321445665";
		data[3][5] = "1564875584";
		data[3][6] = "801 counters blvd.";

		// 5 set
		data[4][0] = "CapitalOne";
		data[4][1] = "Czech Republic";
		
		data[4][2] = "Houston";
		data[4][3] = "454776";
		data[4][4] = "7015864483";
		data[4][5] = "1043336241";
		data[4][6] = "842 Ocean blvd.";

		return data;
	}
}
