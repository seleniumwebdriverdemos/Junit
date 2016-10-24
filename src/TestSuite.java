//import org.junit.FixMethodOrder;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
//import org.junit.runners.MethodSorters;


//@FixMethodOrder(MethodSorters.JVM)
@RunWith(Suite.class)
@SuiteClasses({JunitAnnotations_ClassOne.class,JunitAnnotations_ClassTwo.class,JunitAssertions.class})
public class TestSuite {
	
}
