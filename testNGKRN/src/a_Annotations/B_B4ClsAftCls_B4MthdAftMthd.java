package a_Annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class B_B4ClsAftCls_B4MthdAftMthd {
	@BeforeClass
	public void openBrowser() {
		System.out.println("Opening the browser before running the tests");
	}
	@AfterClass
	public void closeBrowser() {
		System.out.println("Closing the browser after running the tests");
	}

	
	@BeforeMethod
	public void login() {
		System.out.println("Login to the application");
	}
	
	@AfterMethod
	public void logout() {
		System.out.println("Logout from the application");
	}
	
	
	@Test
	public void createCustomer() {
		System.out.println("Create customer");
	}
	@Test
	public void editCustomer() {
		System.out.println("Edit customer");
	}
	@Test
	public void deleteCustomer() {
		System.out.println("Delete customer");
	}
}
