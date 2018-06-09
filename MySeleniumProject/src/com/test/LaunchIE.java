package com.test;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class LaunchIE {

	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver", "./drivers/IEDriverServer.exe");
		InternetExplorerDriver driver=new InternetExplorerDriver();

		driver.get("http://cricbuzz.com");
		
		//driver.close();
		driver.quit();
	}

}
