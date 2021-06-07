package b_TestRunSequencing;

import org.testng.annotations.Test;

public class Bb_dependsOnMethods_MultiLevel {
	
	//Here, deleteCust depends on editCust, editCust depends on modifyCust, modifyCust depends on crateCust
	
	 @Test
	  public void createCust() {
		  System.out.println("Create Cust");
	  }
	  
	  @Test(dependsOnMethods = "modifyCust") //Multi-level dependency 
	  public void editCust() {
		  System.out.println("Edit Cust");
	  }
	  
	  @Test(dependsOnMethods = "createCust") //Multi-level dependency 
	  public void modifyCust() {
		  System.out.println("Modify Cust");
	  }
	  
	  @Test(dependsOnMethods = "editCust") //Multi-level dependency 
	  public void deleteCust() {
		  System.out.println("Delete Cust");
	  }

}
