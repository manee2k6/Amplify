package com.amplify.testng;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DataSampler {
  @Test(dataProviderClass=DataProvHandlers.class,dataProvider="register")
  public void f(String Uname, String pwd) {
	  System.out.println("Username:"+Uname+"<--->"+"Password:"+pwd);
  }

  /*@DataProvider(name="login")
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "manee2k6", "Test@123" },
      new Object[] { "sowmy123", "Rock2134" },
      new Object[] { "", "" },
    };
  }*/
}
