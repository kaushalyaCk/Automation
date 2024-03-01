import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Addtocart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kaushalya Kumari\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebDriverWait w= new WebDriverWait(driver, 5);
		
		String vegetable[] = { "Cucumber", "Brocolli", "Beetroot","Corn" };
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String Promocode="rahulshettyacademy";
		AddItems(driver, vegetable);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("input.promoCode")));
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys(Promocode);
		driver.findElement(By.xpath("//button[@class='promoBtn']")).click();
		
		w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("span.promoInfo")));
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		
	}
	
	
public static void AddItems(WebDriver driver,String vegetable[])
{
	int j=0;
	List<WebElement> products = driver.findElements(By.xpath("//h4[@class='product-name']"));

	for (int i = 0; i < products.size(); i++) {
		//rocolli - 1kg
		//needed brocolli without hyphen and 1kg
		
		String[] vegetableName = products.get(i).getText().split("-");
		String withouthyphen=vegetableName[0].trim();
		//convert Array into ArraysList
		List vegetablelist = Arrays.asList(vegetable);
		

	//	if (vegetablelist.contains("cucumber"))
		if (vegetablelist.contains(withouthyphen))
		{
			j++;
			//Click on add to cart
		//	driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click(); text doesnt use in real time bcz it might be changed
		//Static path X-path
			driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
		if(j==vegetable.length)
		{
			break;
		}
}
}
}	
	
	
}
