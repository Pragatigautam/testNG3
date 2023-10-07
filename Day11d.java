package testng3;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class Day11d {
@Test(priority = 1)
public void testCase1() {
	System.out.println("Test case 1 passed.");
}
@Test(priority = 2)
public void testCase2() {
	System.out.println("Test case 2 passed.");
}
@Test(priority = 3, enabled = false)
public void testCase3() {
	System.out.println("Test case 3 passed.");
}
}
