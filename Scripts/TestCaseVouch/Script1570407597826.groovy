import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://staging.vouch.sg/api/v1/merchants/bot/5c0899a0f82bb561b4eff079')

WebUI.waitForElementClickable(findTestObject('Page_Andaz12/btnOpenChat'), 30, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Andaz12/btnOpenChat'))

WebUI.click(findTestObject('Page_Andaz12/btnGetStarted'))

WebUI.waitForElementClickable(findTestObject('Page_Andaz12/btnSubscribeNewsletter'), 30, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Page_Andaz12/inputText'), 'facilities?')

WebUI.sendKeys(findTestObject('Page_Andaz12/inputText'), Keys.chord(Keys.ENTER))

WebUI.waitForElementClickable(findTestObject('Page_Andaz12/btnMenu'), 30, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Page_Andaz12/inputText'), 'nearby restaurants?')

WebUI.sendKeys(findTestObject('Page_Andaz12/inputText'), Keys.chord(Keys.ENTER))

WebUI.waitForElementClickable(findTestObject('Page_Andaz12/btnRecommendFood'), 30, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Andaz12/btnRecommendFood'))

WebUI.waitForElementClickable(findTestObject('Page_Andaz12/btnWestern'), 30, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Andaz12/btnWestern'))

WebUI.waitForElementClickable(findTestObject('Page_Andaz12/btnFoodSelection'), 30, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Andaz12/btnFoodSelection'))

WebUI.waitForElementClickable(findTestObject('Page_Andaz12/btnBack'), 30, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Andaz12/btnBack'))

WebUI.waitForElementClickable(findTestObject('Page_Andaz12/btnIn-house'), 30, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Andaz12/btnIn-house'))

WebUI.waitForElementClickable(findTestObject('Page_Andaz12/btnMainMenu'), 30, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Andaz12/btnMainMenu'))

WebUI.waitForElementHasAttribute(findTestObject('Page_Andaz12/btnSubscribeNewsletter'), 'Subscribe Newsletter', 0)

WebUI.setText(findTestObject('Page_Andaz12/inputText'), 'okay thank you')

WebUI.sendKeys(findTestObject('Page_Andaz12/inputText'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Page_Andaz12/btnClose'))

WebUI.closeBrowser()

