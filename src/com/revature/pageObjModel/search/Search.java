package com.revature.pageObjModel.search;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Search {
	WebDriver driver;
	WebElement element;
	By Typename = By.name("q");
	By Button = By.name("btnK");
	By Select = By.xpath("//span[contains(text(),'Amazon.in')]");

	public Search(WebDriver driver) {
		this.driver = driver;

	}
	public void TypeinSearchField(String name) {
		driver.findElement(Typename).sendKeys(name);
		element = driver.findElement(Button);
		element.submit();
		element = driver.findElement(Select);
		element.click();
	}

}
