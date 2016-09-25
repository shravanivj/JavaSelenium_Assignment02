import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.SendKeysAction;



public class ButtonExample {

	public static void main(String[] args) {
		// To identify button and perform a click
		
    //System.setProperty("webdriver.gecko.driver", "E:/geckodriver-v0.10.0-win64/geckodriver.exe");
	
	System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
	WebDriver d1= new FirefoxDriver();
		
		//System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		//Opening a chrome browser
		//ChromeDriver d1 = new ChromeDriver();
		
	   
	d1.get("https://www.golfclubs.com/");
	   //d1.findElement(By.xpath("//input[@name='q']")).sendKeys("selenium");
	   
	d1.findElement(By.xpath(ObjectRepository.searchBox)).sendKeys("selenium");
	  // d1.findElement(By.xpath("//button[@type='submit']")).click();
	  //d1.findElement(By.cssSelector("button[type='submit']")).click();
	d1.findElement(By.xpath(ObjectRepository.searchButton)).click();  
	
		d1.close();

	}

}
