package program;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {
	public static void main(String []args) throws InterruptedException, IOException

	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/b/ref=cons-halo-slot1_4?pf_rd_r=C94X593SN98JBCWVD22V&pf_rd_p="
				+ "d2221581-606d-4556-9e0f-0ba18224e31d&pf_rd_m=A1VBAL9TL5WCBF&pf_rd_s="
				+ "merchandised-search-1&pf_rd_t=&pf_rd_i=6802110031&node=1571274031");
		//driver.manage().window().maximize();	
	Thread.sleep(3000);	
	
	WebElement s1 = driver.findElement(By.xpath("//img[@src='https://m.media-amazon.com/images/G/31/img24/Consumables/"
			+ "Appu/Baby/Jupiter24/BabyTravel03._CB563595791_.png']"));
	Thread.sleep(3000);
	File src = s1.getScreenshotAs(OutputType.FILE);
	
File ds=new File("F:\\screenshot\\.s1.jpg");
FileHandler.copy(src, ds);


driver.close();
	}
}
