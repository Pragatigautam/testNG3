package testng3;

import org.testng.annotations.Test;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
//taking parameters from xml file Day11andDay11b.xml here and db is added
public class Day11b {
	@Parameters({"browser","username","password"})
	@Test
	public void testCase4(String bw, String un, String pw) {
		System.out.println("Testcase4 passed");
		System.out.println(bw);
		System.out.println(un);
		System.out.println(pw);
		
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
