package abcd;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Match;
import org.sikuli.script.Screen;

public class Test21 {

	public static void main(String[] args) throws InterruptedException, FindFailed, AWTException {
		// TODO Auto-generated method stub
		
WebDriver driver = new ChromeDriver();

driver.get("https://www.youtube.com/");

driver.manage().window().maximize();

Screen s = new Screen();

s.type("C:\\Users\\7386665666\\Desktop\\youtube\\search.PNG", "Selenium Introduction");

s.click("C:\\Users\\7386665666\\Desktop\\youtube\\sbutton.PNG");

Thread.sleep(5000);

s.click("C:\\Users\\7386665666\\Desktop\\youtube\\linktext.PNG");


Thread.sleep(7000);

Match e =s.find("C:\\Users\\7386665666\\Desktop\\youtube\\skip.PNG");

if(e.isValid()) {
	s.click("C:\\Users\\7386665666\\Desktop\\youtube\\skip.PNG");
		
}


Thread.sleep(3000);

Robot r = new Robot();

r.keyPress(KeyEvent.VK_ESCAPE);
r.keyRelease(KeyEvent.VK_ESCAPE);


Thread.sleep(3000);

s.mouseMove(0, 25);

Thread.sleep(3000);



s.click("C:\\Users\\7386665666\\Desktop\\youtube\\pause.PNG");

Thread.sleep(5000);

s.click("C:\\Users\\7386665666\\Desktop\\youtube\\play.PNG");



	}

}
