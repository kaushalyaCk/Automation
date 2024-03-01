import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class E2e {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kaushalya Kumari\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.xpath("//input[@value='OneWay']")).click();
		driver.findElement(By.cssSelector("input[id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		driver.findElement(By.xpath("//a[@value='DEL']")).click();
		driver.findElement(By.xpath("//div[@class='search_options_menucontentbg'] //a[@value='BLR']")).click();
		
		//driver.findElement(By.xpath("//input[@name='ctl00$mainContent$view_date1']")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))
		{
			System.out.println("is disabled");
			Assert.assertTrue(true);
		}

		else
		  { 
			  Assert.assertTrue(false); 
			  }
		
		driver.findElement(By.xpath("//input[@name='ctl00$mainContent$chk_SeniorCitizenDiscount']")).click();
		driver.findElement(By.cssSelector(".paxinfo")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".pax-add.pax-enabled")).click();
		int i=1;
		while(i<3)
		{
		driver.findElement(By.cssSelector(".pax-add.pax-enabled")).click();
		i++;
		}
		driver.findElement(By.xpath("//input[@value='Done']")).click();
		driver.findElement(By.xpath("//input[@value='Search']")).click();
	}

}
