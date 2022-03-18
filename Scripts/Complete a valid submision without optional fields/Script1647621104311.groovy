
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

CustomKeywords.'pages.PersonalPage.fillUserData'(GlobalVariable.userPhone, GlobalVariable.userEmail)

CustomKeywords.'pages.PersonalPage.clickComercialRealStateRadioButton'(true)

CustomKeywords.'pages.PersonalPage.setNetWorthRange'(GlobalVariable.netWorthRange)

CustomKeywords.'pages.PersonalPage.completeSubmission'()

Assert.assertEquals(CustomKeywords.'pages.ThankYouPage.getTitle'(), "Thank you, "+ GlobalVariable.userName + "!")

CustomKeywords.'pages.ThankYouPage.continueToHomePage'()

Assert.assertTrue(CustomKeywords.'pages.HomePage.isTitleDisssplayed'())
