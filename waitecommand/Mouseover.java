package waitecommand;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;

public class Mouseover {
	public WebDriver driver;

  @Test
  public void f() {
	  WebElement element=driver.findElement(By.xpath("//a[@href='simple-form-demo.php']"));
	  WebElement element2=driver.findElement(By.xpath("//a[@href='date-picker.php']"));
	  Actions act=new Actions(driver);
	  act.moveToElement(element).moveToElement(element2).perform();	 
	  driver.quit();
  }
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Hp\\Desktop\\chrome\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://selenium.obsqurazone.com/index.php");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.manage().window().maximize();
  }

}
