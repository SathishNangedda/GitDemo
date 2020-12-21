package abcd;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

public class Test20 {

	public static void main(String[] args) throws FindFailed, InterruptedException {
		// TODO Auto-generated method stub

Screen s = new Screen();

s.click("C:\\Users\\7386665666\\Desktop\\Way2sms\\mini.PNG");

Thread.sleep(3000);

s.dragDrop("C:\\Users\\7386665666\\Desktop\\Way2sms\\source.PNG", "C:\\Users\\7386665666\\Desktop\\Way2sms\\target.PNG");
	}

}
