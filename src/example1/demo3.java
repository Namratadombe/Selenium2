package example1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo3 
//getTitle 
{
	public static void main(String[] args) 
{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		String title=driver.getTitle();
		System.out.println(title);
}

}
