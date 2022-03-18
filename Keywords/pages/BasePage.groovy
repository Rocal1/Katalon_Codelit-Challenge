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
import com.kms.katalon.core.webui.keyword.builtin.WaitForElementClickableKeyword
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.thoughtworks.selenium.webdriven.commands.WaitForCondition

import internal.GlobalVariable

public class BasePage {

	@Keyword
	def waitForElementVisible(TestObject element){

		WebUI.waitForElementPresent(element, GlobalVariable.waitTimeOut)
		WebUI.waitForElementVisible(element, GlobalVariable.waitTimeOut)
	}

	@Keyword
	def waitForElementDisappear(TestObject element){

		WebUI.waitForElementNotVisible(element, GlobalVariable.waitTimeOut)
	}

	@Keyword
	def clickOnElement(TestObject element){

		waitForElementVisible(element)
		WebUI.waitForElementClickable(element, GlobalVariable.waitTimeOut)
		WebUI.waitForElementNotHasAttribute(element, "disabled", GlobalVariable.waitTimeOut)
		WebUI.click(element)
	}

	@Keyword
	def setElementText(TestObject element, String text){

		waitForElementVisible(element)
		WebUI.setText(element, text)
	}

	@Keyword
	def String getElementText(TestObject element){

		waitForElementVisible(element)
		return WebUI.getText(element)
	}
	
	@Keyword
	def String waitUntilElementTextChanges(TestObject element, String actualText){
		int iterator = 0
		while(getElementText(element)==actualText || iterator < 3) {
			iterator ++
		}
	}	
}
