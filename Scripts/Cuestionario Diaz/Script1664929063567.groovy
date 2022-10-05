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

WebUI.navigateToUrl('https://monumental-lolly-558dda.netlify.app/home')

WebUI.click(findTestObject('Object Repository/CuestionarioAutomarizado-Diaz/a_Vamos'))

WebUI.setText(findTestObject('Object Repository/CuestionarioAutomarizado-Diaz/input_Nombres_names'), 'Omar')

WebUI.setText(findTestObject('Object Repository/CuestionarioAutomarizado-Diaz/input_Apellidos_surnames'), 'Chocojay')

WebUI.setText(findTestObject('Object Repository/CuestionarioAutomarizado-Diaz/input_Correo_r2'), 'omarchocojay@gmail.com')

WebUI.setText(findTestObject('Object Repository/CuestionarioAutomarizado-Diaz/input_Telfono_phone'), '12345678')

WebUI.setText(findTestObject('Object Repository/CuestionarioAutomarizado-Diaz/input_Direccin_address'), '1-47 zona 5')

WebUI.setText(findTestObject('Object Repository/CuestionarioAutomarizado-Diaz/input_DPI_DPI'), '1234560101')

WebUI.setText(findTestObject('Object Repository/CuestionarioAutomarizado-Diaz/input_Tutor legalEncargad_tutor'), 'Norma Morales')

WebUI.click(findTestObject('Object Repository/CuestionarioAutomarizado-Diaz/a_Siguiente'))

WebUI.setText(findTestObject('Object Repository/CuestionarioAutomarizado-Diaz/input_NombresApellidos Madre_nameM'), 'Norma Morales')

WebUI.setText(findTestObject('Object Repository/CuestionarioAutomarizado-Diaz/input_NombresApellidos Padre_nameF'), 'José Chocojay')

WebUI.setText(findTestObject('Object Repository/CuestionarioAutomarizado-Diaz/input_Telfono de la Madre_phoneM'), '12345678')

WebUI.click(findTestObject('Object Repository/CuestionarioAutomarizado-Diaz/div_Telfono del PadreTelfono del Padre'))

WebUI.setText(findTestObject('Object Repository/CuestionarioAutomarizado-Diaz/input_Telfono del Padre_phoneF'), '32165487')

WebUI.setText(findTestObject('Object Repository/CuestionarioAutomarizado-Diaz/input_Ocupacin de la Madre_workM'), 'Ama de casa')

WebUI.setText(findTestObject('Object Repository/CuestionarioAutomarizado-Diaz/input_Ocupacin del Padre_workF'), 'Piloto')

WebUI.setText(findTestObject('Object Repository/CuestionarioAutomarizado-Diaz/input_Cantidad de Hermans_brothers'), '3')

WebUI.click(findTestObject('Object Repository/CuestionarioAutomarizado-Diaz/a_Siguiente_1'))

WebUI.setText(findTestObject('Object Repository/CuestionarioAutomarizado-Diaz/input_Ingresos totales de la Madre_incomeM'), '000')

WebUI.click(findTestObject('Object Repository/CuestionarioAutomarizado-Diaz/label_Ingresos totales del Padre'))

WebUI.setText(findTestObject('Object Repository/CuestionarioAutomarizado-Diaz/input_Ingresos totales del Padre_incomeF'), '1500')

WebUI.setText(findTestObject('Object Repository/CuestionarioAutomarizado-Diaz/input_Ingresos totales de los hermanos_incomeB'), '2500')

WebUI.setText(findTestObject('Object Repository/CuestionarioAutomarizado-Diaz/input_Otro tipo de ingresos familiares_moreI'), '0000')

WebUI.click(findTestObject('Object Repository/CuestionarioAutomarizado-Diaz/a_Siguiente_1_2'))

WebUI.setText(findTestObject('Object Repository/CuestionarioAutomarizado-Diaz/input_Luz_light'), '200')

WebUI.setText(findTestObject('Object Repository/CuestionarioAutomarizado-Diaz/input_Agua_water'), '100')

WebUI.setText(findTestObject('Object Repository/CuestionarioAutomarizado-Diaz/input_Alimentacin_food'), '2500')

WebUI.setText(findTestObject('Object Repository/CuestionarioAutomarizado-Diaz/input_Colegiatura_tuition'), '650')

WebUI.click(findTestObject('Object Repository/CuestionarioAutomarizado-Diaz/a_Siguiente_1_2_3'))

WebUI.click(findTestObject('Object Repository/CuestionarioAutomarizado-Diaz/a_Enviar'))

WebUI.click(findTestObject('Object Repository/CuestionarioAutomarizado-Diaz/a_Envia otra respuesta'))

