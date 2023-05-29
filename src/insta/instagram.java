package insta;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class instagram 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.instagram.com/");
		
		//enter UN 
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("namrata");
		
		//Enter PWD 
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("9975641077");
		Thread.sleep(4000);
		
		//click on login btn 
		driver.findElement(By.xpath("//div[text()='Log in']")).click();
		
		
}

}
