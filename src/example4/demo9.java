package example4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo9 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/GK/Nams/Software%20Testing/name%20locatoer.html");
		//enter FN 
		driver.findElement(By.name("xyz123")).sendKeys("abc");
		
		//enter FN 
		driver.findElement(By.name("xyz123")).sendKeys("xyz");
		
	}

}
