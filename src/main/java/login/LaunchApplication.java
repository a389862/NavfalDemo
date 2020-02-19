package login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchApplication {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/selectable/");
        driver.manage().window().maximize();
        //changed implicitly wait to 30 secs
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

}
