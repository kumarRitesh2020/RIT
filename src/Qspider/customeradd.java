package Qspider;

public class customeradd {
	

package org.altairretro.practice;

import java.io.IOException;
import java.util.Map;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.sdet40.objectRepositiry.CommonPage;
import org.sdet40.objectRepositiry.CustomerPage;
import org.sdet40.objectRepositiry.LoginPage;
import org.sdet40.objectRepositiry.ProductAddPage;
import org.sdet40.objectRepositiry.TabNames;

import genericUtility.DataType;
import genericUtility.ExcelUtility;
import genericUtility.FileUtility;
import genericUtility.IConstantPath;
import genericUtility.JavaUtility;
import genericUtility.WebDriverUtility;



public class Customer  {
	static String username;
	static String password;
	static WebDriver driver;
	static WebDriverUtility webDriverUtility;
	static LoginPage lp;
	static CommonPage cp;
	
	static ExcelUtility excelUtility;
	static int randomNumber;
	static FileUtility fileUtility;
	static JavaUtility javaUtility; 

	
	public  static void main(String[] args)  throws EncryptedDocumentException, IOException {
	
		//creating instances for generic uility
     	ExcelUtility excelUtility=new ExcelUtility();
		FileUtility fileUtility=new FileUtility();
		JavaUtility javaUtility=new JavaUtility();
		WebDriverUtility webDriverUtility=new WebDriverUtility();
		
		
		//initialzation
		fileUtility.initializePropertyFile(IConstantPath.PROPERTY_FILE_PATH);
		excelUtility.openExcel(IConstantPath.EXCEL_PATH);
		
		//fetching the data from property file
		 String browser=fileUtility.getDataFromPropertyFile(IConstantPath.PROPERTY_FILE_PATH,"browser");
		 String url=fileUtility.getDataFromPropertyFile(IConstantPath.PROPERTY_FILE_PATH,"url");
		  username=fileUtility.getDataFromPropertyFile(IConstantPath.PROPERTY_FILE_PATH,"username");
		  password=fileUtility.getDataFromPropertyFile(IConstantPath.PROPERTY_FILE_PATH,"password");
		String timeouts=fileUtility.getDataFromPropertyFile(IConstantPath.PROPERTY_FILE_PATH,"timeout");
		
		
		 
		//fetching the data from Excel file
		String customer=excelUtility.getDataFromExcel(IConstantPath.EXCEL_PATH,"CommonData", 1,0);
		String LastName=excelUtility.getDataFromExcel(IConstantPath.EXCEL_PATH,"CommonData", 1,10);
		String phone=excelUtility.getDataFromExcel(IConstantPath.EXCEL_PATH,"CommonData", 1,1);
	//	Map<String,String>customer=excelUtility.getDataFromExcelInMap("CommonData");
	//	Map<String,String>phone=excelUtility.getDataFromExcelInMap("CommonData");
	
		//convert string to long
		long longTimeout=(long) javaUtility.convertStringtoAnyDatatype(timeouts, DataType.LONG);
			
		//launching the browser in run time based on browser key
		//	WebDriver driver= webDriverUtility.launchBrowser(browser);
			
		//pre-setting for the browser
			//webDriverUtility.maximizeBrowser(driver);
		//	webDriverUtility.waitTillPageLoad(driver,longTimeout);
			
		//navigating the application
		//	webDriverUtility.navigateApplication(driver, url);
		
			
		WebDriver driver=webDriverUtility.openBrowserWithApplication(browser, longTimeout, url);
		 //initialize all object repo class 
	
	    LoginPage lp=new LoginPage(driver);
		CommonPage cp=new CommonPage(driver);
		lp.loginAction(username, password);
		webDriverUtility.handlePopup(driver);
		cp.clickRequiredTab(TabNames.CUSTOMER, webDriverUtility);
		CustomerPage c=new CustomerPage(driver);
		c.customerAction(customer, phone, LastName);
		
	}

}


}
