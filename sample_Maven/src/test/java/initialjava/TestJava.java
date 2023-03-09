package initialjava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestJava {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chome.driver",
				"C://Users//Dell//git//sample_Maven//sample_Maven//src//test//java//initialjava//TestJava.java");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com/");
		driver.close();
		
		/*WebDriver driver;	
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\LENOVO\\Desktop\\Eclipse Work Space\\Selenium_Project\\src\\main\\resources\\chromedriver.exe");
		ChromeOptions onarg = new ChromeOptions();
		onarg.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(onarg);
		driver.get("https://www.amazon.in/");
		driver.close();*/

	}

}
