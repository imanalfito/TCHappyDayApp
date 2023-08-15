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

Mobile.startApplication('mobileapp/Calculator_v8.1.apk', false)

Mobile.tap(findTestObject('Calculator/Button-7'), 0)

Mobile.tap(findTestObject('Calculator/Button_Pembagian'), 0)

Mobile.tap(findTestObject('Calculator/Button_1'), 0)

Mobile.tap(findTestObject('Calculator/Button_equal to'), 0)

Mobile.delay(30, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Calculator/Button_4'), 0)

Mobile.tap(findTestObject('Calculator/Button_Perkalian'), 0)

Mobile.tap(findTestObject('Calculator/Button_5'), 0)

Mobile.tap(findTestObject('Calculator/Button_equal to'), 0)

Mobile.delay(30, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Calculator/Button_2'), 0)

Mobile.tap(findTestObject('Calculator/Button_Tambah'), 0)

Mobile.tap(findTestObject('Calculator/Button_3'), 0)

Mobile.tap(findTestObject('Calculator/Button_equal to'), 0)

