package testng3;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class Day12 {
@Test(groups= {"smoke"})
public void testCase1() {
	System.out.println("Smoke test case");
}
@Test(groups= {"smoke","regression"})
public void testCase2() {
	System.out.println("smoke and regression test");
}
@Test(groups= {"smoke"})
public void testCase3() {
	System.out.println("Smoke test 3");
}
}
