package variousConcept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
	static WebDriver driver;

	public static void main(String[] args) {
		launchBrowser();
		loginTest();
		tearDown();
		
		launchBrowser();
		negLogin();
		tearDown();
		
		
		
	}
		
		
		public static void launchBrowser() {
			/*System.setProperty("webdriver.chrome.driver", "C:\\Users\\warut\\Selenuim\\crm\\wb\\chromedriver.exe");
			
			System.setProperty("webdriver.chrome.driver", "wb\\chromedriver.exe");
			
			System.setProperty("webdriver.chrome.driver", "/crm/wb/chromedriver.exe");*/
			
			System.setProperty("webdriver.chrome.driver", "./wb/chromedriver.exe");
		      driver = new ChromeDriver();
			
			//deletecookies
			driver.manage().deleteAllCookies();
			
			//go to url
			driver.get("http://www.techfios.com/billing/?ng=admin/");
			;
			
			//maximize window
			driver.manage().window().maximize();
			
			//Applying impilicitlywait 
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			
		}
		public static void loginTest () {
			
			//identify username, password  insert and login 
			driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
			driver.findElement(By.id("password")).sendKeys("abc123");
			driver.findElement(By.name("login")).click();
			
			
		}
		
public static void negLogin () {
			
			//identify username, password  insert and login 
			driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
			driver.findElement(By.id("password")).sendKeys("123abc");
			driver.findElement(By.name("login")).click();
}
			
		public static void tearDown() {
			//close
			driver.close();
			
		}
		
		
		
		
		
	}

	
		
	


