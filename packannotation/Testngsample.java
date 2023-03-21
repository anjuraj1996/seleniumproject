package packannotation;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;


public class Testngsample {
	public WebDriver driver;
  @Test
  public void getsite() {
	  driver.get("https://mail.google.com");
	  }
 
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.http.factory", "jdk-http-client");
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Hp\\Desktop\\chrome\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();

  }

  @AfterClass
  public void afterClass() {
	  driver.close();

  }

}
