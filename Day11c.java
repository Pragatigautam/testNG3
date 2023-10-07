package testng3;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

@Test
public class Day11c {
	@Parameters({"browser"})
public void testCase1(@Optional("chrome")String bw) {
	System.out.println(bw);
}
}
