package PractiseTestScripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WithoutSelectHandlingDropdownTest {
	@Test
	public void DropdownTest() throws InterruptedException, AWTException{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		Actions act=new Actions(driver);
		driver.findElement(By.xpath("(//a[contains(text(),'Apparel')])[1]")).click();
		WebElement ele=driver.findElement(By.xpath("//select[@name='products-orderby']"));
		ele.sendKeys(Keys.ENTER);
		ele.sendKeys(Keys.ARROW_DOWN);		//using keys
		ele.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
//		act.sendKeys(ele, Keys.ENTER).perform();
//		Thread.sleep(2000);
//		act.sendKeys(ele, Keys.ARROW_DOWN).perform();	//using actions class
//		Thread.sleep(2000);
//		act.sendKeys(ele, Keys.ENTER).perform();
//		Thread.sleep(2000);
//		driver.close();
//		Robot robo=new Robot();
//		ele.click();								//using robot class
//		robo.keyPress(KeyEvent.VK_DOWN);
//		robo.keyRelease(KeyEvent.VK_DOWN);
		driver.close();
		
		
		
			
		
	}
}
