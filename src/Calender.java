import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kaushalya Kumari\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		driver.findElement(By.xpath("//input[@id='travel_date']")).click();
		
	while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("June"))
	
	{
		driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
		
	}
		List<WebElement> Date = driver.findElements(By.cssSelector(".day"));
		
		int Count=driver.findElements(By.cssSelector(".day")).size();
		

		 for(int i=0;i<Count;i++)
		 {
			 String text=driver.findElements(By.cssSelector(".day")).get(i).getText();
		 if(text.equalsIgnoreCase("26"))
		 {
		 driver.findElements(By.cssSelector(".day")).get(i).click(); break; 
		 }
		 }
		 
	}

}
