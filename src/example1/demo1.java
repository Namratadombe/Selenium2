package example1;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo1 
{
	public static void main(String[] args) throws InterruptedException 
{
		//enter UN 
		//driver.findElement("Locator type") 

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("namratadombe@yahoo.in"); 
		Thread.sleep(2000);
		
		
		//Enter PWD 
		
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("redmi@5a");
		Thread.sleep(2000);
		
		//click on login btn 
		
		driver.findElement(By.xpath("//button[@name='login']")).click();
		Thread.sleep(2000);
	
}

}
