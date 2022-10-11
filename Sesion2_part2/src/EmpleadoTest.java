import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmpleadoTest {
	float horasExtra,ventaMes;
	
	@BeforeEach
	void setUp() throws Exception {
	
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testCalculoNominaBrutaEncargado1100() {
		horasExtra=0;
		ventaMes=1100;
		float valorEsperado=2600;
		float resutado=Empleado.calculoNominaBruta(Empleado.TipoEmpleado.Encargado, ventaMes, horasExtra);
		assertEquals(valorEsperado, resutado);
	}
	
	@Test
	void testCalculoNominaBrutaVendedor1100() {
		horasExtra=0;
		ventaMes=1100;
		float valorEsperado=2100;
		float resutado=Empleado.calculoNominaBruta(Empleado.TipoEmpleado.Vendedor, ventaMes, horasExtra);
		assertEquals(valorEsperado, resutado);
	}
	
	@Test
	void testCalculoNominaBrutaExtras(){
		horasExtra=10;
		ventaMes=800;
		float valorEsperado=2800;
		float resutado=Empleado.calculoNominaBruta(Empleado.TipoEmpleado.Encargado, ventaMes, horasExtra);
		assertEquals(valorEsperado, resutado);
	}
	
	@Test
	void testCalculoNominaBrutaSinExtra1600() {
		
	}

	@Test
	void testCalculoNominaNeta() {
		fail("Not yet implemented");
	}

}
