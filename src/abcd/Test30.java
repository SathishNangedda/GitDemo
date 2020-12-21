package abcd;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test30 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
for(int i=1; i<3; i++) {
	Scanner s = new Scanner(System.in);
	
	System.out.println("Enter Mobile No");
	
	String m = s.nextLine();
	
	System.out.println("Enter Password");
	
	String p = s.next();
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.way2sms.com");
	
	driver.manage().window().maximize();
	
	driver.findElement(By.name("mobileNo")).sendKeys(m);
	
	driver.findElement(By.name("password")).sendKeys(p);
	
	driver.findElement(By.xpath("//*[@id=\"loginform\"]/div[2]/div[2]/button[1]")).click();
	
	Thread.sleep(5000);
	
	driver.close();
}
	}

}
