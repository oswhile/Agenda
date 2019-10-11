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

WebUI.click(findTestObject('ORAgenda/a_Agenda'))

WebUI.setText(findTestObject('ORAgenda/input_Codigo_ctl00ContentPlaceHolder1TextBox1'), Codigo)

WebUI.click(findTestObject('ORAgenda/input_Cerrar Sesion_ctl00ContentPlaceHolder1btn_buscar'))

WebUI.delay(2)

WebUI.click(findTestObject('ORAgenda/input_Fecha expedicin_ctl00ContentPlaceHolder1TextBox5'))

WebUI.setText(findTestObject('ORAgenda/input_Fecha expedicin_ctl00ContentPlaceHolder1TextBox5'), FechaExpedido)

WebUI.setText(findTestObject('ORAgenda/input_Fvencimiento_ctl00ContentPlaceHolder1TextBox6'), FechaVencemiento)

WebUI.setText(findTestObject('ORAgenda/input_Nro de NIT_ctl00ContentPlaceHolder1TextBox7'), NitCliente)

WebUI.selectOptionByValue(findTestObject('ORAgenda/select_naturaljuridicano juridica'), TipoPersona, true)

WebUI.click(findTestObject('ORAgenda/input_Fecha de nacimiento_ctl00ContentPlaceHolder1TextBox9'))

WebUI.setText(findTestObject('ORAgenda/input_Fecha de nacimiento_ctl00ContentPlaceHolder1TextBox9'), FechaNacimiento)

WebUI.selectOptionByValue(findTestObject('ORAgenda/select_HombreMujer'), Sexo, true)

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('ORAgenda/select_SolteroCasadoSolteraCasada'), EstadoCivil, true)

WebUI.selectOptionByValue(findTestObject('ORAgenda/select_BolivianoPeruanoChilenoArgentinoCubanoBrasileroCubanoVenezolanoAustraliano'), 
    Nacionalidad, true)

WebUI.selectOptionByValue(findTestObject('ORAgenda/select_PrimariaSecundariaTecnico Profesional'), NivelEducacion, true)

WebUI.setText(findTestObject('ORAgenda/input_Nro de dependientes_ctl00ContentPlaceHolder1TextBox14'), NroDependientes)

WebUI.click(findTestObject('ORAgenda/input_Cerrar Sesion_ctl00ContentPlaceHolder1btn_grabar'))

WebUI.delay(3)

WebUI.click(findTestObject('ORAgenda/input_Cliente_ctl00ContentPlaceHolder1btn2'))

WebUI.delay(2)

WebUI.setText(findTestObject('ORAgenda/input_Direccion envio_ctl00ContentPlaceHolder1TextBox21'), DireccionEnvio)

WebUI.setText(findTestObject('ORAgenda/input_Dir domicilio_ctl00ContentPlaceHolder1TextBox22'), DireccionDomicilio)

WebUI.setText(findTestObject('ORAgenda/input_Zona_ctl00ContentPlaceHolder1TextBox23'), Zona)

WebUI.setText(findTestObject('ORAgenda/input_Ref de ubicacion_ctl00ContentPlaceHolder1TextBox24'), RefUbicacion)

WebUI.setText(findTestObject('ORAgenda/input_Telf  domicilio_ctl00ContentPlaceHolder1TextBox25'), TelfDomicilio)

WebUI.setText(findTestObject('ORAgenda/input_Telf celular_ctl00ContentPlaceHolder1TextBox26'), Celular)

WebUI.setText(findTestObject('ORAgenda/input_Telf Oficina_ctl00ContentPlaceHolder1TextBox27'), TelfOficina)

WebUI.setText(findTestObject('ORAgenda/input_Interno_ctl00ContentPlaceHolder1TextBox28'), TelfInterno)

WebUI.setText(findTestObject('ORAgenda/input_Nro de casilla_ctl00ContentPlaceHolder1TextBox29'), NroCasilla)

WebUI.setText(findTestObject('ORAgenda/input_Nro de telex_ctl00ContentPlaceHolder1TextBox30'), NroTeleFax)

WebUI.setText(findTestObject('ORAgenda/input_Nro de fax_ctl00ContentPlaceHolder1TextBox31'), NroFax)

WebUI.setText(findTestObject('ORAgenda/input_E-mail_ctl00ContentPlaceHolder1TextBox32'), Email)

WebUI.setText(findTestObject('ORAgenda/input_Ciudad_ctl00ContentPlaceHolder1TextBox33'), Ciudad)

WebUI.click(findTestObject('ORAgenda/input_Cerrar Sesion_ctl00ContentPlaceHolder1btn_grabar'))

WebUI.click(findTestObject('ORAgenda/input_Cliente_ctl00ContentPlaceHolder1btn3'))

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('ORAgenda/select_ComercioTransporteConstruccionOtros'), Actividad, true)

WebUI.selectOptionByValue(findTestObject('ORAgenda/select_ArquitectoContador'), Profesion, true)

WebUI.selectOptionByValue(findTestObject('ORAgenda/select_Empleado de empresaEmpleado Independiente'), TipoEmpleado, true)

WebUI.selectOptionByValue(findTestObject('ORAgenda/select_GerenteGarzonPortero'), Cargo, true)

WebUI.setText(findTestObject('ORAgenda/input_Eliminar_ctl00ContentPlaceHolder1grid_ocupacionctl03TextBox43'), NombreEmpresa)

WebUI.setText(findTestObject('ORAgenda/input_Eliminar_ctl00ContentPlaceHolder1grid_ocupacionctl03TextBox44'), SiglaEmpresa)

WebUI.setText(findTestObject('ORAgenda/input_Eliminar_ctl00ContentPlaceHolder1grid_ocupacionctl03TextBox45'), FechaConstitucion)

WebUI.setText(findTestObject('ORAgenda/input_Fecha_ctl00ContentPlaceHolder1grid_ocupacionctl03TextBox46'), OcupaDireccion)

WebUI.setText(findTestObject('ORAgenda/input_Fecha_ctl00ContentPlaceHolder1grid_ocupacionctl03TextBox47'), OcupaZona)

WebUI.setText(findTestObject('ORAgenda/input_Fecha_ctl00ContentPlaceHolder1grid_ocupacionctl03TextBox48'), OcupaReferencias)

WebUI.setText(findTestObject('ORAgenda/input_Fecha_ctl00ContentPlaceHolder1grid_ocupacionctl03TextBox56'), OcupaCiudad)

WebUI.setText(findTestObject('ORAgenda/input_Fecha_ctl00ContentPlaceHolder1grid_ocupacionctl03TextBox49'), OcupaTelefono)

WebUI.setText(findTestObject('ORAgenda/input_Fecha_ctl00ContentPlaceHolder1grid_ocupacionctl03TextBox51'), NombreJefe)

WebUI.setText(findTestObject('ORAgenda/input_Fecha_ctl00ContentPlaceHolder1grid_ocupacionctl03TextBox52'), FechaIngreso)

WebUI.setText(findTestObject('ORAgenda/input_Fecha_ctl00ContentPlaceHolder1grid_ocupacionctl03TextBox53'), Antiguedad)

WebUI.setText(findTestObject('ORAgenda/input_Fecha_ctl00ContentPlaceHolder1grid_ocupacionctl03TextBox54'), NitEmpresa)

WebUI.setText(findTestObject('ORAgenda/input_Fecha_ctl00ContentPlaceHolder1grid_ocupacionctl03TextBox55'), PadronMunicipal)

WebUI.click(findTestObject('ORAgenda/a_Insertar'))

