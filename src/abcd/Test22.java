package abcd;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test22 {
	
	@Test
	public void VerifyTitle() {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		driver.manage().window().maximize();
		
		String atitle = driver.getTitle();
		
		Assert.assertEquals(atitle, "Google");
		
		
	}

}
