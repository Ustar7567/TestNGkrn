package d_Assertions_SkippingTestMethods;

import org.testng.Assert;
import org.testng.annotations.Test;

//As we are failing editCust method by assertions, the deleteCust method will be skipped as it is depending on editCust
//Now, the execution control goes to modifyCust method

public class A_assertAndSkipMethod {
	 @Test
	  public void createCust() {
		  System.out.println("Create Cust");
	  }
	  
	  @Test(dependsOnMethods="createCust")
	  public void editCust() {
		  String act="ABC";
		  String exp="ABC123";
		  Assert.assertEquals(act, exp);
		  System.out.println("Edit Cust");
	  }
	  
	  @Test(dependsOnMethods="editCust")
	  public void deleteCust() {
		  System.out.println("Delete Cust");
	  }
	  
	  @Test
	  public void modifyCust() {
		  System.out.println("Modify Cust");
	  }
	  
}
