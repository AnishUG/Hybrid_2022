package com.base;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.utility.PropertiesUtil;

public class BaseClass {

	public static WebDriver driver = null;

	public static Logger log = Logger.getLogger(BaseClass.class);

	public static void Initilization() throws Exception {
		System.out.println("Reading a property file for browser");
		log.info("Reading a property file for browser");

		String br_name = PropertiesUtil.readproperty("Browser");
		
		if (br_name.equals("chrome")) {

		System.setProperty("Webdriver.chrome.driver", "chromedriver.exe");

		driver = new ChromeDriver();


	}
		
		if (br_name.equals("firefox")) {
			
			System.setProperty("Webdriver.gecko.driver", "D:/firefox.exe");

			driver = new ChromeDriver();
			
		}
		
		driver.get(PropertiesUtil.readproperty("URL"));

		driver.manage().window().maximize();
		
	}

}
