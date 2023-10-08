package testng3;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class Day12b {
@Test(groups= {"login"})
public void testCase4() {
	System.out.println("Login test case 1");
}
@Test(groups= {"resgression"})
public void testCase5() {
	System.out.println("Regression test case");
}
@Test(groups= {"login"})
public void testCase6() {
	System.out.println("Login test case 2");
}
}
