package abcd;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class Test16 {

	public static void main(String[] args) throws IOException, InterruptedException, AWTException {
		// TODO Auto-generated method stub
		
Runtime.getRuntime().exec("C:\\Windows\\system32\\calc.exe");

Thread.sleep(5000);

StringSelection val1 = new StringSelection("95");
Toolkit.getDefaultToolkit().getSystemClipboard().setContents(val1, null);

Robot r = new Robot();

r.keyPress(KeyEvent.VK_CONTROL);
r.keyPress(KeyEvent.VK_V);
r.keyRelease(KeyEvent.VK_V);
r.keyRelease(KeyEvent.VK_CONTROL);

Thread.sleep(7000);

r.keyPress(KeyEvent.VK_MINUS);
r.keyRelease(KeyEvent.VK_MINUS);

Thread.sleep(7000);

StringSelection val2 = new StringSelection("45");
Toolkit.getDefaultToolkit().getSystemClipboard().setContents(val2, null);

r.keyPress(KeyEvent.VK_CONTROL);
r.keyPress(KeyEvent.VK_V);
r.keyRelease(KeyEvent.VK_V);
r.keyRelease(KeyEvent.VK_CONTROL);

Thread.sleep(7000);

r.keyPress(KeyEvent.VK_EQUALS);
r.keyRelease(KeyEvent.VK_EQUALS);

	}

}
