package abcd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();

driver.get("https://www.gmail.com");

driver.manage().window().maximize();

//Enter email id

driver.findElement(By.name("identifier")).sendKeys("ac");

driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/content/span")).click();

Thread.sleep(3000);

String err_msg = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/div[1]/div/form/content/section/div/content/div[1]/div/div[2]/div[2]/div")).getText();

System.out.println(err_msg);

if(err_msg.contentEquals("Couldn't find your Google")) {
	System.out.println("TP");
}

else
{
	System.out.println("TF");
}
	}

}
