package testng3;

import org.testng.annotations.Test;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day11b {
	@Parameters({"browser","username","password"})
	@Test
	public void testCase4(String bw, String un, String pw, String db) {
		System.out.println("Testcase4 passed");
		System.out.println(bw);
		System.out.println(un);
		System.out.println(pw);
		System.out.println(db);
	}
	@Test
	public void testCase5() {
		System.out.println("Testcase5 passed");
	}
	@Test
	public void testCase6() {
		System.out.println("Testcase6 passed");
	}
}
