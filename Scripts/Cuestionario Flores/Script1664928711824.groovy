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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://diego-cuestionario-app.netlify.app/')

WebUI.setText(findTestObject('Object Repository/CuestionarioAutomatizado-Flores/input_Cual es tu nombre_question1'), 'Omar Chocojay')

WebUI.setText(findTestObject('Object Repository/CuestionarioAutomatizado-Flores/input_Cual es tu edad_question2'), '17')

WebUI.setText(findTestObject('Object Repository/CuestionarioAutomatizado-Flores/input_Cual es tu grado academico_question3'), '6to perito')

WebUI.click(findTestObject('Object Repository/CuestionarioAutomatizado-Flores/button_Siguiente'))

WebUI.setText(findTestObject('Object Repository/CuestionarioAutomatizado-Flores/input_Te gusta escuchar musica_question4'), 'Si')

WebUI.setText(findTestObject('Object Repository/CuestionarioAutomatizado-Flores/input_Si la tienes, Cual es tu apliacion fa_6815f6'), 
    'rock')

WebUI.setText(findTestObject('Object Repository/CuestionarioAutomatizado-Flores/input_Que tan frecuentemente escuchas music_8c5fea'), 
    '2-3 horas')

WebUI.click(findTestObject('Object Repository/CuestionarioAutomatizado-Flores/button_Siguiente'))

WebUI.setText(findTestObject('Object Repository/CuestionarioAutomatizado-Flores/input_Te gustaria aprender a hacer musica_q_2a1ec1'), 
    'si')

WebUI.setText(findTestObject('Object Repository/CuestionarioAutomatizado-Flores/input_Te gustaria aprender a tocar un instr_d03d9d'), 
    'si')

WebUI.setText(findTestObject('Object Repository/CuestionarioAutomatizado-Flores/input_Has estado en una banda anteriormente_7274a5'), 
    'si')

WebUI.click(findTestObject('Object Repository/CuestionarioAutomatizado-Flores/button_Siguiente'))

WebUI.setText(findTestObject('Object Repository/CuestionarioAutomatizado-Flores/input_Te gustaria escribir la letra de una _3f5be9'), 
    'si')

WebUI.setText(findTestObject('Object Repository/CuestionarioAutomatizado-Flores/input_Te gusta ir a conciertos_question11'), 'si')

WebUI.setText(findTestObject('Object Repository/CuestionarioAutomatizado-Flores/input_Sueles escuchar podcasts_question12'), 'si')

WebUI.click(findTestObject('Object Repository/CuestionarioAutomatizado-Flores/button_Siguiente'))

WebUI.setText(findTestObject('Object Repository/CuestionarioAutomatizado-Flores/input_Te gusta escuchar musica mientras tra_ca246b'), 
    'si')

WebUI.setText(findTestObject('Object Repository/CuestionarioAutomatizado-Flores/input_Cual es el genero musical que mas te _502ddc'), 
    'Rock')

WebUI.setText(findTestObject('Object Repository/CuestionarioAutomatizado-Flores/input_Cual es tu artista favorito_question15'), 'Marilyn ')

WebUI.click(findTestObject('Object Repository/CuestionarioAutomatizado-Flores/button_Enviar'))

WebUI.click(findTestObject('Object Repository/CuestionarioAutomatizado-Flores/button_Enviar otra respuesta'))

