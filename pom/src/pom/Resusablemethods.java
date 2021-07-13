package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Resusablemethods {

	public class ReusableMethods {
		public static WebDriver driver;
		public static void Launchapp()
		{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\md21239\\Downloads\\chromedriver_win32" );
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com/HotelAppBuild2/");
		}
		public static void CloseBrowser()
		{
		driver.close();
		}
	}

}
