
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;


public class SearchTextBox {

	
	public static void main(String[] args) {
		// searching a text box in bbc.com and entering a value in the search text box
		System.setProperty("webdriver.gecko.driver", "E:/geckodriver-v0.10.0-win64/geckodriver.exe");
		
		WebDriver d1= new FirefoxDriver();
	   d1.get("http://www.bbc.com");
	   d1.findElement(By.id("orb-search-q")).sendKeys("selenium");
		d1.close();

	}

	}


