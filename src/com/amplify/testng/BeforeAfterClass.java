package com.amplify.testng;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.amplify.common.BaseClass;
import com.amplify.utils.PropFileHandler;

public class BeforeAfterClass extends BaseClass{
  @Test
  public void openURL() throws FileNotFoundException, IOException {
	 driver.get(PropFileHandler.fetchProp("URL")); 
  }
}
