package abcd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test18 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
WebDriver driver = new ChromeDriver();

driver.get("https://www.google.com");

driver.manage().window().maximize();

//General Images (With out any Functionalities)

String imgtitle = driver.findElement(By.xpath("/html/body/div[1]/div[8]/span/center/div[1]/div/a/img")).getAttribute("title");

System.out.println(imgtitle);

//Image Links
driver.navigate().to("https://www.seleniumhq.org/");

Thread.sleep(2000);

driver.findElement(By.xpath("/html/body/div[3]/div[2]/div[2]/table/tbody/tr/td[2]/center/a/img")).click();


//Image Button

driver.navigate().to("http://newtours.demoaut.com/");

Thread.sleep(2000);

driver.findElement(By.name("login")).click();
	}

}
