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

WebUI.callTestCase(findTestCase('LambdaTestPlayground/TC02_Successful Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Ecommerce/Page_Your Store/input_All Categories_search'), 'iPod')

WebUI.sendKeys(findTestObject('Object Repository/Ecommerce/Page_Your Store/input_All Categories_search'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Ecommerce/Page_Search - iPod/a_iPod Touch'))

WebUI.click(findTestObject('Object Repository/Ecommerce/Page_iPod Touch/button_Add to Cart'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Ecommerce/Page_iPod Touch/p_Success You have added iPod Touch to your_e1b4db'), 
    0)

WebUI.closeBrowser()
