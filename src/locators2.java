import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class locators2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kaushalya Kumari\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		String name="Chanchal";
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String temp=getPassword(driver);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys(temp);
		//driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.className("submit")).click();
		
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.tagName("p")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		Assert.assertEquals(driver.findElement(By.tagName("h2")).getText(),"Hello "+name+",");
		//driver.findElement(By.className("logout-btn")).click();
		//driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		//driver.close();
	}

	public static String getPassword(WebDriver driver) throws InterruptedException
	{
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.className("reset-pwd-btn")).click();
		String Paswrdtext=driver.findElement(By.className("infoMsg")).getText();
		//Please use temporary password 'rahulshettyacademy' to Login.
		String[] passwordArray=Paswrdtext.split("'");
		//Please use temporary password 0th index
		//rahulshettyacademy' to Login 1st index
		String[] passwordArray2=passwordArray[1].split("'");
		//String Password=passwordArray[1].split("'")[0];
		return passwordArray2[0];
	}
}
