import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Header_Count {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kaushalya Kumari\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//Count the link of header section
		//tagname<a>
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//Count the link of footer section byu using variable
		WebElement footerdriver= driver.findElement(By.id("gf-BIG"));
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		//Count the lik of coloumn section
	WebElement coloumndriver=driver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
	System.out.println(coloumndriver.findElements(By.tagName("a")).size());
	
	//Click on each link in the coloumn and checked if the pages are opening:
	
	for(int i=1;i<coloumndriver.findElements(By.tagName("a")).size();i++)
	{
		//Click on each tab of link for opening all the pages
		String Clickonlinktab=Keys.chord(Keys.CONTROL,Keys.ENTER);
		coloumndriver.findElements(By.tagName("a")).get(i).sendKeys(Clickonlinktab);
		Thread.sleep(2000);
	}
	/*
	 * Set<String> abc=driver.getWindowHandles(); Iterator<String>
	 * it=abc.iterator(); while(it.hasNext()) { driver.switchTo().window(it.next());
	 * System.out.println(driver.getTitle()); }
	 */
	}

}
