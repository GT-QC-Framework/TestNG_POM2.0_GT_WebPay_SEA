package com.payzing.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Common.commonFunction;

public class CommonPage extends commonFunction {

	public CommonPage(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = "//*[contains(@src,'%s')]")
	public WebElement DYNAMICPATH;

}
