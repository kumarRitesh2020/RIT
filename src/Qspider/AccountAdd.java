package Qspider;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountAdd {
	
	WebDriver driver=webDriverUtility.openBrowserWithApplication(browser, longTimeout, url);
	
	driver.findElement(By.name("user")).sendKeys(username);
	driver.findElement(By.name("password")).sendKeys(password);
	driver.findElement(By.xpath("//button[text()='Login']")).click();
	webDriverUtility.handlePopup(driver);
	driver.findElement(By.xpath("//span[text()='Accounts']")).click();
	driver.findElement(By.xpath("//i[@class='fas fa-fw fa-plus']")).click();
	WebElement nameList=driver.findElement(By.name("empid"));
	webDriverUtility.handleDropDownByVisibleText(nameList, customer);
	driver.findElement(By.xpath("//div[@class='form-group']/input[@name='username']")).sendKeys(username1);
	driver.findElement(By.xpath("//div[@class='form-group']/input[@name='password']")).sendKeys(password1);
	driver.findElement(By.xpath("(//button[@type='submit'])[5]")).click();
	List<WebElement>alldata= driver.findElements(By.xpath("//div[@class='card shadow mb-4']/descendant::div[@class='table-responsive']/table//tbody/tr/td[1]"));
	//List<WebElement>alldata= driver.findElements(By.xpath("//div[@class='card shadow mb-4']/descendant::div[@class='table-responsive']/table"));
	   boolean status=false;
	   for(WebElement ele:alldata)
	   {
		   String value=ele.getText();
		   System.out.println(value);
		   if(value.contains("customer"))
				   {
			   status=true;
			   System.out.println("TC PASS");
			   break;
		   }
			   else {
				   System.out.println("TC FAIL");
			   }
	driver.findElement(By.xpath("//*[@id=\"userDropdown\"]/img")).click();
	driver.findElement(By.xpath("//*[@id=\"content\"]/nav/ul/li[2]/div/a[2]")).click();
	driver.findElement(By.xpath("(//a[text()='Logout'])[1]")).click();



}
