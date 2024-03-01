import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
//TestNg is the one of the testing frame.

public class Updateddropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kaushalya Kumari\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='chk_IndArm']")).isSelected());
		// System.out.println(driver.findElement(By.cssSelector("input[id*='chk_IndArm']")).isSelected());
		driver.findElement(By.cssSelector("input[id*='chk_IndArm']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id*='chk_IndArm']")).isSelected());
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='chk_IndArm']")).isSelected());
		
		// Validating if UI Elements are disabled or enabled with Attributes(Calendar)

				// System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
				System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
				driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
				System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
				if (driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
				{
					System.out.println("is enabled");
					Assert.assertTrue(true);
				}

				else
				  { 
					  Assert.assertTrue(false); 
					  }
		
		//passengers details
		
		driver.findElement(By.id("divpaxinfo")).click();
		// driver.findElement(By.id("hrefIncAdt")).click();
		Thread.sleep(4000);
		/*
		 * int i=0; while(i<2) { driver.findElement(By.id("hrefIncAdt")).click(); i++; }
		 */
		
		// Count the number of check boxes.
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());

		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		for (int i = 1; i < 5; i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		driver.findElement(By.id("btnclosepaxoption")).click();
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
		// System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

	}

}
