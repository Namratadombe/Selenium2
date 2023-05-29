package example4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo7 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/GK/Nams/Software%20Testing/Id.html");
		
		//enter FN 
		driver.findElement(By.id("1234")).sendKeys("abcd");
		
		//enter LN 
		driver.findElement(By.id("5678")).sendKeys("wxyz");
		
	}

}
