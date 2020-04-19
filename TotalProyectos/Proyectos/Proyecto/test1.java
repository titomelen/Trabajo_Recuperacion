package Proyecto;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class test1 {

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
	
	@DisplayName(value = "Prueba de caja negra de limite inferior")
	@Test
	void test1funcion1() {
		assertEquals(true, totalfunciones.funcion1("Erase una vez un bético que vio ganar al betis la champi"));
	}
	
	@DisplayName(value = "Prueba de caja negra de limite inferior -1")
	@Test
	void test2funcion1() {
		assertEquals(false, totalfunciones.funcion1("Erase una vez un bético que vio ganar al betis la champ"));
	}
	
	@DisplayName(value = "Prueba de caja negra de valor nulo")
	@Test
	void test3funcion1() {
		assertEquals(null, totalfunciones.funcion1(""));
	}
	
	@DisplayName(value = "Prueba de caja negra con equivalentes")
	@Test
	//Esta prueba es de caso positivo porque supera el total de vocales mi edad.
	void test4funcion1() {
		assertEquals(true, totalfunciones.funcion1("Erase una vez un bético que vio ganar al betis la champions y no quiso despertar nunca"));
	}
	
	
	
	//PRUEBAS DE CAJA BLANCA
	
	@DisplayName(value = "Prueba de caja blanca de cobertura de condiciones")
	@Test
	//La condición será que el valor de mi edad (22) será igual al numero de vocales
	void test5funcion1() {
		assertEquals(true, totalfunciones.funcion1("Esta cuarentena se esta haciendo demasiado larga ya."));
	}
	
	@DisplayName(value = "Prueba de caja blanca de cobertura de condiciones")
	@Test
	//La condición será que el valor de mi edad (22) será mayor al numero de vocales
	void test6funcion1() {
		assertEquals(false, totalfunciones.funcion1("Javier"));
	}
	
	@DisplayName(value = "Prueba de caja blanca de cobertura de decisiones")
	@Test
	//En esta prueba haremos que salga true, para ello vamos a hacer que el total de vocales superen mi edad, sea pues 22.
	void test7funcion1() {
		assertEquals(true, totalfunciones.funcion1("Esta cuarentena se esta haciendo demasiado larga ya, alguien debería ir al futuro a por la cura para acelerar el proceso."));
	}
	
	@DisplayName(value = "Prueba de caja blanca de cobertura de decisiones")
	@Test
	//En esta prueba haremos que salga false, para ello vamos a hacer que el total de vocales no superen mi edad, sea pues 22.
	void test8funcion1() {
		assertEquals(false, totalfunciones.funcion1("esta cuarentena se esta haciendo demasiado larga"));
	}
	
}