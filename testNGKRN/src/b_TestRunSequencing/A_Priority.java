package b_TestRunSequencing;

import org.testng.annotations.Test;

public class A_Priority {
	
	//There's no rule that we should give priority without skipping numbers. We can skip the numbers as well. We can give priority like 0,18,39,50 also. 
	//The test execution happens as per the ascending order of the priority provided. 
	//Usually, in real time projects, engg.s give gaps between priority numbers in order to add more test cases in between in the future.
	
	@Test(priority=0)
	public void createCustomer() {
		System.out.println("Create customer");
	}
	@Test(priority=1)
	public void editCustomer() {
		System.out.println("Edit customer");
	}
	@Test(priority=3)
	public void deleteCustomer() {
		System.out.println("Delete customer");
	}
	@Test(priority=2)
	public void modifyCustomer() {
		System.out.println("Modify customer");
	}

}
