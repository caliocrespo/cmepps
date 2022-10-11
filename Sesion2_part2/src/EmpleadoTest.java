import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmpleadoTest {
	float horasExtra,ventaMes,nominaBruta;
	
	@BeforeEach
	void setUp() throws Exception {
	
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testCalculoNominaBrutaEncargado() {
		horasExtra=10;
		ventaMes=1100;
		float valorEsperado=2900;
		float resultado=Empleado.calculoNominaBruta(Empleado.TipoEmpleado.Encargado, ventaMes, horasExtra);
		assertEquals(valorEsperado, resultado);
	}
	
	@Test
	void testCalculoNominaBrutaVendedor() {
		horasExtra=10;
		ventaMes=1100;
		float valorEsperado=2400;
		float resultado=Empleado.calculoNominaBruta(Empleado.TipoEmpleado.Vendedor, ventaMes, horasExtra);
		assertEquals(valorEsperado, resultado);
	}
	
	@Test
	void testCalculoNominaBrutapPrima1(){
		horasExtra=10;
		ventaMes=1500;
		float valorEsperado=3000;
		float resultado=Empleado.calculoNominaBruta(Empleado.TipoEmpleado.Encargado, ventaMes, horasExtra);
		assertEquals(valorEsperado, resultado);
	}
	
	@Test
	void testCalculoNominaBrutapPrima2(){
		horasExtra=10;
		ventaMes=1000;
		float valorEsperado=2900;
		float resultado=Empleado.calculoNominaBruta(Empleado.TipoEmpleado.Encargado, ventaMes, horasExtra);
		assertEquals(valorEsperado, resultado);
	}
	
	@Test
	void testCalculoNominaBrutapSinPrima(){
		horasExtra=10;
		ventaMes=800;
		float valorEsperado=2800;
		float resultado=Empleado.calculoNominaBruta(Empleado.TipoEmpleado.Encargado, ventaMes, horasExtra);
		assertEquals(valorEsperado, resultado);
	}
	
	@Test
	void testCalculoNominaBrutaConExtra() {
		horasExtra=10;
		ventaMes=1000;
		float valorEsperado=2400;
		float resultado=Empleado.calculoNominaBruta(Empleado.TipoEmpleado.Vendedor, ventaMes, horasExtra);
		assertEquals(valorEsperado, resultado);
	}
	
	@Test
	void testCalculoNominaBrutaSinExtra() {
		horasExtra=0;
		ventaMes=1000;
		float valorEsperado=2100;
		float resultado=Empleado.calculoNominaBruta(Empleado.TipoEmpleado.Vendedor, ventaMes, horasExtra);
		assertEquals(valorEsperado, resultado);
	}

	@Test
	void testCalculoNominaNetaSinRetención() {
		float valorEsperado=2099;
		nominaBruta=2099;
		float resultado=Empleado.calculoNominaNeta(nominaBruta);
		assertEquals(valorEsperado, resultado);

	}
	
	void testCalculoNominaNetaRetención1() {
		float valorEsperado=1870;
		nominaBruta=2200;
		float resultado=Empleado.calculoNominaNeta(nominaBruta);
		assertEquals(valorEsperado, resultado);

	}
	
	void testCalculoNominaNetaRetención2() {
		float valorEsperado=2132;
		nominaBruta=2600;
		float resultado=Empleado.calculoNominaNeta(nominaBruta);
		assertEquals(valorEsperado, resultado);

	}

}
