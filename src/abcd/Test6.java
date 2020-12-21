package abcd;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		driver.manage().window().maximize();
		
		//driver.findElement(By.id("u_0_9")).click();
		
		List<WebElement> r = driver.findElements(By.xpath("//input[@type='radio']"));
		
		System.out.println(r.size());
		
		//r.get(0).click();
		
		boolean x= r.get(0).isSelected();
		
		if(x==true) {
			r.get(1).click();
		}
		else
		{
			r.get(0).click();
		}
		
	}

}
