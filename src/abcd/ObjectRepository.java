package abcd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class ObjectRepository {
	
	public WebDriver driver;
	
	By e = By.id("identifierId");
	
	By en= By.xpath("//span[text()='Next']");
	
	By p = By.name("password");
	
	By pn = By.xpath("//span[text()='Next']");
	
	
	@Test
	public void Browser(WebDriver driver) {
		
		this.driver=driver;
		
	}
	
	@Test
	public void EnteEmailid(String User) {
		driver.findElement(e).sendKeys(User);
	}
	
	@Test
	public void ClickNext() {
		driver.findElement(en).click();
	}
	
	@Test
	public void EnterPassword(String Pass) {
		driver.findElement(p).sendKeys(Pass);
	}
	
    @Test
    public void Nextclick() {
    	driver.findElement(pn).click();
    }
}
