package abcd;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test11 {

public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
WebDriver driver = new ChromeDriver();

driver.get("https://www.gmail.com");

driver.manage().window().maximize();

//By Using WebDriver Class

//driver.findElement(By.id("identifierId")).sendKeys("softwaretestingrk");

//By Using Actions Class

WebElement e = driver.findElement(By.id("identifierId"));

//Actions a = new Actions(driver);

//a.sendKeys(e, "softwaretestingrk").build().perform();

//WebElement en = driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/content[1]/span[1]"));

//a.click(en).build().perform();

JavascriptExecutor js = (JavascriptExecutor) driver;

//js.executeScript("document.getElementById('identifierId').value='softwaretestingrk';");
//or
js.executeScript("arguments[0].value='softwaretestingrk';",e);


driver.navigate().to("https://www.seleniumhq.org/");

Thread.sleep(5000);

js.executeScript("window.scrollBy(0,500);");
	}

}
