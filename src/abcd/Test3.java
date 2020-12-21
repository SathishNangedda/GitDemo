package abcd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	
	driver.manage().window().maximize();
	
	//Fn Field is exist or not
	
	//Create the Object for Firstname field
	
	WebElement fn = driver.findElement(By.name("firstname"));
	
	boolean x = fn.isDisplayed();
	System.out.println(x);
	
	if(x==true) {
		//Check the Element enabled status
		boolean y = fn.isEnabled();
		System.out.println(y);
		
		//Return a element type
		String etype = fn.getAttribute("type");
		System.out.println(etype);
		
		//Enter a value
		fn.sendKeys("ravi");
		
		//return a value
		String value = fn.getAttribute("value");
		
		System.out.println(value);
		
		Thread.sleep(5000);
		
		//clear a value
		fn.clear();
		Thread.sleep(2000);
		driver.close();
	}
	else
	{
		System.out.println("Element is not avaiable in the Webpage");
	}
	}

}
