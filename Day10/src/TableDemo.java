import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class TableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		WebDriver d1= new FirefoxDriver();
		d1.get("http://www.newtours.demoaut.com");
		
	WebElement table = d1.findElement(By.xpath("//table[@width=\"270\"]/tbody/tr[3]/td[1]"));
		
	System.out.println("One of the text in table is"+table.getText());
	
	WebElement table1 = d1.findElement(By.xpath("//table[@width=\"270\"]/tbody/tr[1]/td[2]"));
	System.out.println("cost is:" +table1.getText());
	}

}
