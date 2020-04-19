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
		assertEquals(0, totalfunciones.funcion3(new int[] {23,81,72,915,874}));
	}
	
	@DisplayName(value = "Prueba de caja negra con valor limite inferior -1")
	@Test
	void test4funcion3() {
		assertEquals(0, totalfunciones.funcion3(new int[] {-797,-865,-947,-1025,10}));
	}
	
	@DisplayName(value = "Prueba de caja negra con valor nulo")
	@Test
	void test5funcion3() {
		assertEquals(null, totalfunciones.funcion3(null));
	}
	
	
	//PRUEBAS DE CAJA BLANCA
	
	@DisplayName(value = "Prueba de caja blanca con cobertura de decisiones")
	@Test
	//Vamos a decidir que el valor que salga sea nulo, por lo que vamos a poner valores que esten por encima y por debajo de los limites.
	void test6funcion3() {
		assertEquals(0, totalfunciones.funcion3(new int[] {9,10,23,24,25}));
	}
	
	@DisplayName(value = "Prueba de caja blanca con cobertura de condicion")
	@Test
	//Vamos a hacer que ciertos valores no entren en el rango por lo cual saldr� el que si se encuentre dentro del mismo, sea pues 19.
	void test7funcion3() {
		assertEquals(19, totalfunciones.funcion3(new int[] {5,6,7,19,77}));
	}
	
	@DisplayName(value = "Prueba de caja blanca con cobertura de condicion")
	@Test
	//Vamos a hacer que los valores 19 y 22 se sumen, pero se ignoren los dem�s valores que no entren en el rango.
	void test8funcion3() {
		assertEquals(41, totalfunciones.funcion3(new int[] {5,6,19,22,123}));
	}
	
	@DisplayName(value = "Prueba de caja blanca con cobertura de condicion")
	@Test
	//Vamos a hacer que los valores sean negativos, por lo que no entraran en el rango y dar� 0.
	void test9funcion3() {
		assertEquals(0, totalfunciones.funcion3(new int[] {-5,-6,-7,-20,-77}));
	}

}
