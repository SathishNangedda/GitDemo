package abcd;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test28 {
	@BeforeClass
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

	@AfterClass
	public void Logout() {
		System.out.println("Logout is Completed");
	}

}
