package TestPackage;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestA
{

	
	public class TestClass_TestNG {
		@BeforeClass
		public void beforeClass()
		{
			System.out.println("beforeClass_TestA");
		}
		@BeforeMethod
		public void beforeMethod()
		{
			System.out.println("beforeMethod");
		}
		@Test
		public void  testB()
		{
			System.out.println("testB");
		}
		@Test
		public void testC()
		{
			System.out.println("testC");
		}
		@Test
		public void testA()
		{
			System.out.println("testA");
			
		}
		@AfterMethod
		public void afterMethod()
		{
		   System.out.println("afterMethod");	
		}
		@AfterMethod
		public void afterClass()
		{
		   System.out.println("afterClass");	
		}
}

	
	
	
	
	
	
	
}