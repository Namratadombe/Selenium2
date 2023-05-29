package example4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo6 
{
	public static void main(String[] args) 
{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/GK/Nams/Software%20Testing/sample7.html");
		
		driver.findElement(By.tagName("input")).sendKeys("abc"); 
		
		//enter LN 
		driver.findElement(By.tagName("input")).sendKeys("xyz"); 

		
		
		
}

}
