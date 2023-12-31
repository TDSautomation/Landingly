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

WebUI.setText(findTestObject('Object Repository/Profile/TC011-Verify user can remove profile picture/Page_Landingly  Login/input_Email_login-email'), 
    'sqaahmadtahir@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Profile/TC011-Verify user can remove profile picture/Page_Landingly  Login/input_Forgot Password_login-password'), 
    '/5S6MFFLcE5DAenbZpYNsQ==')

WebUI.click(findTestObject('Object Repository/Profile/TC011-Verify user can remove profile picture/Page_Landingly  Login/button_Sign in'))

WebUI.click(findTestObject('Object Repository/Profile/TC011-Verify user can remove profile picture/Page_Landingly/img'))

WebUI.click(findTestObject('Object Repository/Profile/TC011-Verify user can remove profile picture/Page_Landingly/span_Profile'))

WebUI.mouseOver(findTestObject('Object Repository/Profile/TC011-Verify user can remove profile picture/Page_Landingly  Profile/rect'))

WebUI.click(findTestObject('Profile/TC011-Verify user can remove profile picture/Page_Landingly  Profile/rect - Copy'))

WebUI.click(findTestObject('Object Repository/Profile/TC011-Verify user can remove profile picture/Page_Landingly  Profile/button_Delete'))

attribute = WebUI.getAttribute(findTestObject('Profile/TC011-Verify user can remove profile picture/Page_Landingly  Profile/varifyimage'), 
    'src')

WebUI.delay(10)

WebUI.verifyMatch(attribute, 'https://api.landingly.com/Images/profile.png', false)

WebUI.closeBrowser()

