package abcd;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test24 {
	@BeforeTest
	public void Login() {
		System.out.println("Login is Completed");
	}

	@Test(priority =2)
	public void BalanceEnquiry() {
		System.out.println("Balance Enquiry is Completed");
	}

	@Test(priority =4)
	public void FundTransfer() {
		System.out.println("FundTransfer is Completed");
	}

	@Test(priority=3)
	public void Billpayment() {
		System.out.println("Bill payment is Completed");

	}
	@Test(priority=5)
	public void Ministatement() {
		System.out.println("Ministatement is Completed");
	}

	@AfterTest
	public void Logout() {
		System.out.println("Logout is Completed");
	}
}
