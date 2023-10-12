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

WebUI.setText(findTestObject('Object Repository/Projects/TC022-Verify user can edit template for sales or optin page/Page_Landingly  Login/input_Email_login-email'), 
    'sqaahmadtahir@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Projects/TC022-Verify user can edit template for sales or optin page/Page_Landingly  Login/input_Forgot Password_login-password'), 
    '/5S6MFFLcE5DAenbZpYNsQ==')

WebUI.click(findTestObject('Object Repository/Projects/TC022-Verify user can edit template for sales or optin page/Page_Landingly  Login/button_Sign in'))

WebUI.click(findTestObject('Object Repository/Projects/TC022-Verify user can edit template for sales or optin page/Page_Landingly/a_Projects'))

WebUI.click(findTestObject('Object Repository/Projects/TC022-Verify user can edit template for sales or optin page/Page_Landingly  Projects/a_View Project'))

WebUI.click(findTestObject('Object Repository/Projects/TC022-Verify user can edit template for sales or optin page/Page_Landingly  Project Detail/a_Contacts_btn btn-icon btn-flat-primary'))

WebUI.verifyElementText(findTestObject('Object Repository/Projects/TC022-Verify user can edit template for sales or optin page/Page_Landingly  Edit Project/span_Edit Project'), 
    'Edit Project')

WebUI.closeBrowser()

