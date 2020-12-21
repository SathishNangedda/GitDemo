package abcd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test10 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();

driver.get("https://www.hdfcbank.com/");

driver.manage().window().maximize();

if(driver.findElement(By.xpath("//img[@class='popupCloseButton']")).isDisplayed()) {
	driver.findElement(By.xpath("//img[@class='popupCloseButton']")).click();
}


Thread.sleep(3000);

WebElement main = driver.findElement(By.linkText("Products"));

Actions a = new Actions(driver);

a.moveToElement(main).build().perform();

Thread.sleep(3000);

WebElement sub = driver.findElement(By.linkText("Loans"));

a.moveToElement(sub).build().perform();

Thread.sleep(3000);

driver.findElement(By.linkText("Home Loan")).click();

	}

}
