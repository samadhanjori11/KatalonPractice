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

WebUI.callTestCase(findTestCase('PARA BANK/PB_TC_01_Access the Parabank website'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/PARA BANK/Page_ParaBank  Welcome  Online Banking/input_Username_username'), 
    'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/PARA BANK/Page_ParaBank  Welcome  Online Banking/input_Password_password'), 
    'hUKwJTbofgPskEWN4pMTBw==')

WebUI.click(findTestObject('Object Repository/PARA BANK/Page_ParaBank  Welcome  Online Banking/Login button'))

WebUI.verifyTextPresent('', false)

WebUI.click(findTestObject('Object Repository/PARA BANK/Page_ParaBank  Accounts Overview/Open New Account'))

WebUI.selectOptionByValue(findTestObject('Object Repository/PARA BANK/Page_ParaBank  Open Account/Select_account_type'), 
    '1', true)

WebUI.click(findTestObject('PARA BANK/Page_ParaBank  Open Account/Page_ParaBank  Open Account/Open account button'))

WebUI.verifyElementPresent(findTestObject('PARA BANK/Page_ParaBank  Open Account/Page_ParaBank  Open Account/h1_Account Opened'), 
    0)

WebUI.closeBrowser()

