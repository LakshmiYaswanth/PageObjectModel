package com.revature.pageObjModel.ConnectionUtill;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ChromeConnection {
		WebDriver driver;
		String Driver="webdriver.chrome.driver";
		String Location="F:\\chromedriver_win32\\chromedriver.exe";
		public WebDriver getChromeConnection() {
			System.setProperty(Driver,Location);
			driver=new ChromeDriver();
		    try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("======chrome is opened========");
			driver.navigate().to("http://www.google.com/");
			return driver;
		}
	}

