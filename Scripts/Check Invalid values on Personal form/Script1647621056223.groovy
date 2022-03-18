
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable


import org.openqa.selenium.Keys
import org.testng.Assert
import org.testng.Assert as Keys


CustomKeywords.'pages.HomePage.enterFullName'(GlobalVariable.userName)

CustomKeywords.'pages.HomePage.goToFinantial'()

CustomKeywords.'pages.FinantialPage.selectStabilizedAcquisition'(GlobalVariable.purchasePrice, GlobalVariable.capexBudget)

CustomKeywords.'pages.FinantialPage.goToTheProject'()

CustomKeywords.'pages.TheProjectPage.selectMultipfamily'()

CustomKeywords.'pages.TheProjectPage.addAddress'(GlobalVariable.userAddress)

CustomKeywords.'pages.TheProjectPage.goToAdditionalInfo'()

CustomKeywords.'pages.AdditionalInfoPage.selectLowOccupancyLevel'()

CustomKeywords.'pages.AdditionalInfoPage.goToPersonal'()

CustomKeywords.'pages.PersonalPage.fillUserData'(4444, "test@")

CustomKeywords.'pages.PersonalPage.clickComercialRealStateRadioButton'(true)

CustomKeywords.'pages.PersonalPage.setNetWorthRange'(GlobalVariable.netWorthRange)

CustomKeywords.'pages.PersonalPage.fillAdditionalMessage'(GlobalVariable.additionalMessage)

Assert.assertTrue(CustomKeywords.'pages.PersonalPage.isCompleteSubmissionButtonDisable'())