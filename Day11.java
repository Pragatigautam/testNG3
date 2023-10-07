package testng3;

import org.testng.annotations.Test;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day11 {
@Parameters({"browser","username","password"})
@Test
public void testCase1(String bw, String un, String pw) {
	System.out.println("Testcase1 passed");
	System.out.println(bw);
	System.out.println(un);
	System.out.println(pw);
}
@Test
public void testCase2() {
	System.out.println("Testcase2 passed");
}
@Test
public void testCase3() {
	System.out.println("Testcase3 passed");
}
}
