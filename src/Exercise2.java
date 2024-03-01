import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Exercise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kaushalya Kumari\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.name("name")).sendKeys("kaushalya kumari");
		driver.findElement(By.name("email")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("Hello1233");
		driver.findElement(By.id("exampleCheck1")).click();
		WebElement StaticDropdown=driver.findElement(By.id("exampleFormControlSelect1"));
		
		Select dropdown =new Select(StaticDropdown);
	    dropdown.selectByIndex(1);
	    driver.findElement(By.id("inlineRadio1")).click();
	    driver.findElement(By.name("bday")).sendKeys("01-10-1998");
	    driver.findElement(By.cssSelector(".btn.btn-success")).click();
		}

}
