import org.testng.Assert;
import org.testng.annotations.*;

public class CalculatorTest {

	Calculator cal;
	@BeforeSuite
	public void setUp(){
		cal =new Calculator();
		System.out.println("Creating test environment");
	}

	@BeforeClass
	public void setForClass(){

		System.out.println("setting up the class");
	}

	@BeforeTest
	public void testSetup(){

		System.out.println("setting up for test");

	}

	@BeforeMethod
	public void login(){
		System.out.println("Before method logging in");
	}

	@Test
	public void sumTest() {

		System.out.println("Testing now");
		Assert.assertEquals(cal.sum(10, 10), 20);
	}



	@Test
	public void multiplyTest() {

		Assert.assertEquals(cal.multiply(10, 10), 100);
	}


	@AfterMethod
	public void logout(){
		System.out.println("After method loggin out");
	}


	@AfterClass
	public void afterClass(){
		System.out.println("Destroying class");
	}

	@AfterTest
	public void testDestroy(){
		System.out.println("Destroying test environment");

	}
	@AfterSuite
	public void testSuite(){
		System.out.println("Deleting environment");
	}

}
