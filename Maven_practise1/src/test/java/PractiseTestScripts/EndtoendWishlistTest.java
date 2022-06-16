package PractiseTestScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class EndtoendWishlistTest extends BaseTest {
	@Test
	public void Tc2(){
		driver.get("http://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		String email="mahan@gmail.com";
		String pwd="maha@123";
		driver.findElement(By.xpath("//a[@class='ico-login']")).click();
		driver.findElement(By.xpath("//input[@class='email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@name='Password']")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		driver.findElement(By.xpath("(//a[contains(text(),'Apparel & Shoes')])[1]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Blue and green Sneaker')]")).click();
		driver.findElement(By.xpath("//input[@id='add-to-wishlist-button-28']")).click();
		driver.findElement(By.xpath("//span[@class='close']")).click();
		driver.findElement(By.xpath("//span[text()='Wishlist']")).click();
		driver.findElement(By.xpath("//a[@class='ico-logout']")).click();
	}
}
