package waitecommand;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import org.testng.annotations.BeforeClass;

public class Samplewaiteobs {
	public WebDriver driver;

  @Test
  public void f() throws InterruptedException {
	  SoftAssert s=new SoftAssert();
	 // WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(10));
	 // w.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(driver.findElement(By.className("card"))));
      WebElement source=driver.findElement(By.xpath("//span[text()='Draggable n°1']"));
      WebElement destination=driver.findElement(By.xpath("//div[@id='mydropzone']"));
      Thread.sleep(300);
      Actions a=new Actions(driver);
      a.dragAndDrop(source, destination);
      a.build().perform();
      s.assertAll();
      driver.quit();

  }
  @BeforeClass
  public void beforeClass() {
      System.setProperty("webdriver.http.factory", "jdk-http-client");
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Hp\\Desktop\\chrome\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://selenium.obsqurazone.com/drag-drop.php");
	  driver.manage().window().maximize();
  }

}
