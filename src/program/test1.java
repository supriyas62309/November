package program;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class test1 {
	public static void main(String[] args) throws InterruptedException
	{
		//ChromeOptions opt=new ChromeOptions();
		//opt.addArguments(null)
		WebDriver driver=new ChromeDriver();
		//Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get("https://www.amazon.in/");
		WebElement a=driver.findElement(By.xpath("//*[text()='Hello, sign in']"));
		Actions act=new Actions(driver);
		act.moveToElement(a).perform();
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.id("ap_email")).sendKeys("9373512652");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.name("password")).sendKeys("supriya@s");
		driver.findElement(By.id("signInSubmit")).click();
		driver.findElement(By.id("searchDropdownBox")).click();
		
	WebElement k=	driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
	Select s1=new Select(k);
	Thread.sleep(2000);
	s1.selectByVisibleText("Books");
	

		
		
		//WebDriverWait w1=new WebDriverWait(driver,Duration.ofSeconds(3));
			//WebElement x 
			//= w1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[contains(@id,'searchDropdownBox')]")));
		//x.click();		
		// driver.findElement(By.id("searchDropdownBox")).click();
		//Select s1=new Select(f);
		//s1.selectByVisibleText(books)
		
	}

}
