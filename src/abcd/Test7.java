package abcd;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test7 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		
		driver.manage().window().maximize();
		
		
		List<WebElement> c = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		System.out.println(c.size());
		
		for(int i=0; i<c.size(); i++) {
			c.get(i).click();
			Thread.sleep(3000);
			
			System.out.println("Selected Checkbox"+" "+i+" ="+c.get(i).isSelected());
			
			
		}

	}

}
