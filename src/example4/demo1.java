package example4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo1 
//xpath by contains 
//1. xpath by contains with text - //tagname[contains(text(),'partial text value')] :

{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//click on forgotten login link 
		
		driver.findElement(By.xpath("//button[contains(text(),'Log')]")).click();
		
	}
	

}
