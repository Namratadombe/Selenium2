package example4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo8 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/GK/Nams/Software%20Testing/classname.html");
		
		//enter FN
		driver.findElement(By.className("abc123")).sendKeys("abc");
		
		//enter LN 
		driver.findElement(By.className("abc123")).sendKeys("xyz");
		
		
	}
	

}
