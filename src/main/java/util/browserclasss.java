package util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browserclasss {
	static WebDriver driver;
	public static WebDriver launchingbrowser2() {
		// launching chromebrowser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\budap\\eclipse-workspace\\Spring2020selenium\\ProjectAutamationPraticalJunit\\driver\\chromedriver.exe");
		// create chromedriver object
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		// launch website
		driver.get("http://techfios.com/test/101/");
		System.out.println(driver.getCurrentUrl());
		return driver;
}
}
