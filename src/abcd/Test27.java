package abcd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

public class Test27 {
public WebDriver driver;
	
	@BeforeMethod
	public void Glogin() throws InterruptedException {
		
   driver = new ChromeDriver();
    
    driver.get("https://www.gmail.com");
    
    driver.manage().window().maximize();
    
    driver.findElement(By.id("identifierId")).sendKeys("softwaretestingrk");
    
    driver.findElement(By.xpath("//span[text()='Next']")).click();
    
    Thread.sleep(3000);
    
    driver.findElement(By.name("password")).sendKeys("Testing@6699");
    
    driver.findElement(By.xpath("//span[text()='Next']")).click();
    
     Thread.sleep(5000);
     
	}
	
	@Test(priority=1)
	public void Verifylogin() {
		
		String url = driver.getCurrentUrl();
		
		System.out.println(url);
		
		if(url.contains("inbox")) {
			System.out.println("TP");
		}
		
		else
		{
			System.out.println("TF");
		}
		
	}
  @Test(priority=2)
  
  
    public void Compose() throws InterruptedException {
	  
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[text()='Compose']")).click();
	  
	  driver.findElement(By.name("to")).sendKeys("testingravikanth@gmail.com");
	  
	  Thread.sleep(2000);
	  driver.findElement(By.name("subjectbox")).sendKeys("TestNG Annotations");
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("//div[@class='Am Al editable LW-avf'][@aria-label='Message Body']")).sendKeys("Selenium WebDriver Course Topic is TestNG");
	  
	  driver.findElement(By.xpath("//*[text()='Send']")).click();
	  
	  Thread.sleep(5000);
  }
  
  @AfterMethod
  public void Glogout() throws InterruptedException {
	  
	  driver.findElement(By.xpath("//span[@class='gb_xa gbii']")).click();
	  
	  Thread.sleep(3000);
	  
	  driver.findElement(By.xpath("//a[text()='Sign out']")).click();
	  
  }
}

