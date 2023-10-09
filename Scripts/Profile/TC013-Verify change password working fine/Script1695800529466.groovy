import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://app.landingly.com/')

WebUI.setText(findTestObject('Object Repository/Profile/TC013-Verify change password working fine/Page_Landingly  Login/input_Email_login-email'), 
    'sqaahmadtahir@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Profile/TC013-Verify change password working fine/Page_Landingly  Login/input_Forgot Password_login-password'), 
    '/5S6MFFLcE5DAenbZpYNsQ==')

WebUI.click(findTestObject('Object Repository/Profile/TC013-Verify change password working fine/Page_Landingly  Login/button_Sign in'))

WebUI.click(findTestObject('Object Repository/Profile/TC013-Verify change password working fine/Page_Landingly/img'))

WebUI.click(findTestObject('Object Repository/Profile/TC013-Verify change password working fine/Page_Landingly/a_Profile'))

WebUI.click(findTestObject('Object Repository/Profile/TC013-Verify change password working fine/Page_Landingly  Profile/a_Change Password'))

WebUI.setEncryptedText(findTestObject('Object Repository/Profile/TC013-Verify change password working fine/Page_Landingly  Profile/input__old-password'), 
    '/5S6MFFLcE5DAenbZpYNsQ==')

WebUI.setEncryptedText(findTestObject('Object Repository/Profile/TC013-Verify change password working fine/Page_Landingly  Profile/input__new-password'), 
    '/5S6MFFLcE5DAenbZpYNsQ==')

WebUI.setEncryptedText(findTestObject('Object Repository/Profile/TC013-Verify change password working fine/Page_Landingly  Profile/input__retype-password'), 
    '/5S6MFFLcE5DAenbZpYNsQ==')

WebUI.click(findTestObject('Object Repository/Profile/TC013-Verify change password working fine/Page_Landingly  Profile/button_Update'))

WebUI.verifyElementText(findTestObject('Profile/TC013-Verify change password working fine/Page_Landingly  Profile/h2_Success'), 
    'Success')

WebUI.click(findTestObject('Profile/TC013-Verify change password working fine/Page_Landingly  Profile/button_OK'))

WebUI.closeBrowser()

