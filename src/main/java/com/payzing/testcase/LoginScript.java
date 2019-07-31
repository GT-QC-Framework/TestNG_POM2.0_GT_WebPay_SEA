package com.payzing.testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.payzing.actions.LogInPage;

import Common.CommonTestcase;

public class LoginScript extends CommonTestcase {
	WebDriver driver;

	LogInPage loginPage;

	@Parameters({ "browser", "version", "url" })

	@BeforeClass

	public void beforeClass(String browser, String version, String url) {

		inititalReport("NhutBM_Webpay_TestCase_Login_Thai.html");
		driver = openMultiBrowser(browser, version, url);

		loginPage = PageFactory.initElements(driver, LogInPage.class);

	}

	@Test
	public void testcase_01_Select_DCM_THAI() throws InterruptedException {

		logTestCase("Select game DCM THAI");

		loginPage.openUrl("https://zpay.mobi");

		loginPage.clickDYNAMIC_GAME("dcmthai");

	}
	@Test
	public void testcase_02_Verify_display_method_login_By_Facebook() throws InterruptedException {
		Thread.sleep(1000);
		loginPage.clickICON_FACEBOOK();
		Thread.sleep(1000);
		loginPage.backToPage();
	}
	@Test
	public void testcase_03_Verify_display_method_Login_By_Google() throws InterruptedException {
		Thread.sleep(1000);
		loginPage.clickICON_GOOGLE();
		Thread.sleep(1000);
		loginPage.backToPage();
	}
	@Test
	public void testcase_04_Verify_display_method_Login_By_Zalo() throws InterruptedException {
		Thread.sleep(1000);
		loginPage.clickICON_ZALO();
		Thread.sleep(1000);
		loginPage.backToPage();
	}
	@Test
	public void testcase_05_Verify_display_method_Login_By_Email() throws InterruptedException {
		loginPage.clickDYNAMIC_GAME("dcmthai");
		Thread.sleep(1000);
		loginPage.clickICON_EMAIL();
		Thread.sleep(1000);
	}
	@Test
	public void testcase_06_Verify_display_message_when_click_Back() throws InterruptedException {
		loginPage.clickLOGIN_BY_EMAIL_BACK_BTT();
		Thread.sleep(1000);
//		verifyEqual(loginPage.getTextLOGIN_BY_EMAIL_BACK_BTT_POPUP_MESSAGE(), "การตรวจสอบความถูกต้องด้วย GUEST ล้มเหลว.");
//		loginPage.clickLOGIN_BY_EMAIL_BACK_BTT_POPUP_BTT_OK();
	}		
	@Test
	public void testcase_07_Verify_display_message_when_not_input_information() throws InterruptedException {
		loginPage.clickDYNAMIC_GAME("dcmthai");
		Thread.sleep(1000);
		loginPage.clickICON_EMAIL();
		Thread.sleep(1000);
		loginPage.clickLOGIN_BY_EMAIL_SUBMIT_BTT();
	}
	@Test
	public void testcase_08_Verify_display_message_when_only_input_username() throws InterruptedException {
		loginPage.inputLOGIN_BY_EMAIL_USERNAME_TXT("Wasurenaide");

		Thread.sleep(1000);

		loginPage.clickLOGIN_BY_EMAIL_SUBMIT_BTT();
	}
	@Test
	public void testcase_09_Verify_display_message_when_not_input_information() throws InterruptedException {
		loginPage.inputLOGIN_BY_EMAIL_USERNAME_TXT("");

		loginPage.inputLOGIN_BY_EMAIL_PASSWORD_TXT("Proud");

		Thread.sleep(1000);

		loginPage.clickLOGIN_BY_EMAIL_SUBMIT_BTT();
	}

	@Test
	public void testcase_10_Verify_display_message_when_input_invalid_account() throws InterruptedException {
		loginPage.inputLOGIN_BY_EMAIL_USERNAME_TXT("Love in the ice");

		loginPage.inputLOGIN_BY_EMAIL_PASSWORD_TXT("One67611176");

		Thread.sleep(1000);

		loginPage.clickLOGIN_BY_EMAIL_SUBMIT_BTT();

		verifyEqual(loginPage.getTextLOGIN_BY_EMAIL_ERROR_MESSAGE(), "Authentication failed");

	}

	@Test
	public void testcase_11_Verify_display_message_when_input_valid_account() throws InterruptedException {
		loginPage.inputLOGIN_BY_EMAIL_USERNAME_TXT("nhutne555@gmail.com");

		loginPage.inputLOGIN_BY_EMAIL_PASSWORD_TXT("Aa123456!");

		Thread.sleep(1000);

		loginPage.clickLOGIN_BY_EMAIL_SUBMIT_BTT();

		Thread.sleep(2000);

		verifyEqual(loginPage.getTitle(), "ฤทธิ์มีดสั้น M");

		Thread.sleep(1000);

		loginPage.clickLOGIN_BY_EMAIL_SUCCESS_BTT_LOGOUT();
	}

	
	@Test
	public void testcase_12_Select_DCM_THAI() throws InterruptedException {

		logTestCase("Select game MU STRONGEST THAI");

		loginPage.openUrl("https://zpay.mobi/musthai");
	}
	@Test
	public void testcase_13_Verify_display_method_login_By_Facebook() throws InterruptedException {
		Thread.sleep(1000);
		loginPage.clickICON_FACEBOOK();
		Thread.sleep(1000);
		loginPage.backToPage();
	}
	@Test
	public void testcase_14_Verify_display_method_Login_By_Google() throws InterruptedException {
		Thread.sleep(1000);
		loginPage.clickICON_GOOGLE();
		Thread.sleep(1000);
		loginPage.backToPage();
	}
	@Test
	public void testcase_15_Verify_display_method_Login_By_Zalo() throws InterruptedException {
		Thread.sleep(1000);
		loginPage.clickICON_ZALO();
		Thread.sleep(1000);
		loginPage.backToPage();
	}
	@Test
	public void testcase_16_Verify_display_method_Login_By_Email() throws InterruptedException {
		Thread.sleep(1000);
		loginPage.clickICON_EMAIL();
		Thread.sleep(1000);
	}
	
	@Test
	public void testcase_17_Verify_display_homepage_when_click_back() throws InterruptedException {
		loginPage.clickLOGIN_BY_EMAIL_BACK_BTT();
	}

	@Test
	public void testcase_18_Verify_display_message_when_not_input_information() throws InterruptedException {
		loginPage.openUrl("https://zpay.mobi/musthai");
		Thread.sleep(1000);
		loginPage.clickICON_EMAIL();
		Thread.sleep(1000);
		loginPage.clickLOGIN_BY_EMAIL_SUBMIT_BTT();
	}

	@Test
	public void testcase_19_Verify_display_message_when_only_input_username() throws InterruptedException {
		loginPage.inputLOGIN_BY_EMAIL_USERNAME_TXT("Toki wo tomete");

		Thread.sleep(1000);

		loginPage.clickLOGIN_BY_EMAIL_SUBMIT_BTT();
	}
	
	@Test
	public void testcase_20_Verify_display_message_when_not_input_information() throws InterruptedException {
		loginPage.inputLOGIN_BY_EMAIL_USERNAME_TXT("");
		
		loginPage.inputLOGIN_BY_EMAIL_PASSWORD_TXT("Bolero");

		Thread.sleep(1000);

		loginPage.clickLOGIN_BY_EMAIL_SUBMIT_BTT();
	}
	
	@Test
	public void testcase_21_Verify_display_message_when_input_invalid_account() throws InterruptedException {
		loginPage.inputLOGIN_BY_EMAIL_USERNAME_TXT("Kiss the baby sky");
		
		loginPage.inputLOGIN_BY_EMAIL_PASSWORD_TXT("260186");

		Thread.sleep(1000);

		loginPage.clickLOGIN_BY_EMAIL_SUBMIT_BTT();
		
		verifyEqual(loginPage.getTextLOGIN_BY_EMAIL_ERROR_MESSAGE(), "Authentication failed");
		
	}
	
	@Test
	public void testcase_22_Verify_display_message_when_input_valid_account() throws InterruptedException {
		loginPage.inputLOGIN_BY_EMAIL_USERNAME_TXT("nhutne555@gmail.com");
		
		loginPage.inputLOGIN_BY_EMAIL_PASSWORD_TXT("Aa123456!");

		Thread.sleep(1000);

		loginPage.clickLOGIN_BY_EMAIL_SUBMIT_BTT();
		
		Thread.sleep(2000);
		
		verifyEqual(loginPage.getTitle(),"MU Strongest");
		
		Thread.sleep(1000);
		
		loginPage.clickLOGIN_BY_EMAIL_SUCCESS_BTT_LOGOUT();
	}
	@Test
	public void testcase_23_Select_Crossfire_THAI() throws InterruptedException {

		logTestCase("Select game Crossfire legends THAI");

		loginPage.openUrl("https://zpay.mobi");

		loginPage.clickDYNAMIC_GAME("cfmobilesea");

	}

	@Test
	public void testcase_24_Verify_display_method_login_By_Facebook() throws InterruptedException {
		Thread.sleep(1000);
		loginPage.clickICON_FACEBOOK();
		Thread.sleep(1000);
		loginPage.backToPage();
	}

	@Test
	public void testcase_25_Verify_display_method_Login_By_Google() throws InterruptedException {
		Thread.sleep(1000);
		loginPage.clickICON_GOOGLE();
		Thread.sleep(1000);
		loginPage.backToPage();
	}

	@Test
	public void testcase_26_Verify_display_method_Login_By_Email() throws InterruptedException {
		Thread.sleep(1000);
		loginPage.clickICON_EMAIL();
		Thread.sleep(1000);
	}

	@Test
	public void testcase_27_Verify_display_message_When_click_back() throws InterruptedException {
		Thread.sleep(1000);
		loginPage.clickLOGIN_BY_EMAIL_BACK_BTT();
		verifyEqual(loginPage.getTextLOGIN_BY_EMAIL_BACK_BTT_POPUP_MESSAGE(),
				"การตรวจสอบความถูกต้องด้วย GUEST ล้มเหลว.");
		Thread.sleep(1000);
		loginPage.clickLOGIN_BY_EMAIL_BACK_BTT_POPUP_BTT_OK();
	}

	@Test
	public void testcase_28_Verify_display_message_when_not_input_information() throws InterruptedException {
		Thread.sleep(2000);
		loginPage.clickICON_EMAIL();
		Thread.sleep(1000);
		loginPage.clickLOGIN_BY_EMAIL_SUBMIT_BTT();
	}

	@Test
	public void testcase_29_Verify_display_message_when_only_input_username() throws InterruptedException {
		loginPage.inputLOGIN_BY_EMAIL_USERNAME_TXT("Stand by u");

		Thread.sleep(1000);

		loginPage.clickLOGIN_BY_EMAIL_SUBMIT_BTT();
	}

	@Test
	public void testcase_30_Verify_display_message_when_not_input_information() throws InterruptedException {
		loginPage.inputLOGIN_BY_EMAIL_USERNAME_TXT("");

		loginPage.inputLOGIN_BY_EMAIL_PASSWORD_TXT("Forever Love");

		Thread.sleep(1000);

		loginPage.clickLOGIN_BY_EMAIL_SUBMIT_BTT();
	}

	@Test
	public void testcase_31_Verify_display_message_when_input_invalid_account() throws InterruptedException {
		loginPage.inputLOGIN_BY_EMAIL_USERNAME_TXT("My Destiny");

		loginPage.inputLOGIN_BY_EMAIL_PASSWORD_TXT("260186");

		Thread.sleep(1000);

		loginPage.clickLOGIN_BY_EMAIL_SUBMIT_BTT();

		verifyEqual(loginPage.getTextLOGIN_BY_EMAIL_ERROR_MESSAGE(), "Thông tin đăng nhập không chính xác");

	}

	@Test
	public void testcase_32_Verify_display_message_when_input_valid_account() throws InterruptedException {
		loginPage.inputLOGIN_BY_EMAIL_USERNAME_TXT("nhutne555@gmail.com");

		loginPage.inputLOGIN_BY_EMAIL_PASSWORD_TXT("Aa123456!");

		Thread.sleep(1000);

		loginPage.clickLOGIN_BY_EMAIL_SUBMIT_BTT();

		Thread.sleep(2000);

		verifyEqual(loginPage.getTitle(), "Crossfire: Legends");

		Thread.sleep(1000);

		loginPage.clickLOGIN_BY_EMAIL_SUCCESS_BTT_LOGOUT();
	}

	@Test
	public void testcase_33_Select_method_ZingID() throws InterruptedException {
		Thread.sleep(1000);
		loginPage.clickICON_ZINGID();
	}

	@Test
	public void testcase_34_Verify_message_when_click_back() throws InterruptedException {
		Thread.sleep(1000);
		loginPage.clickLOGIN_BY_ZINGID_BTT_QUAYVE();
		Thread.sleep(1000);
		verifyEqual(loginPage.getTextLOGIN_BY_ZINGID_BTT_QUAYVE_POPUP_MESSAGE(),
				"การตรวจสอบความถูกต้องด้วย ZING ล้มเหลว.");
		Thread.sleep(1000);
		loginPage.clickLOGIN_BY_ZINGID_BTT_QUAYVE_POPUP_BTT_OK();
	}

	@Test
	public void testcase_35_Verify_message_when_not_input_username_and_password() throws InterruptedException {
		Thread.sleep(1000);
		loginPage.clickICON_ZINGID();
		Thread.sleep(1000);
		loginPage.clickLOGIN_BY_ZINGID_BTT_DANGNHAP();
	}
	@Test
	public void testcase_36_Verify_message_when_only_input_username() throws InterruptedException {
		Thread.sleep(1000);
		loginPage.inputLOGIN_BY_ZINGID_USERNAME_TXT("Doushite Kimi Wo Suki Ni Natte Shimattan Darou");
		loginPage.clickLOGIN_BY_ZINGID_BTT_DANGNHAP();
	}
	@Test
	public void testcase_37_Verify_message_when_only_input_password() throws InterruptedException {
		Thread.sleep(1000);
		loginPage.inputLOGIN_BY_ZINGID_USERNAME_TXT("");
		loginPage.inputLOGIN_BY_ZINGID_PASSWORD_TXT("Why did i fall in love with you");
		loginPage.clickLOGIN_BY_ZINGID_BTT_DANGNHAP();
	}
	@Test
	public void testcase_38_Verify_message_when_input_invalid_account() throws InterruptedException {
		Thread.sleep(1000);
		loginPage.inputLOGIN_BY_ZINGID_USERNAME_TXT("giintvxq");
		loginPage.inputLOGIN_BY_ZINGID_PASSWORD_TXT("Why did i fall in love with you");
		loginPage.clickLOGIN_BY_ZINGID_BTT_DANGNHAP();
	}
	@Test
	public void testcase_39_Verify_message_when_input_valid_account() throws InterruptedException {
		Thread.sleep(1000);
		loginPage.inputLOGIN_BY_ZINGID_USERNAME_TXT("giinboo1");
		loginPage.inputLOGIN_BY_ZINGID_PASSWORD_TXT("Aa123456!");
		loginPage.clickLOGIN_BY_ZINGID_BTT_DANGNHAP();
		Thread.sleep(2000);
		loginPage.clickLOGIN_BY_ZINGID_SUCCESS_BTT_LOGOUT();
	}
	@Test
	public void testcase_40_Verify_display_method_login_By_Zalo() throws InterruptedException {
		Thread.sleep(1000);
		loginPage.clickICON_ZALO();
		Thread.sleep(1000);
		loginPage.backToPage();
	}
	@Test
	public void testcase_41_Select_ROS_MOBILE() throws InterruptedException {

		logTestCase("Select game Ros mobile");

		loginPage.openUrl("https://zpay.mobi");

		loginPage.clickDYNAMIC_GAME("rosthai");
	}
	@Test
	public void testcase_42_Only_input_role_name() throws InterruptedException {

		Thread.sleep(1000);

		loginPage.clickLOGIN_BY_ROLE_BTT_DANGNHAP();

		Thread.sleep(2000);

		verifyEqual(loginPage.getTextLOGIN_BY_ROLE_MSG_ERROR(), "กรุณาเลือกเซิร์ฟเวอร์");
	}

	@Test
	public void testcase_43_Only_Input_Role_Name() throws InterruptedException {

		loginPage.inputLOGIN_BY_ROLE_TXT_TENNHANVAT("Stay with me tonight");

		Thread.sleep(1000);

		loginPage.clickLOGIN_BY_ROLE_BTT_DANGNHAP();

		Thread.sleep(2000);

		verifyEqual(loginPage.getTextLOGIN_BY_ROLE_MSG_ERROR(), "กรุณาเลือกเซิร์ฟเวอร์");
	}

	@Test
	public void testcase_44_Only_Select_Server() throws InterruptedException {

		loginPage.inputLOGIN_BY_ROLE_TXT_TENNHANVAT("");

		Thread.sleep(1000);

		loginPage.clickLOGIN_BY_ROLE_DROPDOWN_MAYCHU();

		Thread.sleep(2000);

		loginPage.clickLOGIN_BY_ROLE_DROPDOWN_MAYCHU_OPTION("Europe");

		Thread.sleep(1000);

		loginPage.clickLOGIN_BY_ROLE_BTT_DANGNHAP();

		verifyEqual(loginPage.getTextLOGIN_BY_ROLE_MSG_ERROR(), "กรุณากรอกชื่อตัวละคร");
	}

	@Test
	public void testcase_45_Input_invalid_account() throws InterruptedException {

		Thread.sleep(1000);

		loginPage.clickLOGIN_BY_ROLE_DROPDOWN_MAYCHU();

		Thread.sleep(1000);

		loginPage.clickLOGIN_BY_ROLE_DROPDOWN_MAYCHU_OPTION("Japan");

		Thread.sleep(1000);

		loginPage.inputLOGIN_BY_ROLE_TXT_TENNHANVAT("GiinTHSK");

		loginPage.clickLOGIN_BY_ROLE_BTT_DANGNHAP();

		verifyEqual(loginPage.getTextLOGIN_BY_ROLE_MSG_ERROR(), "ไม่พบข้อมูลตัวละคร");
	}

	@Test
	public void testcase_46_Input_RoleID_in_RoleName() throws InterruptedException {

		Thread.sleep(1000);

		loginPage.clickLOGIN_BY_ROLE_DROPDOWN_MAYCHU();

		Thread.sleep(1000);

		loginPage.clickLOGIN_BY_ROLE_DROPDOWN_MAYCHU_OPTION("Asia");

		Thread.sleep(1000);

		loginPage.inputLOGIN_BY_ROLE_TXT_TENNHANVAT("550403");

		loginPage.clickLOGIN_BY_ROLE_BTT_DANGNHAP();
		
		verifyEqual(loginPage.getTextLOGIN_BY_ROLE_MSG_ERROR(), "ไม่พบข้อมูลตัวละคร");
	}
	
	@Test
	public void testcase_47_Verify_Login_Success_By_RoleName() throws InterruptedException {

		Thread.sleep(1000);

		loginPage.clickLOGIN_BY_ROLE_DROPDOWN_MAYCHU();
		
		Thread.sleep(1000);

		loginPage.clickLOGIN_BY_ROLE_DROPDOWN_MAYCHU_OPTION("Asia");

		Thread.sleep(1000);

		loginPage.inputLOGIN_BY_ROLE_TXT_TENNHANVAT("Giin");

		loginPage.clickLOGIN_BY_ROLE_BTT_DANGNHAP();
		
		loginPage.clickLOGIN_BY_ROLE_POPUP_BTT_CANCEL();
	}
	@Test
	public void testcase_48_Verify_message_when_only_input_RoleID() throws InterruptedException {
		
		logTestCase("Select game Ros mobile");

		loginPage.openUrl("https://zpay.mobi");

		loginPage.clickDYNAMIC_GAME("rosthai");

		Thread.sleep(1000);

		loginPage.clickLOGIN_BY_ROLE_OPTION_ROLE_ID();
		
		Thread.sleep(1000);
		
		loginPage.inputLOGIN_BY_ROLE_TXT_TENNHANVAT("550403");
		
		loginPage.clickLOGIN_BY_ROLE_BTT_DANGNHAP();
		
		verifyEqual(loginPage.getTextLOGIN_BY_ROLE_MSG_ERROR(), "กรุณาเลือกเซิร์ฟเวอร์");
	}
	
	@Test
	public void testcase_49_Verify_message_when_only_select_server() throws InterruptedException {
		
		Thread.sleep(1000);
		
		loginPage.clickLOGIN_BY_ROLE_DROPDOWN_MAYCHU();
		
		Thread.sleep(500);
		
		loginPage.clickLOGIN_BY_ROLE_DROPDOWN_MAYCHU_OPTION("Latin-America");
		
		Thread.sleep(500);
		
		loginPage.inputLOGIN_BY_ROLE_TXT_TENNHANVAT("");
		
		Thread.sleep(500);
		
		loginPage.clickLOGIN_BY_ROLE_BTT_DANGNHAP();
		
		verifyEqual(loginPage.getTextLOGIN_BY_ROLE_MSG_ERROR(), "กรุณากรอกชื่อตัวละคร");
	}
	@Test
	public void testcase_50_Verify_message_when_login_by_roleNAME_in_tab_roleID() throws InterruptedException {
		
		Thread.sleep(1000);
		
		loginPage.clickLOGIN_BY_ROLE_DROPDOWN_MAYCHU();
		
		Thread.sleep(500);
		
		loginPage.clickLOGIN_BY_ROLE_DROPDOWN_MAYCHU_OPTION("Asia");
		
		Thread.sleep(500);
		
		loginPage.inputLOGIN_BY_ROLE_TXT_TENNHANVAT("Giin");
		
		Thread.sleep(500);
		
		loginPage.clickLOGIN_BY_ROLE_BTT_DANGNHAP();
		
		verifyEqual(loginPage.getTextLOGIN_BY_ROLE_MSG_ERROR(), "ไม่พบข้อมูลตัวละคร");
	}
	@Test
	public void testcase_51_Verify_login_success_by_roleID() throws InterruptedException {
		
		Thread.sleep(1000);
		
		loginPage.clickLOGIN_BY_ROLE_DROPDOWN_MAYCHU();
		
		Thread.sleep(500);
		
		loginPage.clickLOGIN_BY_ROLE_DROPDOWN_MAYCHU_OPTION("Asia");
		
		Thread.sleep(500);
		
		loginPage.inputLOGIN_BY_ROLE_TXT_TENNHANVAT("550403");
		
		Thread.sleep(500);
		
		loginPage.clickLOGIN_BY_ROLE_BTT_DANGNHAP();
		
		Thread.sleep(500);
		
		loginPage.clickLOGIN_BY_ROLE_POPUP_BTT_ACCEPT();
	}
	@Test
	public void testcase_52_Select_ROS_PC() throws InterruptedException {

		logTestCase("Select game Ros mobile");

		loginPage.openUrl("https://zpay.mobi");

		loginPage.clickDYNAMIC_GAME("rospcthai");
	}
	@Test
	public void testcase_53_Only_input_role_name() throws InterruptedException {

		Thread.sleep(1000);

		loginPage.clickLOGIN_BY_ROLE_BTT_DANGNHAP();

		Thread.sleep(2000);

		verifyEqual(loginPage.getTextLOGIN_BY_ROLE_MSG_ERROR(), "กรุณาเลือกเซิร์ฟเวอร์");
	}

	@Test
	public void testcase_54_Only_Input_Role_Name() throws InterruptedException {

		loginPage.inputLOGIN_BY_ROLE_TXT_TENNHANVAT("Some body to love");

		Thread.sleep(1000);

		loginPage.clickLOGIN_BY_ROLE_BTT_DANGNHAP();

		Thread.sleep(2000);

		verifyEqual(loginPage.getTextLOGIN_BY_ROLE_MSG_ERROR(), "กรุณาเลือกเซิร์ฟเวอร์");
	}

	@Test
	public void testcase_55_Only_Select_Server() throws InterruptedException {

		loginPage.inputLOGIN_BY_ROLE_TXT_TENNHANVAT("");

		Thread.sleep(1000);

		loginPage.clickLOGIN_BY_ROLE_DROPDOWN_MAYCHU();

		Thread.sleep(2000);

		loginPage.clickLOGIN_BY_ROLE_DROPDOWN_MAYCHU_OPTION("PC-Europe");

		Thread.sleep(1000);

		loginPage.clickLOGIN_BY_ROLE_BTT_DANGNHAP();

		verifyEqual(loginPage.getTextLOGIN_BY_ROLE_MSG_ERROR(), "กรุณากรอกชื่อตัวละคร");
	}

	@Test
	public void testcase_56_Input_invalid_account() throws InterruptedException {

		Thread.sleep(1000);

		loginPage.clickLOGIN_BY_ROLE_DROPDOWN_MAYCHU();

		Thread.sleep(1000);

		loginPage.clickLOGIN_BY_ROLE_DROPDOWN_MAYCHU_OPTION("PC-Asia");

		Thread.sleep(1000);

		loginPage.inputLOGIN_BY_ROLE_TXT_TENNHANVAT("GiinTHSK");

		loginPage.clickLOGIN_BY_ROLE_BTT_DANGNHAP();

		verifyEqual(loginPage.getTextLOGIN_BY_ROLE_MSG_ERROR(), "ไม่พบข้อมูลตัวละคร");
	}

	@Test
	public void testcase_57_Input_RoleID_in_RoleName() throws InterruptedException {

		Thread.sleep(1000);

		loginPage.clickLOGIN_BY_ROLE_DROPDOWN_MAYCHU();

		Thread.sleep(1000);

		loginPage.clickLOGIN_BY_ROLE_DROPDOWN_MAYCHU_OPTION("PC-America");

		Thread.sleep(1000);

		loginPage.inputLOGIN_BY_ROLE_TXT_TENNHANVAT("165835491");

		loginPage.clickLOGIN_BY_ROLE_BTT_DANGNHAP();
		
		verifyEqual(loginPage.getTextLOGIN_BY_ROLE_MSG_ERROR(), "ไม่พบข้อมูลตัวละคร");
	}
	
	@Test
	public void testcase_58_Verify_Login_Success_By_RoleName() throws InterruptedException {

		Thread.sleep(1000);

		loginPage.clickLOGIN_BY_ROLE_DROPDOWN_MAYCHU();
		
		Thread.sleep(1000);

		loginPage.clickLOGIN_BY_ROLE_DROPDOWN_MAYCHU_OPTION("PC-Asia");

		Thread.sleep(1000);

		loginPage.inputLOGIN_BY_ROLE_TXT_TENNHANVAT("GiiÑ");

		loginPage.clickLOGIN_BY_ROLE_BTT_DANGNHAP();
		
		loginPage.clickLOGIN_BY_ROLE_POPUP_BTT_CANCEL();
	}
	@Test
	public void testcase_59_Verify_message_when_only_input_RoleID() throws InterruptedException {
		
		logTestCase("Select game Ros mobile");

		loginPage.openUrl("https://zpay.mobi");

		loginPage.clickDYNAMIC_GAME("rospcthai");

		Thread.sleep(1000);

		loginPage.clickLOGIN_BY_ROLE_OPTION_ROLE_ID();
		
		Thread.sleep(1000);
		
		loginPage.inputLOGIN_BY_ROLE_TXT_TENNHANVAT("550403");
		
		loginPage.clickLOGIN_BY_ROLE_BTT_DANGNHAP();
		
		verifyEqual(loginPage.getTextLOGIN_BY_ROLE_MSG_ERROR(), "กรุณาเลือกเซิร์ฟเวอร์");
	}
	
	@Test
	public void testcase_60_Verify_message_when_only_select_server() throws InterruptedException {
		
		Thread.sleep(1000);
		
		loginPage.clickLOGIN_BY_ROLE_DROPDOWN_MAYCHU();
		
		Thread.sleep(500);
		
		loginPage.clickLOGIN_BY_ROLE_DROPDOWN_MAYCHU_OPTION("PC-America");
		
		Thread.sleep(500);
		
		loginPage.inputLOGIN_BY_ROLE_TXT_TENNHANVAT("");
		
		Thread.sleep(500);
		
		loginPage.clickLOGIN_BY_ROLE_BTT_DANGNHAP();
		
		verifyEqual(loginPage.getTextLOGIN_BY_ROLE_MSG_ERROR(), "กรุณากรอกชื่อตัวละคร");
	}
	@Test
	public void testcase_61_Verify_message_when_login_by_roleNAME_in_tab_roleID() throws InterruptedException {
		
		Thread.sleep(1000);
		
		loginPage.clickLOGIN_BY_ROLE_DROPDOWN_MAYCHU();
		
		Thread.sleep(500);
		
		loginPage.clickLOGIN_BY_ROLE_DROPDOWN_MAYCHU_OPTION("PC-Europe");
		
		Thread.sleep(500);
		
		loginPage.inputLOGIN_BY_ROLE_TXT_TENNHANVAT("Giin");
		
		Thread.sleep(500);
		
		loginPage.clickLOGIN_BY_ROLE_BTT_DANGNHAP();
		
		verifyEqual(loginPage.getTextLOGIN_BY_ROLE_MSG_ERROR(), "ไม่พบข้อมูลตัวละคร");
	}
	@Test
	public void testcase_62_Verify_login_success_by_roleID() throws InterruptedException {
		
		Thread.sleep(1000);
		
		loginPage.clickLOGIN_BY_ROLE_DROPDOWN_MAYCHU();
		
		Thread.sleep(500);
		
		loginPage.clickLOGIN_BY_ROLE_DROPDOWN_MAYCHU_OPTION("PC-Asia");
		
		Thread.sleep(500);
		
		loginPage.inputLOGIN_BY_ROLE_TXT_TENNHANVAT("49136097");
		
		Thread.sleep(500);
		
		loginPage.clickLOGIN_BY_ROLE_BTT_DANGNHAP();
		
		Thread.sleep(500);
		
		loginPage.clickLOGIN_BY_ROLE_POPUP_BTT_ACCEPT();
	}
	@Test
	public void testcase_63_Select_Super_Samkok() throws InterruptedException {

		logTestCase("Select game Super Samkok");

		loginPage.openUrl("https://zpay.mobi");

		loginPage.clickDYNAMIC_GAME("omg2ss");

	}
	@Test
	public void testcase_64_Verify_display_method_login_By_Facebook() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(1000);
		loginPage.clickICON_FACEBOOK();
		Thread.sleep(1000);
		loginPage.backToPage();
	}
	@Test
	public void testcase_65_Verify_display_method_Login_By_Google() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(1000);
		loginPage.clickICON_GOOGLE();
		Thread.sleep(1000);
		loginPage.backToPage();
	}
	@Test
	public void testcase_66_Verify_display_method_Login_By_Zalo() throws InterruptedException {
		loginPage.clickICON_ZALO();
	}
	@Test
	public void testcase_67_Verify_display_method_Login_By_ZingID() throws InterruptedException {
		loginPage.clickICON_ZINGID();
	}
	@Test
	public void testcase_68_Verify_display_method_Login_By_Email() throws InterruptedException {
		Thread.sleep(1000);
		loginPage.clickICON_EMAIL();
		Thread.sleep(1000);
	}
	@Test
	public void testcase_69_Verify_display_message_when_click_Back() throws InterruptedException {
		loginPage.clickLOGIN_BY_EMAIL_BACK_BTT();
		Thread.sleep(1000);
//		verifyEqual(loginPage.getTextLOGIN_BY_EMAIL_BACK_BTT_POPUP_MESSAGE(), "การตรวจสอบความถูกต้องด้วย GUEST ล้มเหลว.");
//		loginPage.clickLOGIN_BY_EMAIL_BACK_BTT_POPUP_BTT_OK();
	}		
	@Test
	public void testcase_70_Verify_display_message_when_not_input_information() throws InterruptedException {
		loginPage.clickDYNAMIC_GAME("omg2ss");
		Thread.sleep(1000);
		loginPage.clickICON_EMAIL();
		Thread.sleep(1000);
		loginPage.clickLOGIN_BY_EMAIL_SUBMIT_BTT();
	}
	@Test
	public void testcase_71_Verify_display_message_when_only_input_username() throws InterruptedException {
		loginPage.inputLOGIN_BY_EMAIL_USERNAME_TXT("Wasurenaide");

		Thread.sleep(1000);

		loginPage.clickLOGIN_BY_EMAIL_SUBMIT_BTT();
	}
	@Test
	public void testcase_72_Verify_display_message_when_not_input_information() throws InterruptedException {
		loginPage.inputLOGIN_BY_EMAIL_USERNAME_TXT("");

		loginPage.inputLOGIN_BY_EMAIL_PASSWORD_TXT("Proud");

		Thread.sleep(1000);

		loginPage.clickLOGIN_BY_EMAIL_SUBMIT_BTT();
	}

	@Test
	public void testcase_73_Verify_display_message_when_input_invalid_account() throws InterruptedException {
		loginPage.inputLOGIN_BY_EMAIL_USERNAME_TXT("Love in the ice");

		loginPage.inputLOGIN_BY_EMAIL_PASSWORD_TXT("One67611176");

		Thread.sleep(1000);

		loginPage.clickLOGIN_BY_EMAIL_SUBMIT_BTT();

		verifyEqual(loginPage.getTextLOGIN_BY_EMAIL_ERROR_MESSAGE(), "Authentication failed");

	}
	@Test
	public void testcase_74_Verify_display_message_when_input_valid_account() throws InterruptedException {
		loginPage.inputLOGIN_BY_EMAIL_USERNAME_TXT("nhutne555@gmail.com");

		loginPage.inputLOGIN_BY_EMAIL_PASSWORD_TXT("Aa123456!");

		Thread.sleep(1000);

		loginPage.clickLOGIN_BY_EMAIL_SUBMIT_BTT();

		Thread.sleep(2000);

		verifyEqual(loginPage.getTitle(), "OMG 2 - Super Samkok");

		Thread.sleep(1000);

		loginPage.clickLOGIN_BY_EMAIL_SUCCESS_BTT_LOGOUT();
	}
	@Test
	public void testcase_75_Select_Reign_of_Warlords_Thai() throws InterruptedException {

		logTestCase("Select game Reign of Warlords Thai");

		loginPage.openUrl("https://zpay.mobi");

		loginPage.clickDYNAMIC_GAME("stct");

	}
	@Test
	public void testcase_76_Verify_display_method_login_By_Facebook() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(1000);
		loginPage.clickICON_FACEBOOK();
		Thread.sleep(1000);
		loginPage.backToPage();
	}
	@Test
	public void testcase_77_Verify_display_method_Login_By_Google() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(1000);
		loginPage.clickICON_GOOGLE();
		Thread.sleep(1000);
		loginPage.backToPage();
	}
	@Test
	public void testcase_78_Verify_display_method_Login_By_Zalo() throws InterruptedException {
		loginPage.clickICON_ZALO();
	}
	@Test
	public void testcase_79_Verify_display_method_Login_By_ZingID() throws InterruptedException {
		loginPage.clickICON_ZINGID();
	}
	@Test
	public void testcase_80_Verify_display_method_Login_By_Email() throws InterruptedException {
		Thread.sleep(1000);
		loginPage.clickICON_EMAIL();
		Thread.sleep(1000);
	}
	@Test
	public void testcase_81_Verify_display_message_when_click_Back() throws InterruptedException {
		loginPage.clickLOGIN_BY_EMAIL_BACK_BTT();
		Thread.sleep(1000);
		verifyEqual(loginPage.getTextLOGIN_BY_EMAIL_BACK_BTT_POPUP_MESSAGE(), "การตรวจสอบความถูกต้องด้วย GUEST ล้มเหลว.");
		loginPage.clickLOGIN_BY_EMAIL_BACK_BTT_POPUP_BTT_OK();
	}		
	@Test
	public void testcase_82_Verify_display_message_when_not_input_information() throws InterruptedException {
		Thread.sleep(1000);
		loginPage.clickICON_EMAIL();
		Thread.sleep(1000);
		loginPage.clickLOGIN_BY_EMAIL_SUBMIT_BTT();
	}
	@Test
	public void testcase_83_Verify_display_message_when_only_input_username() throws InterruptedException {
		loginPage.inputLOGIN_BY_EMAIL_USERNAME_TXT("Wasurenaide");

		Thread.sleep(1000);

		loginPage.clickLOGIN_BY_EMAIL_SUBMIT_BTT();
	}
	@Test
	public void testcase_84_Verify_display_message_when_not_input_information() throws InterruptedException {
		loginPage.inputLOGIN_BY_EMAIL_USERNAME_TXT("");

		loginPage.inputLOGIN_BY_EMAIL_PASSWORD_TXT("Proud");

		Thread.sleep(1000);

		loginPage.clickLOGIN_BY_EMAIL_SUBMIT_BTT();
	}

	@Test
	public void testcase_85_Verify_display_message_when_input_invalid_account() throws InterruptedException {
		loginPage.inputLOGIN_BY_EMAIL_USERNAME_TXT("Love in the ice");

		loginPage.inputLOGIN_BY_EMAIL_PASSWORD_TXT("One67611176");

		Thread.sleep(1000);

		loginPage.clickLOGIN_BY_EMAIL_SUBMIT_BTT();

		verifyEqual(loginPage.getTextLOGIN_BY_EMAIL_ERROR_MESSAGE(), "Thông tin đăng nhập không chính xác");
	}
	@Test
	public void testcase_86_Verify_display_message_when_input_valid_account() throws InterruptedException {
		loginPage.inputLOGIN_BY_EMAIL_USERNAME_TXT("nhutne555@gmail.com");

		loginPage.inputLOGIN_BY_EMAIL_PASSWORD_TXT("Aa123456!");

		Thread.sleep(1000);

		loginPage.clickLOGIN_BY_EMAIL_SUBMIT_BTT();

//		Thread.sleep(2000);
//
//		verifyEqual(loginPage.getTitle(), "Reign of Warlords");
//
//		Thread.sleep(1000);
//
//		loginPage.clickLOGIN_BY_EMAIL_SUCCESS_BTT_LOGOUT();
	}
	@Test
	public void testcase_87_Select_Dai_Chien_Samurai_Thai() throws InterruptedException {

		logTestCase("Select game Samurai Master Thai");

		loginPage.openUrl("https://zpay.mobi");

		loginPage.clickDYNAMIC_GAME("dcsthai");

	}
	@Test
	public void testcase_88_Verify_display_method_login_By_Facebook() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(1000);
		loginPage.clickICON_FACEBOOK();
		Thread.sleep(1000);
		loginPage.backToPage();
	}
	@Test
	public void testcase_89_Verify_display_method_Login_By_Google() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(1000);
		loginPage.clickICON_GOOGLE();
		Thread.sleep(1000);
		loginPage.backToPage();
	}
	@Test
	public void testcase_90_Verify_display_method_Login_By_Zalo() throws InterruptedException {
		loginPage.clickICON_ZALO();
	}
	@Test
	public void testcase_91_Verify_display_method_Login_By_ZingID() throws InterruptedException {
		loginPage.clickICON_ZINGID();
	}
	@Test
	public void testcase_92_Verify_display_method_Login_By_Email() throws InterruptedException {
		loginPage.clickICON_EMAIL();
	}
	@Test
	public void testcase_93_Verify_display_message_when_click_Back() throws InterruptedException {
//		Thread.sleep(1000);
//		loginPage.clickDYNAMIC_GAME("dcsthai");
//		Thread.sleep(500);
//		loginPage.clickICON_EMAIL();
//		Thread.sleep(1000);
		loginPage.clickLOGIN_BY_EMAIL_BACK_BTT();
		Thread.sleep(1000);
//		verifyEqual(loginPage.getTextLOGIN_BY_EMAIL_BACK_BTT_POPUP_MESSAGE(), "การตรวจสอบความถูกต้องด้วย GUEST ล้มเหลว.");
//		loginPage.clickLOGIN_BY_EMAIL_BACK_BTT_POPUP_BTT_OK();
	}		
	@Test
	public void testcase_94_Verify_display_message_when_not_input_information() throws InterruptedException {
		Thread.sleep(1000);
		loginPage.clickDYNAMIC_GAME("dcsthai");
		Thread.sleep(500);
		loginPage.clickICON_EMAIL();
		Thread.sleep(1000);
		loginPage.clickLOGIN_BY_EMAIL_SUBMIT_BTT();
	}
	@Test
	public void testcase_95_Verify_display_message_when_only_input_username() throws InterruptedException {
		loginPage.inputLOGIN_BY_EMAIL_USERNAME_TXT("Wasurenaide");

		Thread.sleep(1000);

		loginPage.clickLOGIN_BY_EMAIL_SUBMIT_BTT();
	}
	@Test
	public void testcase_96_Verify_display_message_when_not_input_information() throws InterruptedException {
		loginPage.inputLOGIN_BY_EMAIL_USERNAME_TXT("");

		loginPage.inputLOGIN_BY_EMAIL_PASSWORD_TXT("Proud");

		Thread.sleep(1000);

		loginPage.clickLOGIN_BY_EMAIL_SUBMIT_BTT();
	}

	@Test
	public void testcase_97_Verify_display_message_when_input_invalid_account() throws InterruptedException {
		loginPage.inputLOGIN_BY_EMAIL_USERNAME_TXT("Love in the ice");

		loginPage.inputLOGIN_BY_EMAIL_PASSWORD_TXT("One67611176");

		Thread.sleep(1000);

		loginPage.clickLOGIN_BY_EMAIL_SUBMIT_BTT();

		verifyEqual(loginPage.getTextLOGIN_BY_EMAIL_ERROR_MESSAGE(), "Authentication failed");
	}
	@Test
	public void testcase_98_Verify_display_message_when_input_valid_account() throws InterruptedException {
		loginPage.inputLOGIN_BY_EMAIL_USERNAME_TXT("nhutne555@gmail.com");

		loginPage.inputLOGIN_BY_EMAIL_PASSWORD_TXT("Aa123456!");

		Thread.sleep(1000);

		loginPage.clickLOGIN_BY_EMAIL_SUBMIT_BTT();
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
