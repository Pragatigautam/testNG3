package testng3;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Day13b {
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
	public void addtoCart() {
		System.out.println("Executing the add to card test case");
	}
	@Test(dependsOnMethods= {"addtoCart"})
	public void payment() {
		System.out.println("Executing the payment");
	}
}
