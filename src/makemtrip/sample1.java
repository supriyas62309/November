package makemtrip;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import dev.failsafe.internal.util.Durations;

public class sample1 {
	public static void main(String args[])
	{
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(op);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(05));
		driver.get("https://www.makemytrip.com/");
		
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("//*[@class='commonModal__close']")).click();
		driver.findElement(By.xpath("//input[@type='text']")).click();
driver.findElement(By.xpath("//input[@type='text']")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(Keys.ENTER);
	
		
	//	driver.findElement(By.id("departure")).click();
	}

}
