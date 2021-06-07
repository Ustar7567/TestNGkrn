package e_RunningTestClassesInOrderUsingXML;

import org.testng.annotations.Test;
//Refer to e_RunningTestClassesInOrder.xml and run the xml as testNG Suite

public class B {
	
		  @Test
		  public void createB() {
			  System.out.println("CreateB");
		  }
		  @Test
		  public void editB() {
			  System.out.println("EditB");
		  }
		  @Test
		  public void deleteB() {
			  System.out.println("DeleteB");
		  }

}
