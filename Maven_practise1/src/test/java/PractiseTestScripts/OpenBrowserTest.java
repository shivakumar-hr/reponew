package PractiseTestScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenBrowserTest {
	@Test
	public void launch(){
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("(//a[contains(text(),'Apparel')])[1]")).click();
		driver.findElement(By.xpath("//a[text()='Casual Golf Belt']/../..//input")).click();
		
		driver.findElement(By.xpath("//span[@class='close']")).click();
		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		driver.close();
	}
}
	