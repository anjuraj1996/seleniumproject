package checkboxsample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Checkboxclass {                                        
	WebDriver driver;

  @Test
  public void f() {
	 
	  WebElement check=driver.findElement(By.id("gridCheck"));
	  check.click();
	  boolean s=check.isSelected();
	  System.out.println(s);                                                            
	  Assert.assertNotNull(check);
	  Assert.assertTrue(s);
	  Assert.assertFalse(s);
	  WebElement check1=driver.findElement(By.id("message-one"));
	  String actual=check1.getText();
	  String expected="Success - Check box is checked";
	  Assert.assertEquals(actual, expected);
	     
	       
  }
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("WebDriver.http.factory", "jdk-http-client");
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Hp\\Desktop\\chrome\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://selenium.obsqurazone.com/check-box-demo.php");
	  driver.manage().window().maximize();
  }
}
