package variousConcept;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest_Junit {
	
	WebDriver driver;
	
   @BeforeClass
	public static void BeforeClass () {
		System.out.println("before class");
	}
	
	@AfterClass
	public static void AfterClass () {
		System.out.println("after class");
	}
	@Before
	public void launchBrowser() {

		System.setProperty("webdriver.chrome.driver", "./wb/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("http://www.techfios.com/billing/?ng=admin/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Test
	public void loginTest() {
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc123");
		driver.findElement(By.name("login")).click();

	}
	@Test
	public void negLogin() {
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("123abc");
		driver.findElement(By.name("login")).click();
	}
	
	@After
	public void tearDown() {
		driver.close();

	}

}
