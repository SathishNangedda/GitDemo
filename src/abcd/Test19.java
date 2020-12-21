package abcd;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

public class Test19 {

public static void main(String[] args) throws FindFailed, InterruptedException {
		// TODO Auto-generated method stub
		
WebDriver driver = new ChromeDriver();

driver.get("https://www.way2sms.com");

driver.manage().window().maximize();

Screen s = new Screen();

s.type("D:\\selenium\\workspace\\SeleniumAutomationTesting\\images\\mobileno.JPG", "9063715888");

Thread.sleep(3000);

s.type("D:\\\\selenium\\\\workspace\\\\SeleniumAutomationTesting\\\\images\\password.JPG", "1234");

s.click("D:\\\\selenium\\\\workspace\\\\SeleniumAutomationTesting\\\\images\\login.JPG");

Thread.sleep(3000);

driver.close();
	}

}
