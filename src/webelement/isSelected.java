package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isSelected 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
	boolean	result=driver.findElement(By.xpath("//label[text()='Female']']")).isSelected();
		System.out.println(result);
		
		if (result)
		{
			System.out.println("radio btn selected"); 
		}
		else
		{
			System.out.println("radio btn is notselected"); 
		}
	}

}
