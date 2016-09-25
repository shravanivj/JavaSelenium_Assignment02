import java.awt.Desktop.Action;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class MultiSelectDemo {

	public static void main(String[] args) {
		// To multiselct from list
		
		System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
	
		
		WebDriver d1= new FirefoxDriver();
		//d1.manage().window().maximize();
		d1.get("http://demos.devexpress.com/ASPxeditorsdemos/Listeditors/MultiSelect.aspx");
		
		d1.findElement(By.xpath(".//*[@id='ContentHolder_lbSelectionMode_I']")).click();
		//d1.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);

		System.out.println("waiting for 10s");
		try {
			Thread.sleep(5000);
			System.out.println("waited for 10s");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 d1.findElement(By.xpath(".//*[@id='ContentHolder_lbSelectionMode_DDD_L_LBI0T0']")).click();
	 
	 WebElement select = d1.findElement(By.xpath(".//*[@id='ContentHolder_lbFeatures_D']"));
	 
	
	 List<WebElement> options = select.findElements(By.tagName("td"));
	System.out.println(options.get(0));
	/*for(int i=0; i<options.size(); i++){
		
		String tablelist = options.get(i).getText();
		System.out.println(tablelist);
		//System.out.println("print options"+options.get(i).getText());
		
	}
	
	/*Actions builder = new Actions(d1);
	
	org.openqa.selenium.interactions.Action multselect = builder.keyDown(Keys.CONTROL)
			                                             .click(options.get(3))
			                                             .click(options.get(5))
			                                             .click(options.get(7))
			                                             .build();
	multselect.perform();
/*Action multiselct = builder.keyDown(Keys.CONTROL)
                   .click(options.get(3))
                   .click(options.get(5))
                   .click(options.get(7))
                   .build();	
	*/

	}

}
