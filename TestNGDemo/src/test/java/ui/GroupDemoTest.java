package ui;

import org.testng.annotations.Test;

@Test(groups = "user-registration")
public class GroupDemoTest {
	
	@Test(priority =1 ,groups = "regression")
	public void test1() {
		System.out.println("test1 executed");
	}
	
	@Test(priority =2 ,groups = "functional")
	public void test2() {
		System.out.println("test2 executed");
	}
	
	@Test(priority =3 ,groups = {"ui","functional"})
	public void test3() {
		System.out.println("test3 executed");
	}
	
	@Test(priority =4 ,groups = {"ui","functional","regression"})
	public void test4() {
		System.out.println("test4 executed");
	}

}
