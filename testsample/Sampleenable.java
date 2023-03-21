package testsample;

import org.testng.annotations.Test;

public class Sampleenable {
	
	 @Test(priority=1,description="test1",groups={"smoke"})
	  public void firstmethod() {
		  System.out.println("first mathod");
	  }
	  @Test(priority=0,description="test2",groups= {"smoke","regression"})
	  public void secondmethod() {
		  System.out.println("second mathod");

	  }
	  @Test(priority=3,enabled=false)
	  public void thirdmethod() {
		  System.out.println("third mathod");

	  }
	  @Test(priority=4)
	  public void fourthmethod() {
		  System.out.println("fourth mathod");

	  }
	}
                                             