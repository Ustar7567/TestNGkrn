package e_RunningTestClassesInOrderUsingXML;

import org.testng.annotations.Test;
//Refer to e_RunningTestClassesInOrder.xml and run the xml as testNG Suite

public class A {
  @Test
  public void createA() {
	  System.out.println("CreateA");
  }
  @Test
  public void editA() {
	  System.out.println("EditA");
  }
  @Test
  public void deleteA() {
	  System.out.println("DeleteA");
  }
}
