package Proyecto;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class test5 {

	static totalfunciones prueba = null;
	static int pruebasRealizadas = 0;
	
	
	@BeforeAll
	static void prepararPruebas() {
	    System.out.println("Preparando Tests");
	    prueba = new totalfunciones();
	}

	@BeforeEach
	private void preparaPruebaEjecutar() {
	    pruebasRealizadas++;
	    System.out.println("Ejecutando test " + pruebasRealizadas);
	}

	@AfterEach
	private void terminadaPrueba() {
	    System.out.println("Se ha ejecutado el test: " + pruebasRealizadas);
	}

	@AfterAll
	static void terminarPruebas() {
	    System.out.println("Se ha terminado de ejecutar todas las pruebas");
	    prueba = null;
	}
	
	//PRUEBAS DE CAJA NEGRA
	
	@DisplayName(value = "Prueba de caja negra con un caracter")
	@Test
	void test1funcion5() {
		assertEquals(0, totalfunciones.funcion5("J", 1, 9));
	}
	
	@DisplayName(value = "Prueba de caja negra con valor vacio")
	@Test
	void test2funcion5() {
		assertEquals(0, totalfunciones.funcion5("", 1, 9));
	}
	
	@DisplayName(value = "Prueba de caja negra con valor aleatorio")
	@Test
	void test3funcion5() {
		assertEquals(46480702, totalfunciones.funcion5("+", 1245456, 45235246));
	}
	
	@DisplayName(value = "Prueba de caja negra con valor limite inferior")
	@Test
	//He buscado por internet cual sería el valor límite entero de positivos y negativos y es -2147483648 al 2147483647
	void test4funcion5() {
		assertEquals(-1, totalfunciones.funcion5("+", -2147483648, 2147483647));
	}
	
	//PRUEBAS DE CAJA BLANCA
	
	@DisplayName(value = "Prueba de caja blanca con cobertura de decision")
	@Test
	//Vamos a hacer que se sumen los dos valores por lo cual el simbolo va a ser "+", los números son el día y mes de nacimiento
	void test5funcion5() {
		assertEquals(10, totalfunciones.funcion5("+", 1, 9));
	}
	
	@DisplayName(value = "Prueba de caja blanca con cobertura de decision")
	@Test
	//Vamos a hacer que se resten los dos valores por lo cual el simbolo va a ser "-", los números son el día y mes de nacimiento
	void test6funcion5() {
		assertEquals(-8, totalfunciones.funcion5("-", 1, 9));
	}
	
	@DisplayName(value = "Prueba de caja blanca con cobertura de decision")
	@Test
	//Vamos a hacer que se multipliquen los dos valores por lo cual el simbolo va a ser "*", los números son el día y mes de nacimiento
	void test7funcion5() {
		assertEquals(9, totalfunciones.funcion5("*", 1, 9));
	}
	
	@DisplayName(value = "Prueba de caja blanca con cobertura de decision")
	@Test
	//Vamos a hacer que el valor que devuelva sea 0 por lo que el simbolo no podrá ser "+", "-", "*", los números son el día y mes de nacimiento
	void test8funcion5() {
		assertEquals(0, totalfunciones.funcion5("K", 1, 9));
	}

}
