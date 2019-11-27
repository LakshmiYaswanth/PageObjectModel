package com.revature.pageObjModel.Tests;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.revature.pageObjModel.ConnectionUtill.ChromeConnection;
import com.revature.pageObjModel.pom.Login;
import com.revature.pageObjModel.search.Search;

public class TestPageModel {
	ChromeConnection chrome= new ChromeConnection(); ;
	Search search;
	WebDriver driver;

	@Test
	public void ConnectionTest() {
		driver=chrome.getChromeConnection();
		Search search =new Search(driver);
		search.TypeinSearchField("Amazon");
		Login login =new Login(driver);
		login.userlogin("yaswanthlakshmi986@gmail.com","yaswanth");
	}
}
