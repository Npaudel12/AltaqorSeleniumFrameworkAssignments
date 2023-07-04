package com.lamdatest.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.lamdatest.baselayer.BrowserDriver;

public class TestUtil {
	 static WebDriver driver; 
	 // this method used multiple times so we use one common method to perform hover 
	 public static void hoverOverMenu(WebElement webElement) {
    driver = BrowserDriver.getWebDriver();
	Actions actions = new Actions(driver);
	actions.moveToElement(webElement).build().perform();
	 }
	 
	static String baseProjectPath = System.getProperty("user.dir");   // need to remember
	static	String filePath = baseProjectPath + "\\src\\test\\resources\\TestdataForRegstrationPage.xlsx";
	
	 public static Object[][] readTestData(String sheetName) {
		 try {
			FileInputStream fileInputStream = new FileInputStream(filePath);
			Workbook workbook = WorkbookFactory.create(fileInputStream);
			Sheet sheet = workbook.getSheet(sheetName);
			
			int columnSize = sheet.getRow(0).getLastCellNum();
			int rowSize = sheet.getLastRowNum();
			Object[][] data = new Object[rowSize][columnSize];
			for (int i = 1; i<=rowSize; i++) {
				for (int j=0; j<=columnSize; j++) {
					data[i-1][j]= sheet.getRow(i).getCell(j).toString();
				}
			}
			return data;
		} catch (Exception  e) {
			
			
		}
		 return null;
	 }
	 
	 public static void main (String[] args) {
		 Object[][] data =readTestData("ValidTestData");
		 for (int i= 0; i<=2; i++)
			 for(int j= 0; j<=6; j++) {
				 System.out.println(data[i][j]);
			 }
	 
}
}
