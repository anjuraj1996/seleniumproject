package webelementpack;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class webelementsample {
	public WebDriver driver;
	  @Test
	  public void getsite() {
		  driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		  WebElement element=driver.findElement(By.id("single-input-field"));
		  element.sendKeys("testdata");
		  WebElement button=driver.findElement(By.id("button-one"));
		  button.click();
		  WebElement message=driver.findElement(By.id("message-one"));
		  String s=message.getText();
		  System.out.println(s);
	      element.clear();
	      String expected="Your Message : testdata";
	      Assert.assertEquals(s, expected);
		  }
	 
	  @BeforeClass
	  public void beforeClass() {
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\Hp\\Desktop\\chrome\\chromedriver_win32\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		 
	  }

	  @AfterClass
	  public void afterClass() {
		  
		  
	  }

	}
