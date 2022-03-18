package pages

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class PersonalPage extends BasePage{

	@Keyword
	def fillUserData(long userPhone, String userEmail) {

		setElementText(findTestObject('PersonalPage/emailAddress'), userEmail)
		setElementText(findTestObject('PersonalPage/phone'), userPhone.toString())
	}

	@Keyword
	def clickComercialRealStateRadioButton(boolean state) {

		if(state==true) {
			clickOnElement(findTestObject('PersonalPage/YesComercialRealStateRadioButton'))
		}else {
			clickOnElement(findTestObject('PersonalPage/NoComercialRealStateRadioButton'))
		}
	}

	@Keyword
	def setNetWorthRange(int range) {

		setElementText(findTestObject('PersonalPage/netWorthRange'), range.toString())
	}


	@Keyword
	def fillAdditionalMessage(String additionalMessage) {

		setElementText(findTestObject('PersonalPage/additionalMessage'), additionalMessage)
	}

	@Keyword
	def completeSubmission() {
		String text = getElementText(findTestObject('PersonalPage/title'))
		clickOnElement(findTestObject('PersonalPage/completeSubmissionButton'))
		waitUntilElementTextChanges(findTestObject('ThankYouPage/title'), text)
	}

	@Keyword
	def boolean isCompleteSubmissionButtonDisable() {

		return WebUI.verifyElementHasAttribute(findTestObject('PersonalPage/completeSubmissionButton'), "disabled", GlobalVariable.waitTimeOut)
	}
}
