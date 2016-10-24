import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

import junit.framework.Assert;

public class JunitAssertions {

	@Rule
	public ErrorCollector ec=new ErrorCollector();
	
	@Test
	public void testTitle(){
		String actual_title= "Google";
		String expected_title= "Google.com";
		
		System.out.println("Start Comparison");
		
		try{
			Assert.assertEquals(expected_title, actual_title);
		}catch(Throwable t)
		{
			System.out.println("Erorr captured");
			ec.addError(t);
		}
		
		
		System.out.println("Comparison done");
		

		
	}
}
