package week3;

import org.testng.annotations.Test;

public class DummyMethods {
  @Test(invocationCount = 6)
  public void signup() {
	  System.out.println("Signed up successfully");
  }
  
  @Test
  public void login() {
	  System.out.println("Signed up successfully");
  }
  
  @Test(dependsOnMethods = "logout")
  public void createaccount() {
	  System.out.println("created account successfully");
  }
  
  
  @Test(dependsOnMethods = "logout")
  public void createlead() {
	  System.out.println("created lead successfully");
  }
  
  @Test
  public void deletelead() {
	  System.out.println("deleted successfully");
  }
  
  @Test
  public void logout() {
	  System.out.println("logged out successfully");
  }
}
