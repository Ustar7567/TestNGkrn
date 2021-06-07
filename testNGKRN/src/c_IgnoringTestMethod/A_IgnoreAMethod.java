package c_IgnoringTestMethod;

import org.testng.annotations.Test;

public class A_IgnoreAMethod {
  @Test(priority=0)
  public void createCust() {
	  System.out.println("Create Cust");
  }
  
  @Test(priority=1, enabled=false)  //This test method will be ignored
  public void editCust() {
	  System.out.println("Edit Cust");
  }
  
  @Test(priority=2)
  public void deleteCust() {
	  System.out.println("Delete Cust");
  }
}
