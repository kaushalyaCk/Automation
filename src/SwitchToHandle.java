import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SwitchToHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kaushalya Kumari\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		 driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]/input")).click();
		  
		 String opt=driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]")).getText();
		
		//driver.findElement(By.id("checkBoxOption2")).click();
		//String Option2= driver.findElement(By.xpath("//*[@id='checkBoxOption2')/fieldset/label[2]")).getText();
		WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
		//String Option2= driver.findElement(By.xpath(@id="checkbox-example")//fieldset/label[2]/).getText();
		//WebElement dropDown= driver.findElement(By.id("dropdown-class-example"));
		Select s=new Select(dropdown);
		s.selectByVisibleText(opt);
		driver.findElement(By.name("enter-name")).sendKeys(opt);
		driver.findElement(By.id("alertbtn")).click();
		String alert=driver.switchTo().alert().getText();
		if(alert.contains(opt))
		{
			System.out.println("Alert Massage Successfull");
		}
		else
		{
			System.out.println("Something wrong massage excution");
		}
		
	}

}
