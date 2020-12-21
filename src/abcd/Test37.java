package abcd;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test37 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
WebDriver driver = new ChromeDriver();

driver.get("https://www.google.com/intl/en-GB/gmail/about/#");

driver.manage().window().maximize();

Thread.sleep(3000);

driver.findElement(By.linkText("Sign in")).click();

Set<String> Window = driver.getWindowHandles();

for(String wind:Window) {
	
	driver.switchTo().window(wind);
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	js.executeScript("window.focus()");
}



driver.findElement(By.id("identifierId")).sendKeys("softwaretestingrk");

	}

}
