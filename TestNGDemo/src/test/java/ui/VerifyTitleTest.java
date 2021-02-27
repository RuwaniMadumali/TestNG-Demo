package ui;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyTitleTest {
	
	@Test(priority = 1)
	public void checkTItle() {
		
		SoftAssert softassert = new SoftAssert();
		String expectedTitle ="Swag Labs";
	
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		String actualTitle = driver.getTitle();
		
		//hard assert
//		Assert.assertEquals(actualTitle, expectedTitle);
		
		//soft assert
		softassert.assertEquals(actualTitle, expectedTitle);
	
		driver.close();
		softassert.assertAll();
	}
	
	@Test(priority = 2)
	public void checkTest() {
		SoftAssert softassert = new SoftAssert();
		String expectedText ="Accepted usernames are:";
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		String actualText = driver.findElement(By.xpath("//div[@id=\"login_credentials\"]//child::h4[1]")).getText();
		
		//hard assert
//		Assert.assertEquals(actualTitle, expectedTitle);
		
		//soft assert
		softassert.assertEquals(actualText, expectedText,"this is pass");
		
		driver.close();
		softassert.assertAll();
	}
	
	

}
