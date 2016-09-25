import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class ImplicitWairDemo {

	public static void main(String[] args) {
		// To understand implicit wait
		
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		WebDriver d1= new FirefoxDriver();
		d1.get("http://www.calculator.net/gas-mileage-calculator.html");
		
		d1.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);

		WebElement cod = d1.findElement(By.xpath("//input[@id='usgasputin']"));
		cod.sendKeys("700");

	}

}
