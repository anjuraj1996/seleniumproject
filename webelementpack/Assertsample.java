package webelementpack;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assertsample {
	WebDriver driver;

  @Test
  public void f() {
	  driver.get("https://selenium.obsqurazone.com/check-box-demo.php");
	  driver.manage().window().maximize();
	  WebElement check=driver.findElement(By.id("check-box-one"));
	  check.click();
	  boolean s=check.isSelected();
	  System.out.println(s);
	  WebElement check1=driver.findElement(By.id("check-box-two"));
	  check1.click();
	  WebElement check2=driver.findElement(By.id("check-box-three"));
	  check2.click();
	  WebElement check3=driver.findElement(By.id("check-box-four"));
	  check3.click();
	  String actual=driver.getTitle();
	  String expected="Obsqura Testing";
	  Assert.assertEquals(actual, expected);
	  Assert.assertNull(driver);
	  //sa.assertAll();
  }
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Hp\\Desktop\\chrome\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
  }


}
