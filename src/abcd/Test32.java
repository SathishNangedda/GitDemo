package abcd;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Test32 {
	
@Test(dataProvider="Testdata")
public void Glogin(String User, String Pass) throws InterruptedException {

	WebDriver driver = new ChromeDriver();
    
    driver.get("https://www.gmail.com");
    
    driver.manage().window().maximize();
    
    driver.findElement(By.id("identifierId")).sendKeys(User);
    
    driver.findElement(By.xpath("//span[text()='Next']")).click();
    
    Thread.sleep(3000);
    
    driver.findElement(By.name("password")).sendKeys(Pass);
    
    driver.findElement(By.xpath("//span[text()='Next']")).click();
    
     Thread.sleep(5000);
     
     driver.close();
	
	
}

@DataProvider(name="Testdata")	
public Object[][] readExcel() throws BiffException, IOException {
		// TODO Auto-generated method stub
		
File f = new File("D:\\selenium\\workspace\\SeleniumAutomationTesting\\data\\Testdata.xls");

Workbook wb = Workbook.getWorkbook(f);

Sheet s = wb.getSheet("Sheet1");

int r = s.getRows();

int c = s.getColumns();

System.out.println(r+" "+c);

String inputdata[][] = new String[r][c];

for(int i=1; i<r; i++) {
	for(int j=0; j<c; j++) {
		
		
		Cell C = s.getCell(j, i);
		
		inputdata[i][j] = C.getContents();
		
		System.out.println(inputdata[i][j]);
	}
}
return inputdata;



	}

}
