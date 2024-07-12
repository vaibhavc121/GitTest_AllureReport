package allureReport;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Testcase3
{
	WebDriver driver;

	@BeforeClass
	public void setup()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.nopcommerce.com/");
	}

	@Test(priority = 1)
	public void checklogo()
	{
		boolean logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
		Assert.assertEquals(logo, true);
	}

	@Test(priority = 2)
	public void logintest()
	{
		driver.findElement(By.xpath("//a[normalize-space()='Log in']")).click();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("vaibhavc121@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("123");
		Assert.assertTrue(false);
	}

	@Test(priority = 3)
	public void regtest()
	{
		throw new SkipException("skipping this test");
	}

	@AfterClass
	public void afterClass()
	{
		driver.quit();
	}

}
