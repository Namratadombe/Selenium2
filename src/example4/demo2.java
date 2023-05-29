package example4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo2 

//tagname[contains(text(),'partial text value')] :


{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//click on Create New Acc link 
		
		driver.findElement(By.xpath("//a[contains(text(),'Create new')]")).click();
		
	}

}
