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

WebUI.callTestCase(findTestCase('LambdaTestPlayground/TC01_Access ecommerce website'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Ecommerce/Page_Your Store/span_My account'))

WebUI.waitForElementPresent(findTestObject('Ecommerce/Page_Account Login/input_E-Mail Address_email'), 5)

WebUI.setText(findTestObject('Object Repository/Ecommerce/Page_Account Login/input_E-Mail Address_email'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Ecommerce/Page_Account Login/input_Password_password'), 'hUKwJTbofgPskEWN4pMTBw==')

WebUI.click(findTestObject('Object Repository/Ecommerce/Page_Account Login/input_Forgotten Password_btn btn-primary'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Ecommerce/Page_Account Login/div_Warning Your account has exceeded allow_fce686'), 
    5)

WebUI.closeBrowser()

