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

WebUI.navigateToUrl('https://animated-meringue-6b6fe5.netlify.app/')

WebUI.setText(findTestObject('Object Repository/CuestionaroAutomatizado-Patzan/input_Nombres_nombres'), 'Omar')

WebUI.setText(findTestObject('Object Repository/CuestionaroAutomatizado-Patzan/input_Apellidos_apellidos'), 'Chocojay')

WebUI.setText(findTestObject('Object Repository/CuestionaroAutomatizado-Patzan/input_Nmero de telfono_telefono'), '123456')

WebUI.setText(findTestObject('Object Repository/CuestionaroAutomatizado-Patzan/input_Correo electrnico_correo'), 'omarmorales@gmail.com')

WebUI.click(findTestObject('Object Repository/CuestionaroAutomatizado-Patzan/button_Siguiente'))

WebUI.setText(findTestObject('Object Repository/CuestionaroAutomatizado-Patzan/input_Cules son tus actividades favoritas_a_33a5f3'), 
    'Comer')

WebUI.setText(findTestObject('Object Repository/CuestionaroAutomatizado-Patzan/input_Cuanto tiempo le dedicas a estas acti_ea2d64'), 
    '3-4 horas')

WebUI.setText(findTestObject('Object Repository/CuestionaroAutomatizado-Patzan/input_Qu actividades te llaman la atencin y_0f44fa'), 
    'Programar')

WebUI.setText(findTestObject('Object Repository/CuestionaroAutomatizado-Patzan/input_Que actividades te gustara dejar de h_ca3de5'), 
    'procasticar')

WebUI.click(findTestObject('Object Repository/CuestionaroAutomatizado-Patzan/button_Siguiente'))

WebUI.click(findTestObject('Object Repository/CuestionaroAutomatizado-Patzan/input_Juegos_gustar'))

WebUI.setText(findTestObject('Object Repository/CuestionaroAutomatizado-Patzan/input_Qu videojuegos te gustan_juegos'), 'Valorant')

WebUI.setText(findTestObject('Object Repository/CuestionaroAutomatizado-Patzan/input_Cuanto tiempo le dedicas a estas acti_ea2d64'), 
    '2-3 horas')

WebUI.setText(findTestObject('Object Repository/CuestionaroAutomatizado-Patzan/input_Qu juegos te llaman la atencin de pro_fd0829'), 
    'MMO\'s')

WebUI.click(findTestObject('Object Repository/CuestionaroAutomatizado-Patzan/button_Siguiente'))

WebUI.click(findTestObject('Object Repository/CuestionaroAutomatizado-Patzan/input_Juegos_gustar'))

WebUI.setText(findTestObject('Object Repository/CuestionaroAutomatizado-Patzan/input_Qu pelculas te gustan_peliculas'), 'Terror')

WebUI.setText(findTestObject('Object Repository/CuestionaroAutomatizado-Patzan/input_Cuanto tiempo le dedicas a esta activ_bf086c'), 
    '1 hora')

WebUI.setText(findTestObject('Object Repository/CuestionaroAutomatizado-Patzan/input_Que pelculas te llaman la atencin_interes'), 
    'de acción')

WebUI.click(findTestObject('Object Repository/CuestionaroAutomatizado-Patzan/button_Siguiente'))

WebUI.click(findTestObject('Object Repository/CuestionaroAutomatizado-Patzan/input_Juegos_gustar'))

WebUI.setText(findTestObject('Object Repository/CuestionaroAutomatizado-Patzan/input_Que series te gustan_series'), 'Accion y surrealismo')

WebUI.setText(findTestObject('Object Repository/CuestionaroAutomatizado-Patzan/input_Cuanto tiempo le dedicas a esta activ_bf086c'), 
    '0 horas')

WebUI.setText(findTestObject('Object Repository/CuestionaroAutomatizado-Patzan/input_Que series te llaman la atencin_interes'), 
    'Scorpion')

WebUI.click(findTestObject('Object Repository/CuestionaroAutomatizado-Patzan/button_Enviar'))

WebUI.click(findTestObject('Object Repository/CuestionaroAutomatizado-Patzan/button_Enviar otra respuesta'))

