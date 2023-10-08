package testng3;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Day13 {
@Test
public void login() {
	System.out.println("executing the logn test case");
	Assert.assertEquals(true, true);
}
@Test(dependsOnMethods= {"login"})
public void search() {
	System.out.println("Executing the search test case");
	Assert.assertEquals(false, true);
}
@Test(dependsOnMethods= {"login","search"})
public void testCase3() {
	System.out.println("Executing the add to card test case");
}
}
