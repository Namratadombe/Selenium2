package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sendkey 
{
	public static void main(String[] args) 
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	//driver.findElement(By.xpath("//input[@name='email']")).sendKeys("namrata");
	
	WebElement UN=driver.findElement(By.xpath("//input[@name='email']"));
	
	UN.sendKeys("namrata");
	
	WebElement UN1=driver.findElement(By.xpath("//input[@name='pass']"));
	UN1.sendKeys("9910");
	
		
	
}

}
