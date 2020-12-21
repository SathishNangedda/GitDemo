package abcd;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test15 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		//code to compose email
		
WebDriver driver = new ChromeDriver();

driver.get("https://www.gmail.com");

driver.manage().window().maximize();

driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("softwaretestingrk");

driver.findElement(By.xpath("//span[text()='Next']")).click();

Thread.sleep(3000);

driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf'][@name='password']")).sendKeys("Testing@6699");


driver.findElement(By.xpath("//span[text()='Next']")).click();

Thread.sleep(5000);

driver.findElement(By.xpath("//div[starts-with(@class,'T-I J-J5-Ji T-I-KE L3')]")).click();

driver.findElement(By.xpath("//*[contains(@name,'to')]")).sendKeys("bhavanichandu40@gmail.com");

Thread.sleep(2000);

driver.findElement(By.xpath("//input[@id=':pc' and @name='subjectbox']")).sendKeys("Selenium Course");

Thread.sleep(2000);

driver.findElement(By.xpath("//div[@class='Am Al editable LW-avf'][@aria-label='Message Body']")).sendKeys("Welcome to selenium World");

Thread.sleep(3000);

Robot r = new Robot();

r.keyPress(KeyEvent.VK_TAB);
r.keyRelease(KeyEvent.VK_TAB);

Thread.sleep(3000);

r.keyPress(KeyEvent.VK_TAB);
r.keyRelease(KeyEvent.VK_TAB);

Thread.sleep(3000);

r.keyPress(KeyEvent.VK_TAB);
r.keyRelease(KeyEvent.VK_TAB);

Thread.sleep(5000);

r.keyPress(KeyEvent.VK_ENTER);
r.keyRelease(KeyEvent.VK_ENTER);

Thread.sleep(7000);

StringSelection file = new StringSelection("C:\\Users\\7386665666\\Desktop\\FIleupload.txt");
Toolkit.getDefaultToolkit().getSystemClipboard().setContents(file, null);

r.keyPress(KeyEvent.VK_CONTROL);
r.keyPress(KeyEvent.VK_V);
r.keyRelease(KeyEvent.VK_V);
r.keyRelease(KeyEvent.VK_CONTROL);


Thread.sleep(5000);

r.keyPress(KeyEvent.VK_ENTER);
r.keyRelease(KeyEvent.VK_ENTER);

Thread.sleep(5000);

r.keyPress(KeyEvent.VK_TAB);
r.keyRelease(KeyEvent.VK_TAB);

Thread.sleep(5000);


r.keyPress(KeyEvent.VK_ENTER);
r.keyRelease(KeyEvent.VK_ENTER);
	}

}
