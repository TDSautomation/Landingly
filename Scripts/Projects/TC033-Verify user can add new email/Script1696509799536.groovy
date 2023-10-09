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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://app.landingly.com/')

WebUI.setText(findTestObject('Object Repository/Projects/TC033-Verify user can add new email/Page_Landingly  Login/input_Email_login-email'), 
    'sqaahmadtahir@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Projects/TC033-Verify user can add new email/Page_Landingly  Login/input_Forgot Password_login-password'), 
    '/5S6MFFLcE5DAenbZpYNsQ==')

WebUI.click(findTestObject('Object Repository/Projects/TC033-Verify user can add new email/Page_Landingly  Login/button_Sign in'))

WebUI.click(findTestObject('Object Repository/Projects/TC033-Verify user can add new email/Page_Landingly/a_Projects'))

WebUI.click(findTestObject('Object Repository/Projects/TC033-Verify user can add new email/Page_Landingly  Projects/button_New Project'))

WebUI.setText(findTestObject('Object Repository/Projects/TC033-Verify user can add new email/Page_Landingly  Projects/input__ProjectName'), 
    'new project')

WebUI.click(findTestObject('Object Repository/Projects/TC033-Verify user can add new email/Page_Landingly  Projects/button_Build Project'))

WebUI.click(findTestObject('Object Repository/Projects/TC033-Verify user can add new email/Page_Landingly  Project Detail/a_Use This'))

WebUI.click(findTestObject('Object Repository/Projects/TC033-Verify user can add new email/Page_Landingly  Project Detail/a_Use This'))

WebUI.click(findTestObject('Object Repository/Projects/TC033-Verify user can add new email/Page_Landingly  Project Detail/button_Add New Email'))

WebUI.setText(findTestObject('Object Repository/Projects/TC033-Verify user can add new email/Page_Landingly  Project Detail/input__FromName'), 
    'Ahmad')

WebUI.setText(findTestObject('Object Repository/Projects/TC033-Verify user can add new email/Page_Landingly  Project Detail/input__Subject'), 
    'My subject')

WebUI.setText(findTestObject('Object Repository/Projects/TC033-Verify user can add new email/Page_Landingly  Project Detail/input__ReplyToEmail'), 
    'sqaahmadtahir@gmail.com')

WebUI.setText(findTestObject('Projects/TC033-Verify user can add new email/Page_Landingly  Project Detail/input_mailbody'), 
    'mail text automation')

WebUI.setText(findTestObject('Object Repository/Projects/TC033-Verify user can add new email/Page_Landingly  Project Detail/input_Cam Spam_CamSpam'), 
    'test cam spam')

WebUI.click(findTestObject('Object Repository/Projects/TC033-Verify user can add new email/Page_Landingly  Project Detail/button_Save  Schedule'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Projects/TC033-Verify user can add new email/Page_Landingly  Project Detail/td_My subject'), 
    0)

WebUI.closeBrowser()

