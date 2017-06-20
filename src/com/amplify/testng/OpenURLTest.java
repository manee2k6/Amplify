package com.amplify.testng;

import java.io.IOException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.rmi.UnexpectedException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.amplify.common.Hooks;
import com.amplify.utils.PropFileHandler;



public class OpenURLTest extends Hooks {
@Test(dataProvider="hardCodedBrowsers")
	  public void openSeleniumURL(String browser,String version,String os, Method method) throws UnexpectedException, MalformedURLException,IOException, InterruptedException {
		  this.createDriver(browser, version, os, method.getName());
		  WebDriver driver = this.getWebDriver();
		  driver.get(PropFileHandler.fetchProp("URL"));
  }
}
