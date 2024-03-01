import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelIntroduction {

	public static void main(String[] args) {
//imvoking the browser
		//Chrome-chromedriver-methods
		//Firefox-Firefoxdriver-Methods
		//WebDriver Meyhods+ Class meyhods
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kaushalya Kumari\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//webdriver.chrome.driver-> value paths
		//WebDriver driver= new ChromeDriver();
		
		//For firefox driver
		//geckodriver
		
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\Kaushalya Kumari\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		//WebDriver driver= new FirefoxDriver();
		
		//for Microsoftedge driver
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Kaushalya Kumari\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		//webdriver.edge.driver-> value paths
		WebDriver driver= new EdgeDriver();
		
		driver.get("https://www.javatpoint.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//driver.close();
		driver.quit();
		
		
		
	}

}
