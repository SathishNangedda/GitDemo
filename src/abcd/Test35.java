package abcd;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	ChromeOptions O = new ChromeOptions();
	
	O.addArguments("-disable-notifications");
		
	WebDriver driver = new ChromeDriver(O);
	
	driver.get("https://www.myntra.com");
	
	driver.manage().window().maximize();

	}

}
