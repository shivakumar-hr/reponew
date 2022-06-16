package PractiseTestScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class oneEndtoEndCheckoutTest extends BaseTest {
	@Test
	public void Tc1(){

		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		String email="mahan@gmail.com";
		String pwd="maha@123";
		driver.findElement(By.xpath("//a[@class='ico-login']")).click();
		driver.findElement(By.xpath("//input[@class='email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@name='Password']")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		driver.findElement(By.xpath("(//a[contains(text(),'Apparel & Shoes')])[1]")).click();
		driver.findElement(By.xpath("(//input[@value='Add to cart'])[3]")).click();
		driver.findElement(By.xpath("//span[@class='close']")).click();
		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		driver.findElement(By.xpath("//input[@id='termsofservice']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Checkout')]")).click();
		driver.findElement(By.xpath("//a[@class='ico-logout']")).click();
		
	}
}
