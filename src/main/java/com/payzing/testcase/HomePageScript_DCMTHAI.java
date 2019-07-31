package com.payzing.testcase;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.payzing.actions.HomePage;
import com.payzing.actions.LogInPage;
import com.payzing.ui.HomePageUI;

import Common.CommonTestcase;

public class HomePageScript_DCMTHAI extends CommonTestcase {

	WebDriver driver;

	LogInPage loginPage;

	HomePage homePage;

	@Parameters({ "browser", "version", "url" })

	@BeforeClass

	public void beforeClass(String browser, String version, String url) throws InterruptedException {

		inititalReport("Nhutbm_Webpay_Game_DCM_Thai.html");

		driver = openMultiBrowser(browser, version, url);

		loginPage = PageFactory.initElements(driver, LogInPage.class);

		loginPage.openUrl("https:/zpay.mobi");

		loginPage.clickDYNAMIC_GAME("dcmthai");

		Thread.sleep(1000);

		loginPage.clickICON_EMAIL();

		loginPage.inputLOGIN_BY_EMAIL_USERNAME_TXT("nhutne555@gmail.com");

		loginPage.inputLOGIN_BY_EMAIL_PASSWORD_TXT("Aa123456!");

		homePage = loginPage.clickBTT_DangNhap();

		Thread.sleep(2000);

//		verifyEqual(homePage.getText_Title_Game(), "Võ Lâm Truyền Kỳ Mobile");

		// get all Selector
		List<WebElement> list = driver.findElements(By.xpath("//div[contains(@class,'am-selected am-dropdown')]"));
		WebElement eleCumMayChu = null;
		WebElement eleMayChu = null;
		WebElement eleNhanVat = null;

		if (list.size() == 3) {
			eleCumMayChu = list.get(0);
			eleMayChu = list.get(1);
			eleNhanVat = list.get(2);
		} else if (list.size() == 2) {
			eleMayChu = list.get(0);
			eleNhanVat = list.get(1);
		} else {
			eleNhanVat = list.get(0);
		}

		if (eleCumMayChu != null) {
			homePage.clickDropDown_CumMayChu(eleCumMayChu);
			Thread.sleep(500);
			String locator = String.format(HomePageUI.LIST_ITEM_CUMMAYCHU, "Cụm máy chủ 1 - 10");
			homePage.selectDropdown_CumMayChu(eleCumMayChu, locator);
		}

		Thread.sleep(1000);

		if (eleMayChu != null) {
			homePage.clickDropDown_MayChu(eleMayChu);
			Thread.sleep(500);
			String locator = String.format(HomePageUI.LIST_ITEM_MAYCHU, "Server1");
			homePage.selectDropdown_MayChu(eleMayChu, locator);
		}

		Thread.sleep(2000);

		if (eleNhanVat != null) {

			homePage.clickDropDown_NhanVat(eleNhanVat);
			Thread.sleep(500);
			String locator = String.format(HomePageUI.LIST_ITEM_NHANVAT, "GiinPNow555");
			homePage.selectDropdown_NhanVat(eleNhanVat, locator);

		}

		Thread.sleep(2000);

		homePage.clickBTT_XacNhan();

	}

	@BeforeMethod

	public void beforeMethod() throws InterruptedException {

		homePage.openUrl("https://zpay.mobi/rmsth/#/pay");
		
		Thread.sleep(1000);

		List<WebElement> listPkg = driver.findElements(By.xpath("//div[contains(@class,'am-gallery-item')]//input"));

		List<String> lstPkgId = new ArrayList();
		for (WebElement elementList : listPkg) {
			String idPkg = elementList.getAttribute("id");
			if (idPkg != null) {
				lstPkgId.add(idPkg);
			}
		}

		Random rand = new Random();

		Long limitPrice = Long.valueOf(0);

		int rndPkgId;
		do {

			rndPkgId = rand.nextInt(lstPkgId.size());
			String dataInput = driver.findElement(By.xpath("//input[@id='" + lstPkgId.get(rndPkgId) + "']"))
					.getAttribute("data-price");
			if (dataInput != null && dataInput != "") {
				limitPrice = Long.valueOf(dataInput);
			}
		} while (limitPrice < 0);// ngc lai so can

//		System.out.println(limitPrice + " - " + lstPkgId.get(rndPkgId));

		homePage.click("//img[@id='img" + lstPkgId.get(rndPkgId).substring(4) + "']");

		Thread.sleep(1000);

		homePage.clickXacNhan_ChonPack();

		Thread.sleep(2000);
	}

//	@Test
//	public void testcase01_Verify_select_True_Money_in_EWallet() throws InterruptedException {
//		logTestCase("EWallet: Select true money");
//		homePage.clickMETHOD_E_WALLET();
//		homePage.clickMETHOD_E_WALLET_TRUE_MONEY();
//		homePage.clickMETHOD_E_WALLET_BTT_XACNHAN();
//		Thread.sleep(4000);
//		verifyEqual(homePage.getTitle(), "Secured Payment by truemoney");
//		homePage.inputMETHOD_E_WALLET_TRUE_MONEY_TXT_SDT("0921811639");
//		homePage.clickMETHOD_E_WALLET_TRUE_MONEY_BTT_GUI_OTP();
//		verifyEqual(homePage.getText_METHOD_E_WALLET_TRUE_MONEY_ERROR_MESSAGE(), "Tmn account does not exist.");
//	}
//	@Test
//	public void testcase02_Verify_select_m_Pay_in_EWallet() throws InterruptedException {
//		logTestCase("EWallet: Select mPay");
//		homePage.clickMETHOD_E_WALLET();
//		homePage.clickMETHOD_E_WALLET_mPAY();
//		homePage.clickMETHOD_E_WALLET_BTT_XACNHAN();
//		Thread.sleep(4000);
//		verifyEqual(homePage.getTitle(), "mPAY");
//		homePage.inputMETHOD_E_WALLET_mPAY_TXT_SDT("0921811639");
//		homePage.clickMETHOD_E_WALLET_mPAY_BTT_GUI();
//		Thread.sleep(2000);
//		homePage.acceptAlert();
//	}
	@Test
	public void testcase03_Verify_select_LINE_Pay_in_EWallet() throws InterruptedException {
		logTestCase("EWallet: Select LINE Pay");
		homePage.clickMETHOD_E_WALLET();
		homePage.clickMETHOD_E_WALLET_LINE_PAY();
		homePage.clickMETHOD_E_WALLET_BTT_XACNHAN();
	}
	@Test
	public void testcase04_Select_SCB_in_Bank() throws InterruptedException {
		logTestCase("Bank: Verify display transactionID when cancel payment");
		homePage.clickMETHOD_BANK();
		homePage.clickMETHOD_BANK_SCB();
		homePage.clickMETHOD_BANK_BTT_XACNHAN();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		verifyEqual(homePage.getTitle(), "DD Easy Net Login WebPay");
		homePage.clickMETHOD_BANK_SCB_BTT_CANCEL_1();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		homePage.clickMETHOD_BANK_SCB_BTT_CANCEL_2();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		List<WebElement> listKTKQGD = driver.findElements(By.xpath("//span[contains(text(),'ตรวจสอบผลการชำระเงิน')]"));
		listKTKQGD.get(1).click();
		System.out.println("Trang thai giao dich SCB: "+homePage.getTextRESULT_STATUS());
		System.out.println("Ma giao dich SCB: "+homePage.getTextRESULT_ID());
		homePage.clickRESULT_BTT_TIEPTUCTHANHTOAN();
	}
	
	
	
	
	@AfterMethod
	public void afterMethod(ITestResult result) {
		getResult(result);

	}

	@AfterClass
	public void afterClass() {
		exportReport();
//		driver.quit();
	}

}
