package com.test;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefox {

	public static void main(String[] args) {
		//opening the browser
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		
		//to enter the url
		driver.get("http://www.google.com");
		
		//to close the browser
		//driver.close();
		driver.quit();

	}

}
