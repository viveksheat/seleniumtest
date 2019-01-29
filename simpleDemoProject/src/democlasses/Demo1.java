package democlasses;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args)
{
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium driver\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com");

	}

}
