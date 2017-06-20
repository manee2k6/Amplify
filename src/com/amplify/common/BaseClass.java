package com.amplify.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class BaseClass {
	public WebDriver driver ;
  @Parameters({"browser"})
  @BeforeClass
  public void beforeClass(String browser) {
	  if(browser.equals("Firefox")){
		 System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\Lib\\geckodriver.exe");
		 driver= new FirefoxDriver();		  
	  }else if(browser.equals("Chrome")){
		  System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Lib\\chromedriver.exe");
		  driver = new ChromeDriver();
	  }else if(browser.equals("IE")){
		  System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"\\Lib\\IEDriverServer.exe");
		  driver = new InternetExplorerDriver();
	  }else{
		  System.out.println("Browser Mismatch and exited...");
	  }
		  
  }

  @AfterClass
  public void afterClass() {
	 driver.quit();
  }

}
