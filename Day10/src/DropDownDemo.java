import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class DropDownDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		WebDriver d1= new FirefoxDriver();
		d1.get("http://www.calculator.net/interest-calculator.html");
	WebElement dropDown = d1.findElement(By.xpath("//select[@id='ccompound']"));
	
	Select dropDown1 = new Select(d1.findElement(By.xpath("//select[@id='ccompound']")));
	
	dropDown1.selectByIndex(2);
	//dropDown1.selectByValue("monthly");
	System.out.println("The output for isDipslayed is"+dropDown.isDisplayed());
	System.out.println("The output for isEnabled is"+dropDown.isEnabled());
	System.out.println("The output for isSelected is"+dropDown.isSelected());
	}

}
