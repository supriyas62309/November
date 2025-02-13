package makemtrip;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class sample2 {
	public static void main(String []args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(05));
		driver.get("https://www.google.com/");
		//driver.navigate().to("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@name='btnK'])[2]")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//input[contains(@id,'input')]")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//input[contains(@id,'input')]")).sendKeys("selenium webdriver");
//		//driver.findElement(By.partialLinkText("selenium webdriver"));
	}

}
