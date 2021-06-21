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

WebUI.openBrowser('https://www.makemytrip.com/')

WebUI.maximizeWindow()

WebUI.waitForElementClickable(findTestObject('Page_MakeMyTrip/span_Flights'), 15)

WebUI.click(findTestObject('Page_MakeMyTrip/span_Flights'))

WebUI.click(findTestObject('Page_MakeMyTrip/input_From_fromCity'))

WebUI.sendKeys(findTestObject('Page_MakeMyTrip/fromInput'), findTestData('MakeMyTrip/TestData').getValue(1, 1))

WebUI.click(findTestObject('Page_MakeMyTrip/p_Delhi, India'))

WebUI.click(findTestObject('Page_MakeMyTrip/input_To_toCity'))

WebUI.sendKeys(findTestObject('Page_MakeMyTrip/toInput'), findTestData('MakeMyTrip/TestData').getValue(2, 1))

WebUI.click(findTestObject('Page_MakeMyTrip/p_Mumbai, India'))

WebUI.click(findTestObject('Page_MakeMyTrip/p_30'))

WebUI.click(findTestObject('Page_MakeMyTrip/Search'))

