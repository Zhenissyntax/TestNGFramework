package com.syntax.testcases;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelWriteDemo {

	
	
	@Test
	public void writeExcel() throws IOException {
		  String xlPath="src/test/resources/testData/OrangeHrmData.xlsx";
	        
	        FileInputStream fis =new FileInputStream(xlPath);
	        
	        XSSFWorkbook wbook=new XSSFWorkbook(fis);
	        
	     XSSFSheet sheet = wbook.getSheet("EmployeeDetails");
		//write to the excel
	     sheet.getRow(0).createCell(4).setCellValue("Result");
	     sheet.getRow(1).createCell(4).setCellValue("pass");
	
	     
	     FileOutputStream fos= new FileOutputStream(xlPath);
	     wbook.write(fos);
	     fos.close();
	     wbook.close();
	     fis.close();
	}
}
