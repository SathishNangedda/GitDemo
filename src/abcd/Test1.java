package abcd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
//Launch the Browser
		
WebDriver driver  = new ChromeDriver();

//Open Gmail URL

driver.get("https://www.gmail.com");

driver.manage().window().maximize();

//Enter Email ID

driver.findElement(By.id("identifierId")).sendKeys("softwaretestingrk");
	
//Click Next button
		
driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/content[1]/span[1]")).click();


Thread.sleep(3000);
//Enter password

driver.findElement(By.name("password")).sendKeys("Testing@6699");

//Click Nexgt

driver.findElement(By.xpath("//div[@id='passwordNext']/content[@class='CwaK9']")).click();

Thread.sleep(5000);
//Verify the login process

String url = driver.getCurrentUrl();


System.out.println(url);

if(url.contains("inbox")) {
	System.out.println("Test Case is Pass");
}

else
{
	System.out.println("Test Case is Fail");
}
	}

}
