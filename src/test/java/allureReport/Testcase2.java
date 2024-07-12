package allureReport;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Testcase2
{
	@Test
	public void testmethod1()
	{
		Assert.assertTrue(false);
		System.out.println("method is not working as expected");
	}
}
