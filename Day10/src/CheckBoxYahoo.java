import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class CheckBoxYahoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
				//Opening a chrome browser
		ChromeDriver d1 = new ChromeDriver();
		
		d1.get("https://login.yahoo.com/config/login?.src=fpctx&.intl=us&.lang=en-US&.done=https%3A%2F%2Fwww.yahoo.com");
		WebElement i1= d1.findElement(By.xpath("//label[@for='persistent']"));
		i1.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		i1.click();

	}

}
