package abcd;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com");
	
	driver.manage().window().maximize();
	
	
	//Return a list of Textboxs in the Webpage
	
	List<WebElement> t = driver.findElements(By.xpath("//input[@type='text']"));
	
	System.out.println(t.size());
	
	t.get(0).sendKeys("ravi");
	
	t.get(1).sendKeys("kanth");

	}

}
