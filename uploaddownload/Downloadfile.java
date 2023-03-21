package uploaddownload;

import org.testng.annotations.Test;

import java.time.Duration;
import java.util.NoSuchElementException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.BeforeClass;

@Test
public class Downloadfile {
	public WebDriver driver;
  public void f() {
	  WebElement element1=driver.findElement(By.id("textbox"));
	  element1.sendKeys("sample automation test");
	  WebElement btn1=driver.findElement(By.id("create"));
	  btn1.click();
	  FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
	  wait.withTimeout(Duration.ofSeconds(30));
	  wait.pollingEvery(Duration.ofSeconds(30));
	  wait.ignoring(NoSuchElementException.class);
	wait.until(ExpectedConditions.presenceOfElementLocated((By.id("download-file"))));
	  WebElement btn2=driver.findElement(By.id("download-file"));
	  btn2.click();
	  driver.quit();
  }
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.http.factory", "jdk-http-client");
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Hp\\Desktop\\chrome\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://selenium.obsqurazone.com/file-download.php");
	  
	  driver.manage().window().maximize();
	  
}

}

