package example1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo4 
//getCurrentURL 

{
public static void main(String[] args) 
{
	WebDriver driver=new ChromeDriver();
	
	driver.get("\"https://www.facebook.com/\"");
	String url=driver.getCurrentUrl();
	System.out.println(url);
	
	
}	

}
