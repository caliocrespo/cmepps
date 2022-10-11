import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculadoraTest {
	int value1;
	int value2;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		value2=2;
		value1=8;
	}

	@AfterEach
	void tearDown() throws Exception {
		value1=0;
		value2=0;
	}

	@Test
	void testSumar() {
		int resultado=10;
		int sum = Calculadora.sumar(value1, value2);
		assertEquals(resultado, sum);
	}

	@Test
	void testMultiplicar() {
		int resultado=16;
		int mul = Calculadora.multiplicar(value1, value2);
		assertEquals(resultado, mul);
	}

	@Test
	void testRestar() {
		int resultado=6;
		int res = Calculadora.restar(value1, value2);
		assertEquals(resultado, res);
	}

	@Test
	void testDividir() {
		int resultado=4;
		int div = Calculadora.dividir(value1, value2);
		assertEquals(resultado, div);
		resultado=-1;
		div=Calculadora.dividir(value1, 0);
		assertEquals(resultado, div);
	}
	
	@Test
	void testFallaSumar() {
		int resultado=11;
		int sum = Calculadora.sumar(value1, value2);
		assertNotEquals(resultado, sum);
	}

	@Test
	void testFallaMultiplicar() {
		int resultado=15;
		int mul = Calculadora.multiplicar(value1, value2);
		assertNotEquals(resultado, mul);
	}

	@Test
	void testFallaRestar() {
		int resultado=7;
		int res = Calculadora.restar(value1, value2);
		assertNotEquals(resultado, res);
	}

	@Test
	void testFallaDividir() {
		int resultado=2;
		int div = Calculadora.dividir(value1, value2);
		assertNotEquals(resultado, div);
		resultado=0;
		div=Calculadora.dividir(value1, 0);
		assertNotEquals(resultado, div);
	}

}
