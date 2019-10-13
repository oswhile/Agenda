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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:81/Default.aspx')

WebUI.setText(findTestObject('Page_Coaching/input_Usuario_txt_usuario'), 'root')

WebUI.setEncryptedText(findTestObject('Page_Coaching/input_Contrasea_txt_pass'), 'mM0VwRptd7w=')

WebUI.click(findTestObject('Page_Coaching/input__btn_ingresar'))

WebUI.click(findTestObject('Page_Untitled Page/a_Areas'))

WebUI.setText(findTestObject('Object Repository/Page_Asesoria Legal/input_Eliminar_ctl00ContentPlaceHolder1GridView1ctl06txt_nombre'), 
    'Prueba')

WebUI.setText(findTestObject('Object Repository/Page_Asesoria Legal/input_Eliminar_ctl00ContentPlaceHolder1GridView1ctl06txt_descripcion'), 
    'Prueba')

WebUI.sendKeys(findTestObject('Page_Asesoria Legal/input_Eliminar_ctl00ContentPlaceHolder1GridView1ctl06txt_descripcion'), 
    Keys.chord(Keys.ENTER))

WebUI.delay(2)

WebUI.click(findTestObject('Page_Asesoria Legal/a_Actualizar'))

WebUI.click(findTestObject('Object Repository/Page_Asesoria Legal/a_Eliminar'))

WebUI.click(findTestObject('Object Repository/Page_Asesoria Legal/a_Cargos'))

WebUI.setText(findTestObject('Page_Asesoria Legal/input_Eliminar_ctl00ContentPlaceHolder1GridView1ctl05txt_nombre_cargo'), 
    'Prueba')

WebUI.setText(findTestObject('Page_Asesoria Legal/input_Eliminar_ctl00ContentPlaceHolder1GridView1ctl05txt_descripcion_cargo'), 
    'Prueba')

WebUI.sendKeys(findTestObject('Page_Asesoria Legal/input_Eliminar_ctl00ContentPlaceHolder1GridView1ctl05txt_descripcion_cargo'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Page_Asesoria Legal/a_Actualizar_cargo'))

WebUI.click(findTestObject('Page_Asesoria Legal/a_Eliminar_cargo'))

WebUI.click(findTestObject('Object Repository/Page_Asesoria Legal/a_Usuarios'))

WebUI.setText(findTestObject('Object Repository/Page_Asesoria Legal/input_IngrPass_ctl00ContentPlaceHolder1GridView1ctl05txt_nombre'), 
    'Prueba')

WebUI.setText(findTestObject('Object Repository/Page_Asesoria Legal/input_Ing                     Nombre_ctl00ContentPlaceHolder1GridView1ctl05txt_carnet'), 
    '123')

WebUI.setText(findTestObject('Object Repository/Page_Asesoria Legal/input_IngrCarnet_ctl00ContentPlaceHolder1GridView1ctl05txt_login'), 
    'prueba')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Asesoria Legal/input_Ingr Login_ctl00ContentPlaceHolder1GridView1ctl05txt_pass'), 
    'tK36OE9ZDPo=')

WebUI.sendKeys(findTestObject('Object Repository/Page_Asesoria Legal/input_Ingr Login_ctl00ContentPlaceHolder1GridView1ctl05txt_pass'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/Page_Asesoria Legal/input_Eliminar_ctl00ContentPlaceHolder1GridView1ctl05TextBox1'), 
    'Pruebita')

WebUI.click(findTestObject('Object Repository/Page_Asesoria Legal/a_Actualizar_2'))

WebUI.click(findTestObject('Object Repository/Page_Asesoria Legal/a_Eliminar_2'))

