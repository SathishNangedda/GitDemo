package abcd;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test31 {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
FileReader f = new FileReader("D:\\selenium\\workspace\\SeleniumAutomationTesting\\data\\Testdata.txt");

BufferedReader br = new BufferedReader(f);

String line;

int Count =0;

while((line=br.readLine())!=null) {
	
	String input[] = line.split(" ");
	
	System.out.println(input[0]);
	
	System.out.println(input[1]);
	
    WebDriver driver = new ChromeDriver();
    
    driver.get("https://www.gmail.com");
    
    driver.manage().window().maximize();
    
    driver.findElement(By.id("identifierId")).sendKeys(input[0]);
    
    driver.findElement(By.xpath("//span[text()='Next']")).click();
    
    Thread.sleep(3000);
    
    driver.findElement(By.name("password")).sendKeys(input[1]);
    
    driver.findElement(By.xpath("//span[text()='Next']")).click();
    
     Thread.sleep(5000);
     
     driver.close();
	
     Count++;
}



	}

}
