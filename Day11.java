package testng3;

import org.testng.annotations.Test;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
//taking parameters from xml file Day11andDay11b.xml here
public class Day11 {
@Parameters({"browser","username","password","dbadmin"})
@Test
public void testCase1(String bw, String un, String pw, String db) {
	System.out.println("Testcase1 passed");
	System.out.println(bw);
	System.out.println(un);
	System.out.println(pw);
	System.out.println("db");
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
