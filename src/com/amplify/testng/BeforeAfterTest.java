package com.amplify.testng;

import org.junit.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeAfterTest {
 
  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before Test is invoked...");
  }
  
  @Test(enabled=true,groups={"REG","SMOKE"})
  public void register() {
	  System.out.println("Register scenario is executed..");
	  Assert.assertEquals(1<2,1>2);
  }
  
  @Test(testName="login",description="This scenario cover login by passing credentials",dependsOnMethods="register",groups="SMOKE",invocationCount=3)
  public void login() {
	  System.out.println("Login Scenario is executed..");
  }
  
  @Test(dependsOnMethods="login",alwaysRun=true)
  public void logout(){
	  System.out.println("Logging out from page");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("After Test is invoked..");
  }

}
