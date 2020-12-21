package abcd;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Test9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		
		driver.manage().window().maximize();
		
		Select sc = new Select(driver.findElement(By.name("selenium_commands")));

		boolean x = sc.isMultiple();
		
		//return a list of option in the dropdown
		
		List<WebElement> scl = sc.getOptions();
		
		if(x==true) {
			Actions a = new Actions(driver);
			
			a.click(scl.get(1)).build().perform();
			a.click(scl.get(2)).build().perform();
		}
		else
		{
			System.out.println("It is not supporting muliple item selection");
		}
	}

}
