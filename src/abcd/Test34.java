package abcd;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test34 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
WebDriver driver = new ChromeDriver();

driver.get("https://www.naukri.com/");

//driver.manage().window().maximize();

//Return a list of Browser Windows

ArrayList<String> w = new ArrayList<String>(driver.getWindowHandles());

System.out.println(w.size());


for(int i=1; i<w.size(); i++) {
	
	driver.switchTo().window(w.get(i));
	
	driver.manage().window().maximize();
	
	Thread.sleep(5000);
	
	driver.close();
}





	}

}
