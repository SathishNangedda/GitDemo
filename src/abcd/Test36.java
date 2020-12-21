package abcd;

import java.util.ArrayList;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();

driver.get("https://www.facebook.com");

driver.manage().window().maximize();


//addcookie

Cookie a = new Cookie("abcd","abcd1234");

driver.manage().addCookie(a);

driver.manage().deleteCookieNamed("wd");

//To get all the Cookies in the Browser 

ArrayList<Cookie> c = new ArrayList<Cookie>(driver.manage().getCookies());


System.out.println(c.size());

for(int i=0; i<c.size(); i++) {
	
	String x = c.get(i).getName();
	
	System.out.println(x);
}


	}

}
