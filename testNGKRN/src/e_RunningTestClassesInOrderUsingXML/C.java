package e_RunningTestClassesInOrderUsingXML;

import org.testng.annotations.Test;
//Refer to e_RunningTestClassesInOrder.xml and run the xml as testNG Suite
public class C {

		  @Test
		  public void createC() {
			  System.out.println("CreateC");
		  }
		  @Test
		  public void editC() {
			  System.out.println("EditC");
		  }
		  @Test
		  public void deleteC() {
			  System.out.println("DeleteC");
		  }

}
