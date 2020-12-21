package abcd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com");
	
	driver.manage().window().maximize();
	
	Select day = new Select(driver.findElement(By.name("birthday_day")));

	day.selectByIndex(11);
	
	Select month = new Select(driver.findElement(By.name("birthday_month")));
	
	month.selectByVisibleText("Aug");
	
	Select year = new Select(driver.findElement(By.name("birthday_year")));
	
	year.selectByValue("1982");
	}

}
