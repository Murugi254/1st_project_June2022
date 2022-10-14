package variousConcept;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pratice1 {
	WebDriver driver;
	
	@Before
	public void init(){
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://objectspy.space/");
		
} 
	@Test
	public void inputTest() {
		driver.findElement(By.name("firstname")).sendKeys("Essy");
		driver.findElement(By.name("lastname")).sendKeys("Murugi");
		driver.findElement(By.id("sex-0")).click();
		driver.findElement(By.id("photo")).sendKeys("C:\\Users\\warut\\Documents\\shortcut keys.txt");
		//driver.findElement(By.linkText("OS-API Product FrontEnd")).click();
		driver.findElement(By.partialLinkText("read")).click();
	}
		
	}
