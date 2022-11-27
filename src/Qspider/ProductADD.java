package Qspider;

public class ProductADD {
	
	package org.altairretro.practice;

	import java.io.IOException;


	import org.apache.poi.EncryptedDocumentException;

	import org.sdet40.objectRepositiry.ProductAddPage;
	import org.testng.annotations.Test;

	import genericUtility.BaseClass;



	public class ProductAdd extends BaseClass {
//		static String username;
//		static String password;
//		static WebDriver driver;
//		static WebDriverUtility webDriverUtility;
//		static LoginPage lp;
//		static CommonPage cp;
	//	
//		static ExcelUtility excelUtility;
//		static int randomNumber;
//		static FileUtility fileUtility;
//		static JavaUtility javaUtility; 
//		 
	@Test
		public  void addProduct() throws EncryptedDocumentException, IOException {
			//creating instances for generic uility
//					 excelUtility=new ExcelUtility();
//					 fileUtility=new FileUtility();
//					 javaUtility=new JavaUtility();
//					 webDriverUtility=new WebDriverUtility();
//					
//					
//					fileUtility.initializePropertyFile(IConstantPath.PROPERTY_FILE_PATH);
//					excelUtility.openExcel(IConstantPath.EXCEL_PATH);
//					
//					//fetching the data from property file
//					 String browser=fileUtility.getDataFromPropertyFile(IConstantPath.PROPERTY_FILE_PATH, "browser");
//					 String url=fileUtility.getDataFromPropertyFile(IConstantPath.PROPERTY_FILE_PATH,"url");
//					 username=fileUtility.getDataFromPropertyFile(IConstantPath.PROPERTY_FILE_PATH,"username");
//					 password=fileUtility.getDataFromPropertyFile(IConstantPath.PROPERTY_FILE_PATH,"password");
					
				//	String timeouts=fileUtility.getDataFromPropertyFile(IConstantPath.PROPERTY_FILE_PATH,"timeout");
////					
////					 
////					//fetching the data from Excel file
////				
					
					 String productcode=excelUtility.getDataFromExcel(IConstantPath.EXCEL_PATH,"CommonData", 1,2);
					 String productname=excelUtility.getDataFromExcel(IConstantPath.EXCEL_PATH,"CommonData", 1,3);
					 String productdescription=excelUtility.getDataFromExcel(IConstantPath.EXCEL_PATH,"CommonData", 1,4);
					 String productquantity=excelUtility.getDataFromExcel(IConstantPath.EXCEL_PATH,"CommonData", 1,5);
					 String productonhand=excelUtility.getDataFromExcel(IConstantPath.EXCEL_PATH,"CommonData", 1,6);
					 String productprice=excelUtility.getDataFromExcel(IConstantPath.EXCEL_PATH,"CommonData", 1,7);
					 String productdateinstock=excelUtility.getDataFromExcel(IConstantPath.EXCEL_PATH,"CommonData", 1,8);
					 String productsupplier=excelUtility.getDataFromExcel(IConstantPath.EXCEL_PATH,"CommonData", 1,9);
					// String phone=excelUtility.getDataFromExcel(IConstantPath.EXCEL_PATH,"CommonData", 1,1);
////					 
////					convert string to long
	          	//	long longTimeout=(long) javaUtility.convertStringtoAnyDatatype(timeouts, DataType.LONG);
////						
////					//launching the browser in run time based on browser key
////					//	WebDriver driver= webDriverUtility.launchBrowser(browser);
////						
////					//pre-setting for the browser
////						//webDriverUtility.maximizeBrowser(driver);
////					//	webDriverUtility.waitTillPageLoad(driver,longTimeout);
////						
////					//navigating the application
////					//	webDriverUtility.navigateApplication(driver, url);
////						
	          // 	WebDriver driver=webDriverUtility.openBrowserWithApplication(browser, longTimeout, url);
////					
////			driver.findElement(By.name("user")).sendKeys(username);
////			driver.findElement(By.name("password")).sendKeys(password);
////			driver.findElement(By.xpath("//button[text()='Login']")).click();
////			webDriverUtility.handlePopup(driver);
////			driver.findElement(By.xpath("//span[text()='Product']")).click();
////			driver.findElement(By.xpath("//i[contains(@class,'fas fa-fw fa-plus')]")).click();
////			driver.findElement(By.xpath("//input[@name='prodcode']")).sendKeys(productcode);
////			driver.findElement(By.xpath("//input[@name='name']")).sendKeys(productname);
////			driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys(productdescription);
////			driver.findElement(By.xpath("//input[@name='quantity']")).sendKeys(productquantity);
////			driver.findElement(By.xpath("//input[@type='number' and @placeholder='On Hand']")).sendKeys(productonhand);
////			driver.findElement(By.xpath("//h5[text()='Add Product']/following::input[@type='number' and @name='price']")).sendKeys( productprice);
////			
////			
////			  WebElement nameList1=driver.findElement(By.name("category"));
////			  nameList1.click(); 
////			  webDriverUtility.select(nameList1, "Others");
////			  
////			  WebElement nameList2=driver.findElement(By.xpath("//select[@name='supplier']"));
////			  nameList2.click(); 
////			  webDriverUtility.select(nameList2, productsupplier);
////			  
////			driver.findElement(By.xpath("//input[@placeholder='Date Stock In']")).click();
////			driver.findElement(By.xpath("//input[@placeholder='Date Stock In']")).sendKeys(productdateinstock);
////			driver.findElement(By.xpath("(//button[@type='submit'])[5]")).click();
////			
////	       driver.findElement(By.xpath("//img[@class='img-profile rounded-circle']")).click();
////			driver.findElement(By.xpath("//a[@class='dropdown-item'][normalize-space()='Logout']")).click();
////			driver.findElement(By.xpath("//div[@class='modal fade show']//a[@class='btn btn-primary'][normalize-space()='Logout']")).click();
	////	
//	           	LoginPage lp=new LoginPage(driver);
//	    		//CommonPage cp=new CommonPage(driver);
//	    		lp.loginAction(username, password);
	    		webDriverUtility.handlePopup(driver);
					ProductAddPage p= new ProductAddPage(driver);
				p.ProductPageAction(productcode, productname, productdescription, productquantity, productonhand, productprice, productdateinstock);
				p.selectcat();
				p.saveAction();
				}
			
		}


		




}
