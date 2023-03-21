package webelementpack;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class Asserttest {
	SoftAssert s;
  @Test
  public void firstmethod() {
	  String actual="orange";
	  String expected="orange";
	  String unexpected="apple";
	  s=new SoftAssert();
	  s.assertEquals(actual,unexpected);
	  System.out.println("Failed first method");
	  s.assertEquals(actual, expected);
	  System.out.println("Passed first method");
	  s.assertAll();
	  
  }
  public void secondmethod() {
	  String actual="mango";
	  String expected="mango";
	  String unexpected="apple";
	  s.assertEquals(actual,expected);
	  System.out.println("Passed second method");
	  s.assertEquals(actual, unexpected);
	  System.out.println("Failed second method");
	  
  }
 
 

}
