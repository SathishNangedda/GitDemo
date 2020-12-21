package abcd;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		driver.manage().window().maximize();
		
		//driver.findElement(By.linkText("Gmail")).click();
         //or
		
		//driver.findElement(By.partialLinkText("Gma")).click();
		
		//Return a list of links in the WebPage
		
		List<WebElement> l = driver.findElements(By.tagName("a"));
		
		System.out.println(l.size());
		
		for(int i=0; i<l.size(); i++) {
			
			String x = l.get(i).getText();
			
		System.out.println("LinksText:="+i+" "+x);
		
		 if(x.equals("Sign in")) {
			 l.get(i).click();
			 
			 break;
		 }
		}
		
		
	}

}
