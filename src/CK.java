import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CK {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kaushalya Kumari\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait w=new WebDriverWait(driver, 5);
	
		String Products[]= {"iphone","Samsung","hello","Blackberry"};
		driver.get("https://www.rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		driver.findElement(By.cssSelector(".customradio:nth-child(2)")).click();
		//System.out.println(driver.switchTo().alert().getText());
		
		//WebDriver w=new WebDriver(driver,5);
		Thread.sleep(3000);
		//driver.switchTo().alert().accept();
WebElement StaticDropdown=driver.findElement(By.xpath("//select[@class='form-control']"));
		
		Select dropdown =new Select(StaticDropdown);
		dropdown.selectByIndex(2);
		driver.findElement(By.xpath("//input[@id='terms']")).isSelected();
		w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("signInBtn")));
		driver.findElement(By.id("signInBtn")).click();
		Thread.sleep(2000);
		List<WebElement> Addtocart=	driver.findElements(By.xpath("//h4[@class='card-title']"));
		for(int i=0;i<Addtocart.size();i++)
		{
			String webValue=Addtocart.get(i).getText();
			String[] exactValue = Addtocart.get(i).getText().split(" ");
			String exactValue0= exactValue[0];
			List PhoneStore = Arrays.asList(Products);
			if(PhoneStore.contains(exactValue0))
			{
			driver.findElements(By.cssSelector("div.card-footer")).get(i).click();	
			}
		}
	}

}

