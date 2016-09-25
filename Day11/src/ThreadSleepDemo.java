import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class ThreadSleepDemo {

	public static void main(String[] args) {
		// to understand thread.sleep
		
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		WebDriver d1= new FirefoxDriver();
		d1.get("http://www.calculator.net/gas-mileage-calculator.html");
		
		System.out.println("waiting for 10 seconds");
		try {
			Thread.sleep(10000);
			System.out.println("waited for 10 seconds");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		WebElement cod = d1.findElement(By.xpath("//input[@id='uscodreading']"));
		cod.sendKeys("1500");

		d1.close();
	}

}
