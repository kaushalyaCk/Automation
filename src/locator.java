import java.time.Duration;



import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locator {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kaushalya Kumari\\Desktop\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("koshu");
		driver.findElement(By.name("inputPassword")).sendKeys("hello123");
		driver.findElement(By.className("submit")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
	
		Thread.sleep(1000);
		//when the application is in changing state from one view to another 
		//u might run into that interception error at that time
		
		WebElement element=driver.findElement(By.xpath("//input[@placeholder='Name']"));
		System.out.println(element);
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("john@gmail.com");
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("john11@gmail.com");
		driver.findElement(By.cssSelector("input[type='text']:nth-chi ld(4)")).sendKeys("9583681755");
		//driver.findElement(By.cssSelector("input[type='text']:nth-child(4)")).clear();
		//driver.findElement(By.xpath("//form/input[3]")).sendKeys("123478990");
		//driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		//System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		driver.findElement(By.className("reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.className("infoMsg")).getText());
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@id='inputUsername']")).sendKeys("Kaushalya");
		driver.findElement(By.xpath( "//input[@type='password']")).sendKeys("rahulshettyacademy");
		//driver.findElement(By.cssSelector("#inputUsername")).sendKeys("kaushal");
		//driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("chkboxOne")).click();
		
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//button[contains(@class,'logout-btn')]")).click();
		driver.findElement(By.className("logout-btn")).click();
		
		}

}
