package uploaddownload;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class Upload2 {
	WebDriver driver;
  @Test
  public void f() {
	  WebElement btn1=driver.findElement(By.id("uploadfile_0"));
	  btn1.sendKeys("C:\\Users\\Hp\\Desktop\\bullet_point.png");
	  WebElement check=driver.findElement(By.id("terms"));
	  check.click();
	  WebElement submitbtn=driver.findElement(By.id("submitbutton"));
	  submitbtn.click();
	  driver.quit();
	  
  }
  @BeforeClass
  public void beforeClass()  {
	  System.setProperty("webdriver.http.factory", "jdk-http-client");
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Hp\\Desktop\\chrome\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://demo.guru99.com/test/upload");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.manage().window().maximize();
  }

}
