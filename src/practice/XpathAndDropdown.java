package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class XpathAndDropdown {

public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
driver.findElement(By.className("login")).click();
driver.findElement(By.id("email_create")).sendKeys("thusemail@yahoo.com");
driver.findElement(By.id("SubmitCreate")).click();	
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
driver.findElement(By.id("id_gender1")).click();
//Relative x-path Rule 2.//tagName[@attribute='value'][@attribute='value']
driver.findElement(By.xpath("//input[@name='customer_firstname'][@id='customer_firstname']")).sendKeys("John");
//Relative x-path Rule 3.//tagName[contains(@attribute,'value')]
driver.findElement(By.xpath("//input[contains(@id,'customer_lastname')]")).sendKeys("Smith");
//Relative x-path Rule 1.//tagName[@attribute='value']
driver.findElement(By.xpath("//input[@id='email']"));
//Relative x-path Rule 4.//tagName[starts-with(@attribute,'value')]
driver.findElement(By.xpath("//input[starts-with(@name,'passwd')]")).sendKeys("Abc1234");
//Relative x-path Rule 5.//tagName[starts-with(@attribute,'value')and(@attribute='value')]
driver.findElement(By.xpath("//input[starts-with(@name,'address1')and(@id='address1')]")).sendKeys("55 Water st");
//Relative x-path Rule 6. //tagName[starts-with(@attribute,'value') or (@attribute='value')]
	WebElement drpDays = driver.findElement(By.xpath("//select[starts-with(@id,'day') or (@name='day')]"));
	drpDays.click();
	Select Day=new Select(drpDays);
	Day.selectByIndex(5);
//Relative x-path Rule 7. //*[@attribute='value']
	WebElement drpmonth = driver.findElement(By.xpath("//*[@name='months']"));
	drpmonth.click();
	Select Month=new Select(drpmonth);
	Month.selectByValue("7");
//Relative x-path Rule 8.//*[@attribute='value' or @attribute='value']
	WebElement drpyear = driver.findElement(By.xpath("//*[@id='years' or @name='years']"));
	drpyear.click();
	Select Year=new Select(drpyear);
	Year.selectByValue("2021");
//Relative x-path Rule 9.//*[@attribute='value' and @attribute='value']
driver.findElement(By.xpath("//*[@type='checkbox' and @name='newsletter']")).click();	
//Relative x-path Rule 10.//*[@attribute='value' and @attribute='value' or @attribute='value']
driver.findElement(By.xpath("//*[@type='checkbox' and @name='optin' or @id='optin']")).click();
	


	
	

	









}

}
