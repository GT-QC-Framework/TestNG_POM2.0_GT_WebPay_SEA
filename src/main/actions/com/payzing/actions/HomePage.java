package com.payzing.actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.payzing.ui.HomePageUI;

import Common.commonFunction;

public class HomePage extends commonFunction {

	public String ServerGroup;
	public String Server;

	public HomePage(WebDriver driver) {
		super(driver);

	}

	@FindBy(xpath = "//span[contains(text(),'Chọn cụm máy chủ')]/parent::button")
	WebElement DROPDOWN_CUMMAYCHU;

	@FindBy(xpath = "//span[contains(text(),'Chọn máy chủ')]/parent::button")
	WebElement DROPDOWN_MAYCHU;

	@FindBy(xpath = "//span[contains(text(),'%s')]/parent::li")
	public static WebElement LIST_ITEM_CUMMAYCHU;

	@FindBy(xpath = "//span[contains(text(),'%s')]/parent::li")
	public static WebElement LIST_ITEM_MAYCHU;

	@FindBy(xpath = "//span[contains(text(),'%s')]/parent::li")
	public static WebElement LIST_ITEM_NHANVAT;

	@FindBy(id = "authBtnSubmit")
	WebElement BTT_XACNHAN;

	@FindBy(id = "popupProductConfirm")
	WebElement POPUP_XACNHAN_PACKAGE;

	@FindBy(id = "wallet")
	WebElement METHOD_E_WALLET;

	@FindBy(id = "molthmpay")
	WebElement METHOD_E_WALLET_mPAY;

	@FindBy(id = "molthtruewallet")
	WebElement METHOD_E_WALLET_TRUE_MONEY;

	@FindBy(id = "molthlinepay")
	WebElement METHOD_E_WALLET_LINE_PAY;

	@FindBy(id = "btnSubmitPaymentElementwallet")
	WebElement METHOD_E_WALLET_BTT_XACNHAN;

	@FindBy(name = "phonenumber")
	WebElement METHOD_E_WALLET_TRUE_MONEY_TXT_SDT;

	@FindBy(id = "walletauth")
	WebElement METHOD_E_WALLET_TRUE_MONEY_BTT_GUI_OTP;

	@FindBy(xpath = "//font[contains(@color,'red')]")
	WebElement METHOD_E_WALLET_TRUE_MONEY_ERROR_MESSAGE;
	
	@FindBy(name="mobileNo")
	WebElement METHOD_E_WALLET_mPAY_TXT_SDT;
	
	@FindBy(name="ok")
	WebElement METHOD_E_WALLET_mPAY_BTT_GUI;
	
	@FindBy(id="bank")
	WebElement METHOD_BANK;
	
	@FindBy(id="molthscb")
	WebElement METHOD_BANK_SCB;
	
	@FindBy(id="molthktb")
	WebElement METHOD_BANK_KTB;
	
	@FindBy(id="molthbay")
	WebElement METHOD_BANK_BAY;
	
	@FindBy(id="molthbbl")
	WebElement METHOD_BANK_BBL;
	
	@FindBy(id="btnSubmitPaymentElementbank")
	WebElement METHOD_BANK_BTT_XACNHAN;
	
	@FindBy(id="cancelBtn")
	WebElement METHOD_BANK_SCB_BTT_CANCEL_1;
	
	@FindBy(id="btnBack")
	WebElement METHOD_BANK_SCB_BTT_CANCEL_2;
	
	@FindBy(id="txtResult")
	WebElement RESULT_STATUS;
	
	@FindBy(id="txtPaymentID")
	WebElement RESULT_ID;
	
	@FindBy(xpath="//span[contains(@data-bind,'gtCore.mess.ContinutePayment')]")
	WebElement RESULT_BTT_TIEPTUCTHANHTOAN;
	
	
//	@FindBy()
//	WebElement
//	
//	@FindBy()
//	WebElement
//	
//	@FindBy()
//	WebElement
//	
//	@FindBy()
//	WebElement
//	
//	@FindBy()
//	WebElement
//	
//	@FindBy()
//	WebElement
//	
//	@FindBy()
//	WebElement
//	
//	@FindBy()
//	WebElement
//	
//	@FindBy()
//	WebElement
//	
//	@FindBy()
//	WebElement

	public void clickDropDown_CumMayChu(WebElement ele) {
		waitVisible_Locator(HomePageUI.DROPDOWN_CUMMAYCHU);
		ele.click();
	}

	public void selectDropdown_CumMayChu(WebElement ele, String locator) {
		waitVisible_Locator(locator);
		selectCombobox_Special(ele, locator);
	}

	//
	public void clickDropDown_MayChu(WebElement ele) {
		waitVisible_Locator(HomePageUI.DROPDOWN_MAYCHU);
		ele.click();
	}

	public void selectDropdown_MayChu(WebElement ele, String locator) {
		waitVisible_Locator(locator);
		selectCombobox_Special(ele, locator);
	}

	//
	public void clickDropDown_NhanVat(WebElement ele) {
		ele.click();
	}

	public void selectDropdown_NhanVat(WebElement ele, String locator) {
		waitVisible_Locator(locator);
		selectCombobox_Special(ele, locator);
	}

	public void clickBTT_XacNhan() {
		waitVisible(BTT_XACNHAN);
		clickElement(BTT_XACNHAN);
	}

	public void clickXacNhan_ChonPack() {
		waitVisible(POPUP_XACNHAN_PACKAGE);
		clickElement(POPUP_XACNHAN_PACKAGE);
	}

	public void clickMETHOD_E_WALLET() {
		waitVisible(METHOD_E_WALLET);
		clickElement(METHOD_E_WALLET);
	}

	public void clickMETHOD_E_WALLET_mPAY() throws InterruptedException {
		waitVisible(METHOD_E_WALLET_mPAY);
		Thread.sleep(500);
		clickElement(METHOD_E_WALLET_mPAY);
	}

	public void clickMETHOD_E_WALLET_TRUE_MONEY() throws InterruptedException {
		waitVisible(METHOD_E_WALLET_TRUE_MONEY);
		Thread.sleep(500);
		clickElement(METHOD_E_WALLET_TRUE_MONEY);
	}

	public void clickMETHOD_E_WALLET_LINE_PAY() throws InterruptedException {
		waitVisible(METHOD_E_WALLET_LINE_PAY);
		Thread.sleep(500);
		clickElement(METHOD_E_WALLET_LINE_PAY);
	}

	public void clickMETHOD_E_WALLET_BTT_XACNHAN() throws InterruptedException {
		waitVisible(METHOD_E_WALLET_BTT_XACNHAN);
		Thread.sleep(500);
		clickElement(METHOD_E_WALLET_BTT_XACNHAN);
	}

	public void inputMETHOD_E_WALLET_TRUE_MONEY_TXT_SDT(String value) throws InterruptedException {
		waitVisible(METHOD_E_WALLET_TRUE_MONEY_TXT_SDT);
		clear(METHOD_E_WALLET_TRUE_MONEY_TXT_SDT);
		input(METHOD_E_WALLET_TRUE_MONEY_TXT_SDT, value);
	}

	public void clickMETHOD_E_WALLET_TRUE_MONEY_BTT_GUI_OTP() throws InterruptedException {
		waitVisible(METHOD_E_WALLET_TRUE_MONEY_BTT_GUI_OTP);
		Thread.sleep(1000);
		clickElement(METHOD_E_WALLET_TRUE_MONEY_BTT_GUI_OTP);
	}

	public String getText_METHOD_E_WALLET_TRUE_MONEY_ERROR_MESSAGE() {
		waitVisible(METHOD_E_WALLET_TRUE_MONEY_ERROR_MESSAGE);
		return getText(METHOD_E_WALLET_TRUE_MONEY_ERROR_MESSAGE);
	}
	
	public void inputMETHOD_E_WALLET_mPAY_TXT_SDT(String value) throws InterruptedException
	{
		waitVisible(METHOD_E_WALLET_mPAY_TXT_SDT);
		Thread.sleep(500);
		input(METHOD_E_WALLET_mPAY_TXT_SDT, value);
	}
	
	public void clickMETHOD_E_WALLET_mPAY_BTT_GUI() throws InterruptedException
	{
		waitVisible(METHOD_E_WALLET_mPAY_BTT_GUI);
		Thread.sleep(500);
		clickElement(METHOD_E_WALLET_mPAY_BTT_GUI);
	}
	
	public void clickMETHOD_BANK()
	{
		waitVisible(METHOD_BANK);
		clickElement(METHOD_BANK);
	}
	
	public void clickMETHOD_BANK_SCB() throws InterruptedException
	{
		waitVisible(METHOD_BANK_SCB);
		Thread.sleep(500);
		clickElement(METHOD_BANK_SCB);
	}
	
	public void clickMETHOD_BANK_KTB() throws InterruptedException
	{
		waitVisible(METHOD_BANK_KTB);
		Thread.sleep(500);
		clickElement(METHOD_BANK_KTB);
	}
	
	public void clickMETHOD_BANK_BAY() throws InterruptedException
	{
		waitVisible(METHOD_BANK_BAY);
		Thread.sleep(500);
		clickElement(METHOD_BANK_BAY);
	}
	
	public void clickMETHOD_BANK_BBL() throws InterruptedException
	{
		waitVisible(METHOD_BANK_BBL);
		Thread.sleep(500);
		clickElement(METHOD_BANK_BBL);
	}
	
	public void clickMETHOD_BANK_BTT_XACNHAN() throws InterruptedException
	{
		waitVisible(METHOD_BANK_BTT_XACNHAN);
		Thread.sleep(1000);
		clickElement(METHOD_BANK_BTT_XACNHAN);
	}
	
	public void clickMETHOD_BANK_SCB_BTT_CANCEL_1() throws InterruptedException
	{
		waitVisible(METHOD_BANK_SCB_BTT_CANCEL_1);
		Thread.sleep(500);
		clickElement(METHOD_BANK_SCB_BTT_CANCEL_1);
	}
	
	public void clickMETHOD_BANK_SCB_BTT_CANCEL_2() throws InterruptedException
	{
		waitVisible(METHOD_BANK_SCB_BTT_CANCEL_2);
		Thread.sleep(500);
		clickElement(METHOD_BANK_SCB_BTT_CANCEL_2);
	}
	
	public String getTextRESULT_STATUS()
	{
		waitVisible(RESULT_STATUS);
		return getText(RESULT_STATUS);
	}
	
	public String getTextRESULT_ID()
	{
		waitVisible(RESULT_ID);
		return getText(RESULT_ID);
	}
	
	public void clickRESULT_BTT_TIEPTUCTHANHTOAN() throws InterruptedException
	{
		waitVisible(RESULT_BTT_TIEPTUCTHANHTOAN);
		Thread.sleep(500);
		clickElement(RESULT_BTT_TIEPTUCTHANHTOAN);
	}
	
	
	

}
