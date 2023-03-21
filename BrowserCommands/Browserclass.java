package BrowserCommands;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browserclass {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Hp\\Desktop\\chrome\\chromedriver_win32\\chromedriver.exe");
	  System.setProperty("webdriver.http.factory", "jdk-http-client");

	WebDriver driver=new ChromeDriver();
	driver.get("https://www.javatpoint.com/selenium-tutorial");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	String str=driver.getCurrentUrl();
	System.out.println(str);
	String s=driver.getTitle();
	System.out.println(s);
	String s1=driver.getPageSource();
	System.out.println(s1);
	driver.close();
	driver.quit();



	}

}
