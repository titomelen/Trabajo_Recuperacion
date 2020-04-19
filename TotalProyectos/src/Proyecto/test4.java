package Proyecto;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class test4 {

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
	
	@DisplayName(value = "Prueba de caja negra con valor limite superior")
	@Test
	//El valor limite va a ser el notable, el valor debe estar entre 7 y 9, pero sin llegar a 9.
	void test1funcion4() {
		assertEquals("Notable", totalfunciones.funcion4(new int[] {8,8,8,8,8,8}));
	}
	
	@DisplayName(value = "Prueba de caja negra con valor limite inferior")
	@Test
	//El valor limite va a ser el suficiente, el valor debe estar entre 5 y 6, pero sin llegar a 6.
	void test2funcion4() {
		assertEquals("Suficiente", totalfunciones.funcion4(new int[] {5,5,5,5,5,5}));
	}
	
	@DisplayName(value = "Prueba de caja negra con valor aleatorio")
	@Test
	void test3funcion4() {
		assertEquals("Bien", totalfunciones.funcion4(new int[] {5,1,6,9,8,7}));
	}
	
	@DisplayName(value = "Prueba de caja negra con valor nulo")
	@Test
	void test4funcion4() {
		assertEquals(null, totalfunciones.funcion4(null));
	}
	
	//PRUEBAS DE CAJA BLANCA
	
	@DisplayName(value = "Prueba de caja blanca de cobertura de decision")
	@Test
	//Vamos a calcular la nota media de mis notas del segundo trimestre, que saldrá un 6 (Bien).
	void test5funcion4() {
		assertEquals("Bien", totalfunciones.funcion4(new int[] {3,9,3,4,9,8}));
	}
	
	@DisplayName(value = "Prueba de caja blanca de cobertura de decision")
	@Test
	//Vamos a calcular la nota media de mis notas del segundo trimestre si hubiera sacado 2 puntos más en las notas suspensas, que saldría un 7 (Notable).
	void test6funcion4() {
		assertEquals("Notable", totalfunciones.funcion4(new int[] {5,9,5,6,9,8}));
	}
	
	@DisplayName(value = "Prueba de caja blanca de cobertura de decision")
	@Test
	//Vamos a calcular la nota media sea Insuficiente, aunque tenga alguna nota con un 5.
	void test7funcion4() {
		assertEquals("Insuficiente", totalfunciones.funcion4(new int[] {3,5,5,4,4,2}));
	}
	
	@DisplayName(value = "Prueba de caja blanca de cobertura de decision")
	@Test
	//Vamos a poner todas las notas negativas para que salga null, ya que no puede haber notas negativas.
	void test8funcion4() {
		assertEquals(null, totalfunciones.funcion4(new int[] {-3,-9,-3,-4,-9,-8}));
	}

}
