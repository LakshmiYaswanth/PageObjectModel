package com.revature.pageObjModel.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {
	WebDriver driver;
	WebElement element;
	By clicklogin=By.id("nav-link-accountList");
	By userId=By.id("ap_email");
	By clickContinue=By.id("continue");
	By password=By.id("ap_password");
	By submit=By.id("signInSubmit");
	public Login(WebDriver driver) {
    	this.driver=driver;
  	
    }
	public void userlogin(String string,String pass) {
		element= driver.findElement(clicklogin);
	    element.click();
	    driver.findElement(userId).sendKeys(string);
	    element = driver.findElement(clickContinue);
	    element.click();
	    driver.findElement(password).sendKeys(pass);
	    element= driver.findElement(By.id("signInSubmit"));
	    element.click();
	}
	
}
