package basicJava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testing {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Applications/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.wellsfargo.com");
		driver.manage().window().maximize();
	}

}
