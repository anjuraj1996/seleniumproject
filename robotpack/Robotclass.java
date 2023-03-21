
package robotpack;

import org.testng.annotations.Test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class Robotclass {
	public WebDriver driver;

  @Test
  public void f() throws AWTException {
	  Robot r=new Robot();
	  r.keyPress(KeyEvent.VK_CONTROL);	  
	  r.keyPress(KeyEvent.VK_T);
	  r.keyRelease(KeyEvent.VK_CONTROL);
	  r.keyRelease(KeyEvent.VK_T);
	  String parentTab=driver.getWindowHandle();
	  System.out.println("parent tab"+parentTab);
	  Set<String> alltabs=driver.getWindowHandles();
	  System.out.println("all tabs"+alltabs);
	  System.out.println("size"+alltabs.size());
	  String tab1=(String)alltabs.toArray()[0];
	  String tab2=(String)alltabs.toArray()[0];
	  driver.switchTo().window(tab2);
	  driver.get("https://www.wikipedia.org");
	  driver.quit();
  }
  @BeforeClass
  
  public void beforeClass() {
	  System.setProperty("web driver.chrome.driver", "C:\\Users\\Hp\\Desktop\\chrome\\chromedriver_win32\\chromedriver.exe");
	  System.setProperty("webdriver.http.factory", "jdk-http-client");
	  driver=new ChromeDriver();
	  driver.get("https://selenium.obsqurazone.com/select-input.php");
	  driver.manage().window().maximize();
  }
}
