
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class OpenFFBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "E:/geckodriver-v0.10.0-win64/geckodriver.exe");
		
		/*DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("marionette", true);
		WebDriver driver = new MarionetteDriver(capabilities); //for selenium 3 use new FirefoxDriver(capabilities);
*/		
		
WebDriver d1= new FirefoxDriver();

d1.get("http://www.google.com");

d1.close();


	}

}
