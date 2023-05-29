package example4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo5 
//xpath by index - (multiple matching xpath xpression)[index] 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		//click on create new acc link 
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("((//input[@type='text'])[2])")).sendKeys("abc"); 
		
		//enter surname 
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("xyz");
		
		
		//enter mob num 
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("9999999999"); 

		
		//enter mob num 
		driver.findElement(By.xpath("(//input[@type='text'][4])")).sendKeys("9999000099");

		
	}
	

}
