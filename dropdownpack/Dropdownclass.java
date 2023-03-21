package dropdownpack;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;

public class Dropdownclass {
	public WebDriver driver;
  @Test
  public void f() {
	  
	  Select dropdown=new Select(driver.findElement(By.id("single-input-field")));
	  dropdown.selectByIndex(0);
	  dropdown.selectByValue("Green");
	  dropdown.selectByVisibleText("Yellow");
	  String s=dropdown.getFirstSelectedOption().getText();
	  System.out.println(s);
	  List<WebElement>data=dropdown.getOptions();
	  int size=data.size();
	  for(int i=0;i<size;i++) {
		  String getvalue=data.get(i).getText();
		  System.out.println(getvalue);
	  }
	  
	  
	  driver.quit();
	  
  }
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Hp\\Desktop\\chrome\\chromedriver_win32\\chromedriver.exe");
      System.setProperty("webdriver.http.factory", "jdk-http-client");
	  driver=new ChromeDriver();
	  driver.get("https://selenium.obsqurazone.com/select-input.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	  driver.manage().window().maximize();
  }

  @AfterClass
  public void afterClass() {
  }

}
