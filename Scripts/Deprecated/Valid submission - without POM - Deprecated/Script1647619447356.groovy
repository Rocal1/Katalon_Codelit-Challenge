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


WebUI.setText(findTestObject('HomePage/fullNameInput'), GlobalVariable.userName)

WebUI.click(findTestObject('HomePage/nextButton'))

WebUI.click(findTestObject('FinancingPage/stabilizedAcquisition'))

WebUI.setText(findTestObject('FinancingPage/purchasePrice'), GlobalVariable.purchasePrice)

WebUI.setText(findTestObject('FinancingPage/capexBudget'), GlobalVariable.capexBudget)

WebUI.waitForElementClickable(findTestObject('FinancingPage/nextButton'), GlobalVariable.waitTimeOut)
WebUI.click(findTestObject('FinancingPage/nextButton'))

WebUI.click(findTestObject('TheProjectPage/multifamily'))

WebUI.setText(findTestObject('TheProjectPage/yourAddress'), GlobalVariable.userAddress)

WebUI.click(findTestObject('TheProjectPage/firstResult'))

WebUI.waitForElementClickable(findTestObject('FinancingPage/nextButton'), GlobalVariable.waitTimeOut)
WebUI.click(findTestObject('FinancingPage/nextButton'))

WebUI.click(findTestObject('AdditionalInfoPage/lowOccupancyLevelCheckBox'))

WebUI.waitForElementClickable(findTestObject('FinancingPage/nextButton'), GlobalVariable.waitTimeOut)
WebUI.click(findTestObject('FinancingPage/nextButton'))

WebUI.setText(findTestObject('PersonalPage/emailAddress'), GlobalVariable.userEmail)

WebUI.setText(findTestObject('PersonalPage/phone'), GlobalVariable.userPhone)

WebUI.click(findTestObject('PersonalPage/YesComercialRealStateRadioButton'))

WebUI.setText(findTestObject('PersonalPage/netWorthRange'), GlobalVariable.netWorthRange)

WebUI.setText(findTestObject('PersonalPage/additionalMessage'), GlobalVariable.additionalMessage)

WebUI.waitForElementClickable(findTestObject('PersonalPage/completeSubmissionButton'), GlobalVariable.waitTimeOut)
WebUI.click(findTestObject('PersonalPage/completeSubmissionButton'))

WebUI.verifyElementText(findTestObject('ThankYouPage/title'), "Thank you, "+ GlobalVariable.userName + "!")

WebUI.waitForElementClickable(findTestObject('ThankYouPage/continueToHomepageButton'), GlobalVariable.waitTimeOut)
WebUI.click(findTestObject('ThankYouPage/continueToHomepageButton'))

WebUI.verifyElementPresent(findTestObject('HomePage/homeTitle'), GlobalVariable.waitTimeOut)

