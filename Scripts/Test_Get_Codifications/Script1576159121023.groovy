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

response = WS.sendRequest(findTestObject('getCodifications', [('api_host') : GlobalVariable.api_host, ('api_port') : GlobalVariable.api_port]))

WS.verifyResponseStatusCode(response, 200)

WS.verifyElementPropertyValue(response, '[0].codification', 'ORI-TRM')

WS.verifyElementPropertyValue(response, '[0].description', 'Origine du terme')

WS.verifyElementPropertyValue(response, '[0].fonction_v2', null)

WS.verifyElementPropertyValue(response, '[0].origine', 'V2')

WS.verifyElementPropertyValue(response, '[0].propriete_associee', null)

