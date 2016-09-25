import org.openqa.selenium.ie.InternetExplorerDriver;


public class OPenIEBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.ie.driver", "E:\\IEDriverServer.exe");
		InternetExplorerDriver i1 = new InternetExplorerDriver();
		i1.get("http://www.google.com");
		i1.close();
	}

}
