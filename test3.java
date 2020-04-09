package Proyecto;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class test3 {

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
	void test1funcion3() {
		assertEquals(100, totalfunciones.funcion3(new int[] {18,19,20,21,22}));
	}
	
	@DisplayName(value = "Prueba de caja negra con valor limite inferior")
	@Test
	void test2funcion3() {
		assertEquals(65, totalfunciones.funcion3(new int[] {11,12,13,14,15}));
	}
	
	@DisplayName(value = "Prueba de caja negra con valor limite superior +1")
	@Test
	void test3funcion3() {
		assertEquals(22, totalfunciones.funcion3(new int[] {22,23,24,25,26}));
	}
	
	@DisplayName(value = "Prueba de caja negra con valor limite inferior -1")
	@Test
	void test4funcion3() {
		assertEquals(11, totalfunciones.funcion3(new int[] {7,8,9,10,11}));
	}
	
	//PRUEBAS DE CAJA BLANCA
	
	@DisplayName(value = "Prueba de caja blanca con cobertura de decisiones")
	@Test
	//Vamos a decidir que el valor que salga sea nulo, por lo que vamos a poner valores que esten por encima y por debajo de los limites.
	void test5funcion3() {
		assertEquals(0, totalfunciones.funcion3(new int[] {9,10,23,24,25}));
	}
	
	@DisplayName(value = "Prueba de caja blanca con cobertura de condicion")
	@Test
	//Vamos a hacer que ciertos valores no entren en el rango por lo cual saldrá el que si se encuentre dentro del mismo, sea pues 19.
	void test6funcion3() {
		assertEquals(19, totalfunciones.funcion3(new int[] {5,6,7,19,77}));
	}
	
	@DisplayName(value = "Prueba de caja blanca con cobertura de condicion")
	@Test
	//Vamos a hacer que los valores 19 y 22 se sumen, pero se ignoren los demás valores que no entren en el rango.
	void test7funcion3() {
		assertEquals(41, totalfunciones.funcion3(new int[] {5,6,19,22,123}));
	}
	
	@DisplayName(value = "Prueba de caja blanca con cobertura de condicion")
	@Test
	//Vamos a hacer que los valores sean negativos, por lo que no entraran en el rango y dará 0.
	void test8funcion3() {
		assertEquals(0, totalfunciones.funcion3(new int[] {-5,-6,-7,-20,-77}));
	}

}
