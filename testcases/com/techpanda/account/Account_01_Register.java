package com.techpanda.account;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class Account_01_Register {
	WebDriver driver;
	String buildPath = System.getProperty("user.dir");
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.gecko.driver", buildPath +"\\browserDrivers\\chromedriver.exe");
	  ChromeOptions ops = new ChromeOptions();
	  ops.addArguments("--remote-allow-origins=*");
	  driver = new ChromeDriver(ops);
	  driver.manage().window().maximize();
	  driver.get("http://live.techpanda.org/index.php/mobile.html");
  }	
  @Test
  public void TC_01() {
	  
  }
 

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
