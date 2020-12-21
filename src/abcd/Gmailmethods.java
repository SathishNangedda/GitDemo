package abcd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
public class Gmailmethods {
	
public WebDriver driver;
	
	public String gmail_Launch(String o,String d,String c) throws InterruptedException
	{
		if(o.equalsIgnoreCase("chrome"))
		{
			//System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Downloads\\chromedriver.exe");
			driver = new ChromeDriver();			
		}
		else if(o.equalsIgnoreCase("Firefox"))
		{
			//System.setProperty("webdriver.gecko.driver","D:\\Elisha\\geckodriver.exe");
			driver = new FirefoxDriver();	
		}
		else if(o.equalsIgnoreCase("IE"))
		{
			//System.setProperty("webdriver.ie.driver","D:\\Elisha\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();	
		}
		driver.get(d);
		Thread.sleep(5000);
		return("Done");
	}
	
	public String userid_Fill(String o,String d,String c)
	{
		driver.findElement(By.xpath(o)).sendKeys(d);
		return("Done");
	}
	
	public String userid_Next(String o,String d,String c) throws InterruptedException
	{
		driver.findElement(By.xpath(o)).click();
		Thread.sleep(2000);
		return("Done");
	}
	
	public String userid_Validate(String o,String d,String c)
	{
		try
		{
			if(c.equals("valid") && driver.findElement(By.name("password")).isDisplayed())
			{
				return("Valid UserID Test Passed");
			}
			else if(c.equals("invalid") && driver.findElement(By.xpath("(//*[contains(text(),'find your Google') or contains(text(),'Enter an email')])[2]")).isDisplayed())
			{
				return("Wrong/Blank UserID Test Passed");
			}
			else
			{
				return("UserID Test Failed");
			}
		}
		catch(Exception e)
		{
			return("UserID Test Interrupted");
		}

	}
	
	public String close(String o,String d,String c) throws InterruptedException
	{
		driver.close();
		Thread.sleep(2000);
		return("Done");
	}
	
	public String pwd_Fill(String o,String d,String c) throws InterruptedException
	{
		driver.findElement(By.xpath(o)).sendKeys(d);
		Thread.sleep(2000);
		return("Done");
	}
	
	public String pwd_Next(String o,String d,String c) throws InterruptedException
	{
		driver.findElement(By.xpath(o)).click();
		Thread.sleep(5000);
		return("Done");
	}
	
	public String pwd_Validate(String o,String d,String c)
	{
		try
		{
			if(c.equalsIgnoreCase("valid") && driver.findElement(By.xpath("//*[text()='COMPOSE']")).isDisplayed())
			{
				return("Valid Pwd Test Passed");
			}
			else if(c.equalsIgnoreCase("invalid") && driver.findElement(By.xpath("//*[contains(text(),'Wrong password') or contains(text(),'Enter your password')]")).isDisplayed())
			{
				return("Wrong/Blank Pwd Test Passed");
			}
			else
			{
				return("Pwd Test Failed");
			}
				
		}
		catch(Exception e)
		{
			return("Pwd Test Interrupted");
		}
	}
	public String gmail_SignoutOptions(String o,String d,String c) throws InterruptedException
	{
		Thread.sleep(5000);
		driver.findElement(By.xpath(o)).click();
		Thread.sleep(3000);
		return("Done");
	}
	
	public String gmail_Signout(String o,String d,String c) throws InterruptedException
	{
		driver.findElement(By.xpath(o)).click();
		Thread.sleep(2000);
		return("Done");
	}
	
	public String signout_Validate(String o,String d,String c)
	{		
			if(driver.findElement(By.xpath("//*[@title='Google'][@id='logo']")).isDisplayed())
			{
				return("Signed Out Successfully");
			}
			else
			{
				return("Sign Out Failed");
			}
	}


}
