import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Dynamicdropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kaushalya Kumari\\Downloads\\chromedriver1.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kaushalya Kumari\\Desktop\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		//System.setProperty("webdriver.edge.driver", "C:\\Users\\Kaushalya Kumari\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		//webdriver.edge.driver-> value paths
		//WebDriver driver= new EdgeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		//driver.findElement(By.xpath("//a[@value='CJB']")).click();
	    Thread.sleep(2000);
		//driver.findElement(By.xpath("(//a[@value='BLR'])[2]")).click();
		
		//Dynamically Drop down travers from parent to child path
		
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		
		//Handling calendar UI checking  current calendar date is selected or not
		
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
	}

}
