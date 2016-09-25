import org.openqa.selenium.chrome.ChromeDriver;


public class OpenChromeBrowser {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "E:/geckodriver-v0.10.0-win64/geckodriver.exe");
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		//Opening a chrome browser
		
		ChromeDriver c1 = new ChromeDriver();
		c1.get("http://www.google.com");
		c1.close();

	}

}
