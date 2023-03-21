package dropdownpack;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;

public class Multydropdown {
	public WebDriver driver;

  @Test
  public void f() throws AWTException {
	  SoftAssert s=new SoftAssert();
	  Robot r=new Robot();
	  //r.keyPress(KeyEvent.VK_SHIFT);
	  r.keyPress(KeyEvent.VK_CONTROL);
	  //r.keyRelease(KeyEvent.VK_SHIFT);
	  r.keyRelease(KeyEvent.VK_CONTROL);
	 Select dropdown=new Select(driver.findElement(By.id("multi-select-field")));
	 dropdown.selectByVisibleText("Green");
	 dropdown.selectByVisibleText("Yellow");
	  WebElement button1=driver.findElement(By.id("button-first"));
	  button1.click();
	  WebElement message1=driver.findElement(By.id("message-two"));
	  String actual=message1.getText();
	  String expected="First selected color is : Green";
	  s.assertEquals(actual, expected);
	  WebElement btall=driver.findElement(By.id("button-all"));
	  btall.click();
	  List<WebElement>data=dropdown.getAllSelectedOptions();
	  int size=data.size();
	  for(int i=0;i<size;i++) {
		  String getvalue=data.get(i).getText();
		   System.out.println(getvalue);
	  }
	 
  }
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Hp\\Desktop\\chrome\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://selenium.obsqurazone.com/select-input.php");
	  driver.manage().window().maximize();
  }

}
