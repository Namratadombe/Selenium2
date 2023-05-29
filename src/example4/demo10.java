package example4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo10 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/GK/Nams/Software%20Testing/Linktext.html");
		Thread.sleep(2000);
		
		//click on facebook link 
		driver.findElement(By.partialLinkText("ceb")).click();
		
	}

}
