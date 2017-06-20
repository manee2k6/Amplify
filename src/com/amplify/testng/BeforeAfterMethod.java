package com.amplify.testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class BeforeAfterMethod {
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before method is invoked..");
  }
  
  @Test(priority=1)
  public void register() {
	  System.out.println("Register scenario is executed..");
  }
  
  @Test(priority=2)
  public void login() {
	  System.out.println("Login Scenario is executed..");
  }
  
  @AfterMethod
  public void afterMethod() {
	  System.out.println("After Method is invoked...");
  }

}
