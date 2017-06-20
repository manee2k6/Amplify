package com.amplify.testng;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DataProvHandlers {
  @Test(dataProvider = "dp")
  public void f(Integer n, String s) {
  }

  @DataProvider(name="dp")
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
  
  @DataProvider(name="login")
  public Object[][] login() {
    return new Object[][] {
      new Object[] { "manee2k6", "Test@123" },
      new Object[] { "sowmy123", "Rock2134" },
      new Object[] { "", "" },
    };
  }
  
  @DataProvider(name="register")
  public Object[][] register() {
    return new Object[][] {
      new Object[] { "manee2k6", "Test@123" },
      new Object[] { "sowmy123", "Rock2134" },
      new Object[] { "", "" },
    };
  }
}
