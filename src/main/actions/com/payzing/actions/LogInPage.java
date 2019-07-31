package com.payzing.actions;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Common.commonFunction;

public class LogInPage extends commonFunction {

	public LogInPage(WebDriver driver) {
		super(driver);
	}

//	@FindBy(xpath="//img[contains(@src,'dcmthai')]")
//	WebElement ICON_DCM_THAI;
//	
//	@FindBy(xpath="//img[contains(@src,'cfmobile')]")
//	WebElement ICON_CFMOBILE_THAI;
//	
//	@FindBy(xpath="//img[contains(@src,'rosthai')]")
//	WebElement ICON_ROS_THAI ;
//	
//	@FindBy(xpath="//img[contains(@src,'rospcthai')]")
//	WebElement ICON_ROSPC_THAI;
//	
//	@FindBy(xpath="//img[contains(@src,'omgthai')]")
//	WebElement ICON_OMG_THAI;

	@FindBy(id = "facebook")
	List<WebElement> LOGIN_BY_FACEBOOK;

	@FindBy(id = "facebook")
	WebElement ICON_FACEBOOK;

	@FindBy(id = "email")
	List<WebElement> LOGIN_BY_EMAIL;

	@FindBy(id = "email")
	WebElement ICON_EMAIL;

	@FindBy(id = "google")
	List<WebElement> LOGIN_BY_GOOGLE;

	@FindBy(id = "google")
	WebElement ICON_GOOGLE;

	@FindBy(id = "zing")
	List<WebElement> LOGIN_BY_ZINGID;

	@FindBy(id = "zing")
	WebElement ICON_ZINGID;
	
	@FindBy(id = "zalo")
	List<WebElement> LOGIN_BY_ZALO;

	@FindBy(id = "zalo")
	WebElement ICON_ZALO;

	@FindBy(id = "u")
	WebElement LOGIN_BY_ZINGID_USERNAME_TXT;

	@FindBy(id = "p")
	WebElement LOGIN_BY_ZINGID_PASSWORD_TXT;

	@FindBy(id = "login-btn")
	WebElement LOGIN_BY_ZINGID_BTT_DANGNHAP;

	@FindBy(id = "back-btn")
	WebElement LOGIN_BY_ZINGID_BTT_QUAYVE;

	@FindBy(id = "message")
	WebElement LOGIN_BY_ZINGID_ERROR_MESSAGE;

	@FindBy(xpath = "//div[@id='popupAlertError']//span[contains(@data-bind,'text: WP.alertMessage()')]")
	WebElement LOGIN_BY_ZINGID_BTT_QUAYVE_POPUP_MESSAGE;

	@FindBy(xpath = "//div[@id='popupAlertError']//span[contains(@data-bind,'OK')]")
	WebElement LOGIN_BY_ZINGID_BTT_QUAYVE_POPUP_BTT_OK;
	
	@FindBy(xpath="//span[contains(@data-bind,'mess.Logout')]")
	WebElement LOGIN_BY_ZINGID_SUCCESS_BTT_LOGOUT;

	@FindBy(id = "e")
	WebElement LOGIN_BY_EMAIL_USERNAME_TXT;

	@FindBy(id = "p")
	WebElement LOGIN_BY_EMAIL_PASSWORD_TXT;

	@FindBy(id = "login-btn")
	WebElement LOGIN_BY_EMAIL_SUBMIT_BTT;

	@FindBy(id = "back-btn")
	WebElement LOGIN_BY_EMAIL_BACK_BTT;

	@FindBy(xpath = "//div[@id='popupAlertError']//span[contains(@data-bind,'alertMessage')]")
	WebElement LOGIN_BY_EMAIL_BACK_BTT_POPUP_MESSAGE;

	@FindBy(xpath = "//div[@id='popupAlertError']//span[contains(@data-bind,'OK')]")
	WebElement LOGIN_BY_EMAIL_BACK_BTT_POPUP_BTT_OK;

	@FindBy(id = "message")
	WebElement LOGIN_BY_EMAIL_ERROR_MESSAGE;

	@FindBy(xpath = "//span[contains(@data-bind,'mess.Logout')]")
	WebElement LOGIN_BY_EMAIL_SUCCESS_BTT_LOGOUT;
	
	@FindBy(xpath="//button[@type='button']")
	WebElement LOGIN_BY_ROLE_DROPDOWN_CUMMAYCHU;
	
	@FindBy(id="authTxtRoleInfo")
	WebElement LOGIN_BY_ROLE_TXT_TENNHANVAT;
	
	@FindBy(id="authBtnSubmit")
	WebElement LOGIN_BY_ROLE_BTT_DANGNHAP;
	
	@FindBy(id="authTextErrMessage")
	WebElement LOGIN_BY_ROLE_MSG_ERROR;
	
	@FindBy(xpath="//label[contains(@data-bind,'LoginByRoleid')]")
	WebElement LOGIN_BY_ROLE_OPTION_ROLE_ID;
	
	@FindBy(xpath="//div[@id='authConfirmRoleInfo']//span[contains(@data-bind,'mess.Submit')]")
	WebElement LOGIN_BY_ROLE_POPUP_BTT_ACCEPT;
	
	@FindBy(xpath="//div[@id='authConfirmRoleInfo']//span[contains(@data-bind,'mess.Cancel')]")
	WebElement LOGIN_BY_ROLE_POPUP_BTT_CANCEL;
	
	
	//
	
	public void clickLOGIN_BY_ROLE_DROPDOWN_MAYCHU()
	{
		waitVisible(LOGIN_BY_ROLE_DROPDOWN_CUMMAYCHU);
		clickElement(LOGIN_BY_ROLE_DROPDOWN_CUMMAYCHU);
	}
	public void clickLOGIN_BY_ROLE_DROPDOWN_MAYCHU_OPTION(String dynamic)
	{
		clickDynamic_Dropdown_Option(dynamic);
	}
	
	public void clickDYNAMIC_GAME(String dynamic) {
		waitVisibleDynamicXpath(dynamic);
		clickDynamicXpath(dynamic);
	}
	public HomePage clickBTT_DangNhap() {
		waitVisible(LOGIN_BY_EMAIL_SUBMIT_BTT);
		clickElement(LOGIN_BY_EMAIL_SUBMIT_BTT);

		return PageFactory.initElements(driver, HomePage.class);
	}
	public void inputLOGIN_BY_EMAIL_USERNAME_TXT(String value) {
		waitVisible(LOGIN_BY_EMAIL_USERNAME_TXT);
		clear(LOGIN_BY_EMAIL_USERNAME_TXT);
		input(LOGIN_BY_EMAIL_USERNAME_TXT, value);
	}
	public void inputLOGIN_BY_EMAIL_PASSWORD_TXT(String value) {
		waitVisible(LOGIN_BY_EMAIL_PASSWORD_TXT);
		clear(LOGIN_BY_EMAIL_PASSWORD_TXT);
		input(LOGIN_BY_EMAIL_PASSWORD_TXT, value);
	}
	public void clickLOGIN_BY_EMAIL_SUBMIT_BTT() {
		waitVisible(LOGIN_BY_EMAIL_SUBMIT_BTT);
		clickElement(LOGIN_BY_EMAIL_SUBMIT_BTT);
	}

	public void clickLOGIN_BY_EMAIL_BACK_BTT() {
		waitVisible(LOGIN_BY_EMAIL_BACK_BTT);
		clickElement(LOGIN_BY_EMAIL_BACK_BTT);
	}
	public String getTextLOGIN_BY_EMAIL_BACK_BTT_POPUP_MESSAGE()
	{
		waitVisible(LOGIN_BY_EMAIL_BACK_BTT_POPUP_MESSAGE);
		return getText(LOGIN_BY_EMAIL_BACK_BTT_POPUP_MESSAGE);
	}
	
	public void clickLOGIN_BY_EMAIL_BACK_BTT_POPUP_BTT_OK()
	{
		waitVisible(LOGIN_BY_EMAIL_BACK_BTT_POPUP_BTT_OK);
		clickElement(LOGIN_BY_EMAIL_BACK_BTT_POPUP_BTT_OK);
	}

	public void clickICON_FACEBOOK() {
		if (checkLocatorDisplay(LOGIN_BY_FACEBOOK)) {
			waitVisible(ICON_FACEBOOK);
			clickElement(ICON_FACEBOOK);
		}
	}

	public void clickICON_EMAIL() {
		if (checkLocatorDisplay(LOGIN_BY_EMAIL)) {
			waitVisible(ICON_EMAIL);
			clickElement(ICON_EMAIL);
		}
	}
	public void clickICON_GOOGLE() {
		if (checkLocatorDisplay(LOGIN_BY_GOOGLE)) {
			waitVisible(ICON_GOOGLE);
			clickElement(ICON_GOOGLE);
		}
	}
	public void clickICON_ZINGID() {
		if (checkLocatorDisplay(LOGIN_BY_ZINGID)) {
			waitVisible(ICON_ZINGID);
			clickElement(ICON_ZINGID);
		}
	}
	public void clickICON_ZALO() {
		if (checkLocatorDisplay(LOGIN_BY_ZALO)) {
			waitVisible(ICON_ZALO);
			clickElement(ICON_ZALO);
		}
	}
	public String getTextLOGIN_BY_EMAIL_ERROR_MESSAGE() {
		waitVisible(LOGIN_BY_EMAIL_ERROR_MESSAGE);
		return getText(LOGIN_BY_EMAIL_ERROR_MESSAGE);
	}
	public void clickLOGIN_BY_EMAIL_SUCCESS_BTT_LOGOUT() {
		waitVisible(LOGIN_BY_EMAIL_SUCCESS_BTT_LOGOUT);
		clickElement(LOGIN_BY_EMAIL_SUCCESS_BTT_LOGOUT);
	}
	public void inputLOGIN_BY_ZINGID_USERNAME_TXT(String value) {
		waitVisible(LOGIN_BY_ZINGID_USERNAME_TXT);
		clear(LOGIN_BY_ZINGID_USERNAME_TXT);
		input(LOGIN_BY_ZINGID_USERNAME_TXT, value);
	}

	public void inputLOGIN_BY_ZINGID_PASSWORD_TXT(String value) {
		waitVisible(LOGIN_BY_ZINGID_PASSWORD_TXT);
		clear(LOGIN_BY_ZINGID_PASSWORD_TXT);
		input(LOGIN_BY_ZINGID_PASSWORD_TXT, value);
	}

	public void clickLOGIN_BY_ZINGID_BTT_DANGNHAP() {
		waitVisible(LOGIN_BY_ZINGID_BTT_DANGNHAP);
		clickElement(LOGIN_BY_ZINGID_BTT_DANGNHAP);
	}
	public void clickLOGIN_BY_ZINGID_BTT_QUAYVE()
	{
		waitVisible(LOGIN_BY_ZINGID_BTT_QUAYVE);
		clickElement(LOGIN_BY_ZINGID_BTT_QUAYVE);
	}
	public String getTextLOGIN_BY_ZINGID_BTT_QUAYVE_POPUP_MESSAGE()
	{
		waitVisible(LOGIN_BY_ZINGID_BTT_QUAYVE_POPUP_MESSAGE);
		return getText(LOGIN_BY_ZINGID_BTT_QUAYVE_POPUP_MESSAGE);
	}
	public void clickLOGIN_BY_ZINGID_BTT_QUAYVE_POPUP_BTT_OK()
	{
		waitVisible(LOGIN_BY_ZINGID_BTT_QUAYVE_POPUP_BTT_OK);
		clickElement(LOGIN_BY_ZINGID_BTT_QUAYVE_POPUP_BTT_OK);
	}
	
	public void clickLOGIN_BY_ZINGID_SUCCESS_BTT_LOGOUT()
	{
		waitVisible(LOGIN_BY_ZINGID_SUCCESS_BTT_LOGOUT);
		clickElement(LOGIN_BY_ZINGID_SUCCESS_BTT_LOGOUT);
	}
	public void inputLOGIN_BY_ROLE_TXT_TENNHANVAT(String value)
	{
		waitVisible(LOGIN_BY_ROLE_TXT_TENNHANVAT);
		clear(LOGIN_BY_ROLE_TXT_TENNHANVAT);
		input(LOGIN_BY_ROLE_TXT_TENNHANVAT, value);
	}
	public void clickLOGIN_BY_ROLE_BTT_DANGNHAP()
	{
		waitVisible(LOGIN_BY_ROLE_BTT_DANGNHAP);
		clickElement(LOGIN_BY_ROLE_BTT_DANGNHAP);
	}
	public String getTextLOGIN_BY_ROLE_MSG_ERROR()
	{
		waitVisible(LOGIN_BY_ROLE_MSG_ERROR);
		return getText(LOGIN_BY_ROLE_MSG_ERROR);
	}
	public void clickLOGIN_BY_ROLE_OPTION_ROLE_ID()
	{
		waitVisible(LOGIN_BY_ROLE_OPTION_ROLE_ID);
		clickElement(LOGIN_BY_ROLE_OPTION_ROLE_ID);
	}
	
	public void clickLOGIN_BY_ROLE_POPUP_BTT_CANCEL()
	{
		waitVisible(LOGIN_BY_ROLE_POPUP_BTT_CANCEL);
		clickElement(LOGIN_BY_ROLE_POPUP_BTT_CANCEL);
	}
	
	public void clickLOGIN_BY_ROLE_POPUP_BTT_ACCEPT()
	{
		waitVisible(LOGIN_BY_ROLE_POPUP_BTT_ACCEPT);
		clickElement(LOGIN_BY_ROLE_POPUP_BTT_ACCEPT);
	}
	
}
