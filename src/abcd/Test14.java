package abcd;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test14 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
WebDriver driver = new ChromeDriver();

driver.get("https://www.mercurytravels.co.in/");

driver.manage().window().maximize();

//Static way

driver.findElement(By.id("dphh1")).click();

Thread.sleep(2000);

driver.findElement(By.xpath("/html/body/div[15]/div[1]/table/thead/tr[1]/th[3]")).click();

//driver.findElement(By.xpath("/html/body/div[15]/div[1]/table/tbody/tr[4]/td[2]")).click();

Thread.sleep(2000);
List<WebElement> tabledata = driver.findElements(By.xpath("/html/body/div[15]/div[1]/table/tbody/tr/td"));

System.out.println(tabledata.size());

for(int i=0; i<tabledata.size(); i++) {
	
	String data = tabledata.get(i).getText();
	
	if(data.equals("20")){
		tabledata.get(i).click();
		
		break;
	}
}

	}

}
