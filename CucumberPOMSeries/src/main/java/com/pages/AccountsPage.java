package com.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountsPage {

	private WebDriver driver;
	private By accountSections = By.cssSelector("div[id='center_column'] span");

	public AccountsPage(WebDriver driver) {
		this.driver = driver;
	}

	public String getAccountsPageTitle() {
		return driver.getTitle();
	}

	public int getAccountsSectionCount() {
		return driver.findElements(accountSections).size();
	}

	public List<String> getAccountsSectionsList() {

		List<String> accountsList = new ArrayList<String>();
		List<WebElement> accountHeaderList = driver.findElements(accountSections);

		for (WebElement e : accountHeaderList) {
			String text = e.getText();
			System.out.println(text);
			accountsList.add(text);
		}
		return accountsList;
	}

}
