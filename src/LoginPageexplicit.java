import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPageexplicit {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait w=new WebDriverWait(driver, 5);
	
		//String Products[]= {"iphone","Samsung","hello","Blackberry"};
		driver.get("https://www.rahulshettyacademy.com/loginpagePractise/");
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		driver.findElement(By.cssSelector(".customradio:nth-child(2)")).click();
		w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.id("okayBtn")));
		driver.findElement(By.id("okayBtn")).click();
		//System.out.println(driver.switchTo().alert().getText());
		
		//WebDriver w=new WebDriver(driver,7);
		Thread.sleep(3000);
		//driver.switchTo().alert().accept();
WebElement StaticDropdown=driver.findElement(By.xpath("//select[@class='form-control']"));
		
		Select dropdown =new Select(StaticDropdown);
		dropdown.selectByIndex(2);
		driver.findElement(By.xpath("//input[@id='terms']")).isSelected();
		w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//input[@id='signInBtn']")));
		driver.findElement(By.xpath("//input[@id='signInBtn']")).click();
		//Thread.sleep(2000);
		w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.partialLinkText("Checkout")));
		//List<WebElement> Addtocart=	driver.findElements(By.xpath("//h4[@class='card-title']"));
		List <WebElement> Addtocart = driver.findElements(By.cssSelector(".card-footer .btn-info"));
		for(int i=0;i<Addtocart.size();i++)
		{
			Addtocart.get(i).click();
		}
			//String webValue=Addtocart.get(i).getText();
			//String[] exactValue = Addtocart.get(i).getText().split(" ");
			//String exactValue0= exactValue[0];
			//List PhoneStore = Arrays.asList(Products);
			//if(PhoneStore.contains(exactValue0))
			//{
			//driver.findElements(By.cssSelector("div.card-footer")).get(i).click();
				driver.findElement(By.partialLinkText("Checkout")).click();
	}
}
		
	
		
			//driver.findElement(By.cssSelector("a.nav-link.btn.btn-primary")).click();
	




