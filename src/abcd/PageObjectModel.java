package abcd;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageObjectModel {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.gmail.com");
		
		driver.manage().window().maximize();
		
		ObjectRepository obj = new ObjectRepository();
		
		obj.Browser(driver);
		
		obj.EnteEmailid("softwaretestingrk");
		
		obj.ClickNext();
		
		Thread.sleep(3000);
		
		obj.EnterPassword("Testing@6699");
		
		obj.Nextclick();

	}

}
