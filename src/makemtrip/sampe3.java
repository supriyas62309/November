package makemtrip;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class sampe3 {
	public static void main(String []args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
		WebElement s=driver.findElement(By.xpath("//*[@data-cy='closeModal']"));
		
		act.moveToElement(s).perform();
		Thread.sleep(2000);
		act.click(s).perform();	
		WebElement	from=driver.findElement(By.xpath("//input[@type='text']"));
act.moveToElement(from).perform();
act.click(from).perform();
Thread.sleep(2000);
act.sendKeys(Keys.ARROW_DOWN).perform();
act.sendKeys(Keys.ARROW_DOWN).perform();
act.sendKeys(Keys.ARROW_DOWN).perform();
act.sendKeys(Keys.ENTER).perform();
String v=from.getAttribute("class");
System.out.println(v);
//driver.findElement(By.xpath("//a[text()='Search']")).click();
	}

}
