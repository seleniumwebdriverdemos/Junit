import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assume;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;


/*
 * 
 * @Test
 * @Before
 * @After
 * @BeforeClass
 * @AfterClass
 * @Ignore
 * @TestSuite
 * @Rule
 * @FixMethodOrder(MethodSorters.JVM)
 * Junit Assertions
 * ErorrCollector
 */

public class JunitAnnotations_ClassOne {

	
	public static boolean dbconnection(){
		
		return true;
	}
	
	@BeforeClass
	public static void setUp(){
		
		System.out.println("driver=new FirefoxDriver()");
		Assume.assumeTrue(dbconnection());
	}
	
	@Before
	public void openBrowser(){
		
		System.out.println("Openinig the browser");
	}
	
	@Test
	public void navigateToURL(){
		
		System.out.println("Navigating to the URL");
	}
	@Test
	public void validateLink(){
		
		System.out.println("validating the link");
		
	}
	//@Ignore
	@Test
	public void loginToAccount(){
		System.out.println("Login to my account");
	}
	
	@After
	public void closeBrowser(){
		
		System.out.println("Closing the browser");
	}
	
	@AfterClass
	public static void tearDown(){
		
		System.out.println("driver.quit()");
	}
}
