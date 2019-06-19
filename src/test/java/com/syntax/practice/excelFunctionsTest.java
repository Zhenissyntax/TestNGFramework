package com.syntax.practice;

import org.testng.annotations.Test;

import com.syntax.utils.Constants;
import com.syntax.utils.ExcelUtility;

public class excelFunctionsTest {
 @Test 
 public void excelTest() {
	 ExcelUtility obj =new ExcelUtility();
	 obj.openExcel(Constants.XL_FILEPATH, "DataProvider");
	// String value = obj.getCellData(2, 3);
	// System.out.println(value);
	 
	 //retrieve and store values into Dataprovider
	 int row= obj.getRowNum();
	 int cell=obj.getColNum(0);
	 Object [][] data= new Object[row-1][cell];
     for (int i=1; i<row;i++) {
    	 for (int j=0; j<cell; j++) {
    		 
    		String value = obj.getCellData(i, j);
    		data[i-1][j]=value;
    	 }
     }
	 System.out.println(data.length);
 }
}
