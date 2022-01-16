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

WebUI.navigateToUrl('https://phptravels.net/api/admin')

WebUI.waitForPageLoad(0)

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Administator Login/form_Email                                 _b48352'), 
    0)

WebUI.click(findTestObject('Object Repository/Page_Administator Login/span_Email'))

WebUI.setText(findTestObject('Object Repository/Page_Administator Login/input_Administrator Users Only_email'), 'admin@phptravels.com')

WebUI.click(findTestObject('Object Repository/Page_Administator Login/span_Password'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Administator Login/input_Email_password'), 'orSGNCvhf+w8SKCExcig5g==')

WebUI.mouseOver(findTestObject('Object Repository/Page_Administator Login/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Administator Login/button_Login'))

WebUI.waitForPageLoad(0)

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Dashboard/div_Dashboard    Sales overview  summary   _e44b1e'), 
    0)

