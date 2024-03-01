import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kaushalya Kumari\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com");
		driver.manage().window().maximize();
		//driver.findElement(By.cssSelector("a[href*='/nested frames']")).click();
		driver.findElement(By.linkText("Nested Frames")).click();
		//System.out.println(driver.findElements(By.tagName("frameset")).size());
		
		driver.switchTo().frame("frame-top");
		driver.switchTo().frame("frame-middle");
		System.out.println(driver.findElement(By.id("content")).getText());
	}

}
