package a_Annotations;

import org.testng.annotations.Test;

public class A_AtTestAnnotation {
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
//As we haven't provided any priority(test execution sequencing order) for the tests, the tests by default run in Alphabetical Order of the method names