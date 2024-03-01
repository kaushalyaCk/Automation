import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignme4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kaushalya Kumari\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Multiple Windows")).click();
		
		driver.findElement(By.linkText("Click Here")).click();	//driver.findElement(By.cssSelector("a[href*='windows']")).click();
		Set<String>new_window=driver.getWindowHandles();
		Iterator<String>it=new_window.iterator();
		String Parentwindow=it.next();
		String ChildId=it.next();
		driver.switchTo().window(ChildId);
		System.out.println(driver.findElement(By.xpath("//h3['New Window']")).getText());	//System.out.println(driver.findElement(By.xpath("//div/h3")).getText());
		//driver.findElement(By.xpath("//h3['New Window']")).getText();
		//String window=driver.findElement(By.xpath("//h3['New Window']")).getText().split(" ")[1];
		//System.out.println(window);
		driver.switchTo().window(Parentwindow);
		//System.out.println(driver.findElement(By.xpath("//div[@id='content']/div/h3")).getText());
		System.out.println(driver.findElement(By.xpath("//h3['Opening a new window']")).getText());
	}

}
