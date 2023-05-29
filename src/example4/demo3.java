package example4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo3 
{
	//xpath by contains with attribute - //tagname[contains(@ attributeName,'partial attribute value')] 
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		//Enter UN 
		
		driver.findElement(By.xpath("//input[contains(@placeholder,'phone number')]")).sendKeys("abc");
		Thread.sleep(2000);

		
		//Enter PWD 
		driver.findElement(By.xpath("//input[contains(@aria-label,'Password')]")).sendKeys("xyz");
		Thread.sleep(2000);
		

		//click on login btn 
		driver.findElement(By.xpath("//button[contains(@data-testid,'royal_login_button')]")).click();
		Thread.sleep(2000);

		
	}

}
