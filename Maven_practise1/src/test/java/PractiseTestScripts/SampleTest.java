package PractiseTestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleTest {
@Test
public void demo() throws InterruptedException{
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("http://demowebshop.tricentis.com/");
	driver.manage().window().maximize();
	driver.findElement(By.className("ico-register")).click();
	driver.findElement(By.id("gender-male")).click();
	driver.findElement(By.id("FirstName")).sendKeys("Shivu");
	driver.findElement(By.id("LastName")).sendKeys("Kumar HR");
	driver.findElement(By.id("Email")).sendKeys("shivu09@gmail.com");
	driver.findElement(By.id("Password")).sendKeys("S1234abc");
	driver.findElement(By.id("ConfirmPassword")).sendKeys("S1234abc");
	driver.findElement(By.id("register-button")).click();
	Thread.sleep(2000);
	driver.close();
}
}
