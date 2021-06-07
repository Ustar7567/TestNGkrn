package b_TestRunSequencing;

import org.testng.annotations.Test;

public class Ba_dependsOnMethods {
	 @Test
	  public void createCust() {
		  System.out.println("Create Cust");
	  }
	  
	  @Test
	  public void editCust() {
		  System.out.println("Edit Cust");
	  }
	  
	  @Test
	  public void modifyCust() {
		  System.out.println("Modify Cust");
	  }
	  
	  @Test(dependsOnMethods = {"editCust", "modifyCust"})//Multiple Dependencies
	  public void deleteCust() {
		  System.out.println("Delete Cust");
	  }
}
