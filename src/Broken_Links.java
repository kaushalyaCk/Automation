import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class Broken_Links {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	List<WebElement> Links=	driver.findElements(By.cssSelector("li[class='gf-li'] a"));

	SoftAssert a =new SoftAssert();
	for(WebElement Link:Links)
	{
		
		String url = Link.getAttribute("href");
		HttpURLConnection conn =(HttpURLConnection)new URL(url).openConnection();
		conn.setRequestMethod("HEAD");
		conn.connect();
		int respCode= conn.getResponseCode();
		System.out.println(respCode);	
		a.assertTrue(respCode<400, "The link with broken  " + Link.getText()+ " is broken with code" +respCode);
		}
		
	a.assertAll();
	}

	}
