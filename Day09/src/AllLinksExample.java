import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AllLinksExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		WebDriver d1= new FirefoxDriver();

		d1.get("http://bbc.com");
		List<WebElement> allPopularLinks = d1.findElements(By.xpath(ObjectRepository.alllinks_BBC));
		
		for(int i=0; i< allPopularLinks.size(); i++){
			
			
			String linkText = allPopularLinks.get(i).getText();
			System.out.println(" The Text in the link is: "+ linkText);
		}
	}

}
