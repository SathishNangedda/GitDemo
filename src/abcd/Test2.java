package abcd;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
 WebDriver Obj = new ChromeDriver();
 
 Obj.get("https://www.google.com");
 
 Obj.manage().window().maximize();
 
 Obj.navigate().to("https://facebook.com");
 
 Obj.navigate().back();
 
 Obj.navigate().forward();
 
 Obj.navigate().refresh();
 
 //Return title of the Browser
 
 String atitle = Obj.getTitle();
 
 System.out.println(atitle);
 
 //verify the title 
 
 if(atitle.equals("Google")) {
	 System.out.println("TP");
 }
 else
 {
	 System.out.println("TF");
 }
	}

}
