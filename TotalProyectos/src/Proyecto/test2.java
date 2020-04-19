package Proyecto;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class test2 {

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
	
	@DisplayName(value = "Prueba de caja negra aleatoria con grupo equivalente")
	@Test
	//Probamos que la primera cadena tiene más consonantes.
	void test1funcion2() {
		assertEquals("Javier Melendez Contreras", totalfunciones.funcion2("Javier Melendez Contreras", "Pablo Garcia Perez"));
	}
	
	@DisplayName(value = "Prueba de caja negra aleatoria con grupo equivalente")
	@Test
	//Probamos que la segunda cadena tiene más consonantes.
	void test2funcion2() {
		assertEquals("Juan Jesus Garcia Perez de los reyes", totalfunciones.funcion2("Javier Melendez Contreras", "Juan Jesus Garcia Perez de los reyes"));
	}
	
	@DisplayName(value = "Prueba de caja negra con valor nulo")
	@Test
	//Probamos que las dos cadenas tienen el mismo número de consonantes.
	void test3funcion2() {
		assertEquals(null, totalfunciones.funcion2("Javier Melendez Contreras", "Pablo Melendez Contreras"));
	}
	
	@DisplayName(value = "Prueba de caja negra con valor vacio")
	@Test
	//Probamos que las dos cadenas no tienen valor, por lo que saldría nulo.
	void test4funcion2() {
		assertEquals(null, totalfunciones.funcion2("", ""));
	}
	
	
	//PRUEBAS DE CAJA BLANCA
	
	@DisplayName(value = "Prueba de caja blanca de cobertura de decisiones")
	@Test
	//La condición será que la primera cadena tendrá más consonantes que la segunda cadena
	void test5funcion2() {
		assertEquals("Dragon Ball", totalfunciones.funcion2("Dragon Ball", "One Piece"));
	}
	
	@DisplayName(value = "Prueba de caja blanca de cobertura de caminos")
	@Test
	//La primera cadena tendrá menos consonantes que la segunda cadena
	void test6funcion2() {
		assertEquals("Vegeta", totalfunciones.funcion2("Goku!!!", "Vegeta"));
	}

	@DisplayName(value = "Prueba de caja blanca de cobertura de caminos")
	@Test
	//La primera cadena tendrá más consonantes que la segunda cadena
	void test7funcion2() {
		assertEquals("Luffy", totalfunciones.funcion2("Luffy", "Zoro??"));
	}
	
	@DisplayName(value = "Prueba de caja blanca de cobertura de caminos")
	@Test
	//Tanto la primera como la segunda cadena tendrán las mismas consonantes
	void test8funcion2() {
		assertEquals(null, totalfunciones.funcion2("Javier Melendez", "Pablo Melendez"));
	}

}
