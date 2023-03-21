package packalert;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Alertsample {
public WebDriver driver;
  @Test
public void testalert() throws InterruptedException {
	  WebElement clickme=driver.findElement(By.xpath("//button[@class='btn btn-success']"));
	  clickme.click();
	  Thread.sleep(3000);
	  Alert al=driver.switchTo().alert();
	  al.accept();
	  
	  WebElement clickme2=driver.findElement(By.xpath("//button[@class='btn btn-warning']"));
	  clickme2.click();
	  Thread.sleep(3000);
	  Alert al1=driver.switchTo().alert();
	  al1.accept();
	  
	  WebElement prompt=driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
	  prompt.click();
	  Thread.sleep(3000);
	  Alert al2=driver.switchTo().alert();
	  al2.sendKeys("anu");
	  Thread.sleep(3000);
	  al2.accept();
	  driver.quit();
	  
	  }
 
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Hp\\Desktop\\chrome\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://selenium.obsqurazone.com/javascript-alert.php");
	  driver.manage().window().maximize();

  }

  
}
