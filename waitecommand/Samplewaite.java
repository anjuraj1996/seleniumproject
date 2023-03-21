package waitecommand;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;

public class Samplewaite {
	public WebDriver driver;

  @Test
  public void f() {
	  WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(10));
	  w.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(driver.findElement(By.className("demo-frame"))));
	  WebElement source=driver.findElement(By.id("draggable"));
	  WebElement destination=driver.findElement(By.xpath("//div[@id='droppable']"));
	  Actions a=new Actions(driver);
	  a.dragAndDrop(source, destination);
	  a.build().perform();
	  
	  
	  
  }
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Hp\\Desktop\\chrome\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://jqueryui.com/droppable/");
	  driver.manage().window().maximize();
  }

}
