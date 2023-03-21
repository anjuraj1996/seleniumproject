package navigationcommands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Navigationclass {
@Test
public void sample() throws InterruptedException {
	
	  System.setProperty("webdriver.http.factory", "jdk-http-client");

	System.setProperty("webdriver.chrome.driver","C:\\Users\\Hp\\Desktop\\chrome\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.w3schools.com");
	driver.manage().window().maximize();
	String str=driver.getCurrentUrl();
	System.out.println(str);
	driver.navigate().to("https://www.javatpoint.com/selenium-tutorial");
	Thread.sleep(3000);
	driver.navigate().back();
	Thread.sleep(3000);
	driver.navigate().refresh();
	Thread.sleep(3000);
	driver.navigate().forward();
	driver.quit();
	
	
	
}
	

}

