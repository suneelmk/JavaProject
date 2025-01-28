package TestNGpractice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testngpractice1 {
	@Test
	public void test1()
	{
		Reporter.log("hi", true);
	}
	@Test
	public void test2()
	{
		Reporter.log("hello", true);
	}
	@Test(invocationCount=4)
	public void test3()
	{
		Reporter.log("Bye", true);
	}

}
