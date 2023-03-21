package webelementpack;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Radiobuttonsample {
	public WebDriver driver;
  @Test
  public void f() {
  }
  @BeforeClass
  public void beforeClass() throws InterruptedException {
	  System.setProperty("webdriver.http.factory", "jdk-http-client");
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Hp\\Desktop\\chrome\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://selenium.obsqurazone.com/radio-button-demo.php");
	driver.manage().window().maximize();
	List<WebElement>ob=driver.findElements(By.name("inlineRadioOptions"));
	ob.get(1).click();
	WebElement button1=driver.findElement(By.id("button-one"));
	button1.click();
	Thread.sleep(3000);
	String actual="Radio button 'Female' is checked";
	WebElement message1=driver.findElement(By.id("message-one"));
	String expected=message1.getText();
	SoftAssert obj=new SoftAssert();
	Assert.assertEquals(actual, expected);
	
	ob.get(0).click();
	WebElement button2=driver.findElement(By.id("button-one"));
	button2.click();
	Thread.sleep(3000);
	String actual1="Radio button 'Male' is checked";
	WebElement message2=driver.findElement(By.id("message-one"));
	String expected1=message2.getText();
	Assert.assertEquals(actual1, expected1);
	
	
	List<WebElement>ob2=driver.findElements(By.name("student-gender"));
	ob2.get(0).click();
	WebElement button22=driver.findElement(By.id("button-two"));
	button22.click();
	Thread.sleep(3000);
	
	List<WebElement>ob3=driver.findElements(By.name("student-age"));
	ob3.get(0).click();
	WebElement button3=driver.findElement(By.id("button-two"));
	button3.click();
	Thread.sleep(3000);
	String actual3="Gender : Male\n"
			+ "Age group: 1 to 18";
	WebElement message3=driver.findElement(By.id("message-two"));
	String expected3=message3.getText();
	Assert.assertEquals(actual3, expected3);
	obj.assertAll();
	driver.quit();
	
  }

}
