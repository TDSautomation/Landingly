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

WebUI.setText(findTestObject('Projects/TC031-Verify user can edit product/Page_Landingly  Login/input_Email_login-email'), 
    'sqaahmadtahir@gmail.com')

WebUI.setEncryptedText(findTestObject('Projects/TC031-Verify user can edit product/Page_Landingly  Login/input_Forgot Password_login-password'), 
    '/5S6MFFLcE5DAenbZpYNsQ==')

WebUI.click(findTestObject('Projects/TC031-Verify user can edit product/Page_Landingly  Login/button_Sign in'))

WebUI.click(findTestObject('Projects/TC031-Verify user can edit product/Page_Landingly/a_Projects'))

WebUI.click(findTestObject('Projects/TC031-Verify user can edit product/Page_Landingly  Projects/button_New Project'))

WebUI.setText(findTestObject('Projects/TC031-Verify user can edit product/Page_Landingly  Projects/input__ProjectName'), 
    'sales')

WebUI.click(findTestObject('Projects/TC031-Verify user can edit product/Page_Landingly  Projects/label_Sales Funnel'))

WebUI.click(findTestObject('Projects/TC031-Verify user can edit product/Page_Landingly  Projects/button_Build Project'))

WebUI.click(findTestObject('Projects/TC031-Verify user can edit product/Page_Landingly  Project Detail/a_Use This'))

WebUI.click(findTestObject('Projects/TC031-Verify user can edit product/Page_Landingly  Project Detail/a_Use This'))

WebUI.click(findTestObject('Projects/TC031-Verify user can edit product/Page_Landingly  Project Detail/button_Add New Product'))

def populateSalesProjectName = CustomKeywords.'customKeywords.Emailautomation.populateSalesProjectName'()

WebUI.setText(findTestObject('Projects/TC031-Verify user can edit product/Page_Landingly  Project Detail/input__ProductName'), 
    populateSalesProjectName)

WebUI.setText(findTestObject('Projects/TC031-Verify user can edit product/Page_Landingly  Project Detail/input__ProductPrice'), 
    '02')

WebUI.selectOptionByValue(findTestObject('Projects/TC031-Verify user can edit product/Page_Landingly  Project Detail/select_Select Payment Method PayPal  Stripe_d0e314'), 
    'Select Payment Method', true)

WebUI.selectOptionByValue(findTestObject('Projects/TC031-Verify user can edit product/Page_Landingly  Project Detail/select_Select Payment Method PayPal  Stripe_d0e314'), 
    'Select Payment Method', true)

WebUI.selectOptionByValue(findTestObject('Projects/TC031-Verify user can edit product/Page_Landingly  Project Detail/select_Select Payment Method PayPal  Stripe_d0e314'), 
    '2', true)

WebUI.selectOptionByValue(findTestObject('Projects/TC031-Verify user can edit product/Page_Landingly  Project Detail/select_Select Payment Method PayPal  Stripe_d0e314'), 
    '2', true)

WebUI.click(findTestObject('Projects/TC031-Verify user can edit product/Page_Landingly  Project Detail/a_Checkout Page Settings'))

WebUI.click(findTestObject('Projects/TC031-Verify user can edit product/Page_Landingly  Project Detail/a_Use This'))

WebUI.click(findTestObject('Projects/TC031-Verify user can edit product/Page_Landingly  Project Detail/button_Save'))

WebUI.verifyElementText(findTestObject('Projects/TC031-Verify user can edit product/Page_Landingly  Project Detail/td_new product'), 
    populateSalesProjectName)

WebUI.click(findTestObject('Projects/TC031-Verify user can edit product/Page_Landingly  Project Detail/btnedit'))

def populateProjectName = CustomKeywords.'customKeywords.Emailautomation.populateSalesProjectName'()

WebUI.setText(findTestObject('Projects/TC031-Verify user can edit product/Page_Landingly  Project Detail/input__ProductName'), 
    populateProjectName)

WebUI.setText(findTestObject('Projects/TC031-Verify user can edit product/Page_Landingly  Project Detail/input__ProductPrice'), 
    '05')

WebUI.selectOptionByValue(findTestObject('Projects/TC031-Verify user can edit product/Page_Landingly  Project Detail/select_Select Payment Method PayPal  Stripe_d0e314'), 
    'Select Payment Method', true)

WebUI.selectOptionByValue(findTestObject('Projects/TC031-Verify user can edit product/Page_Landingly  Project Detail/select_Select Payment Method PayPal  Stripe_d0e314'), 
    'Select Payment Method', true)

WebUI.selectOptionByValue(findTestObject('Projects/TC031-Verify user can edit product/Page_Landingly  Project Detail/select_Select Payment Method PayPal  Stripe_d0e314'), 
    '3', true)

WebUI.selectOptionByValue(findTestObject('Projects/TC031-Verify user can edit product/Page_Landingly  Project Detail/select_Select Payment Method PayPal  Stripe_d0e314'), 
    '3', true)

WebUI.click(findTestObject('Projects/TC031-Verify user can edit product/Page_Landingly  Project Detail/a_Checkout Page Settings'))

WebUI.click(findTestObject('Projects/TC031-Verify user can edit product/Page_Landingly  Project Detail/a_Use This - Copy'))

WebUI.click(findTestObject('Projects/TC031-Verify user can edit product/Page_Landingly  Project Detail/button_Save - Copy'))

WebUI.delay(10)

WebUI.verifyElementText(findTestObject('Projects/TC031-Verify user can edit product/Page_Landingly  Project Detail/td_new product'), 
    populateProjectName)

WebUI.closeBrowser()

