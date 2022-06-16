package PractiseTestScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	WebDriver driver;
	@BeforeClass
	public void Browserlaunch(){
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
	}
	@AfterClass
	public void CloseBrowser(){
		driver.close();
	}
}
