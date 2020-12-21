package abcd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test13 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
WebDriver driver = new ChromeDriver();

driver.get("https://www.toolsqa.com/handling-alerts-using-selenium-webdriver/");

driver.manage().window().maximize();


driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/div/div/p[4]/button")).click();

driver.switchTo().alert();

String alerttext = driver.switchTo().alert().getText();

System.out.println(alerttext);

driver.switchTo().alert().accept();

driver.switchTo().defaultContent();

Thread.sleep(2000);

driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/div/div/p[8]/button")).click();

Thread.sleep(3000);

String alerttext1 = driver.switchTo().alert().getText();

System.out.println(alerttext1);

driver.switchTo().alert().dismiss();


Thread.sleep(2000);

driver.switchTo().defaultContent();
Thread.sleep(2000);
driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/div/div/p[11]/button")).click();

Thread.sleep(3000);

String alerttext2 = driver.switchTo().alert().getText();

System.out.println(alerttext2);

driver.switchTo().alert().sendKeys("yes/no");

driver.switchTo().alert().dismiss();




	}

}
