package login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchApplication {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        //URL Changed
        driver.get("http://leaftaps.com/opentaps/control/main");
        driver.manage().window().maximize();
        //changed implicitly wait to 30 secs
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

}
