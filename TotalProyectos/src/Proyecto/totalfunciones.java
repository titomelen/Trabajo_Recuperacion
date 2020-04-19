package Proyecto;

public class totalfunciones {
	public static Boolean funcion1(String cadena) {

		Boolean resp = null;
		int edad = 22;
		int contador = 0;

		for (int i = 0; i < cadena.length(); i++) {
			if ((cadena.charAt(i) == 'a') || (cadena.charAt(i) == 'e') || (cadena.charAt(i) == 'i')
					|| (cadena.charAt(i) == 'o') || (cadena.charAt(i) == 'u') || (cadena.charAt(i) == 'A')
					|| (cadena.charAt(i) == 'E') || (cadena.charAt(i) == 'I') || (cadena.charAt(i) == 'O')
					|| (cadena.charAt(i) == 'U') || (cadena.charAt(i) == 'á')|| (cadena.charAt(i) == 'é')
					|| (cadena.charAt(i) == 'í')|| (cadena.charAt(i) == 'ó')|| (cadena.charAt(i) == 'ú')
					|| (cadena.charAt(i) == 'Á')|| (cadena.charAt(i) == 'É')|| (cadena.charAt(i) == 'Í')
					|| (cadena.charAt(i) == 'Ó')|| (cadena.charAt(i) == 'Ú')) {
				
				contador++;

				if (contador >= edad) {
					
					 resp = true;
					
				}else if(contador < edad){
					
					 resp = false;
				}
			}
		}
		return resp;
	}
	
	public static String funcion2(String cadena, String cadena2) {

		String resp = null;
		int contadorVocal = 0;
		int contadorVocal2 = 0;
		int contadorConso = 0;
		int contadorConso2 = 0;
		
		

		for (int i = 0; i < cadena.length(); i++) {
			if ((cadena.charAt(i) == 'a') || (cadena.charAt(i) == 'e') || (cadena.charAt(i) == 'i')
					|| (cadena.charAt(i) == 'o') || (cadena.charAt(i) == 'u') || (cadena.charAt(i) == 'A')
					|| (cadena.charAt(i) == 'E') || (cadena.charAt(i) == 'I') || (cadena.charAt(i) == 'O')
					|| (cadena.charAt(i) == 'U') || (cadena.charAt(i) == 'á')|| (cadena.charAt(i) == 'é')
					|| (cadena.charAt(i) == 'í')|| (cadena.charAt(i) == 'ó')|| (cadena.charAt(i) == 'ú')
					|| (cadena.charAt(i) == 'Á')|| (cadena.charAt(i) == 'É')|| (cadena.charAt(i) == 'Í')
					|| (cadena.charAt(i) == 'Ó')|| (cadena.charAt(i) == 'Ú')|| (cadena.charAt(i) == ':')
					|| (cadena.charAt(i) == ';')|| (cadena.charAt(i) == '.')|| (cadena.charAt(i) == ',')
					|| (cadena.charAt(i) == '¿')|| (cadena.charAt(i) == '?')|| (cadena.charAt(i) == '!')
					|| (cadena.charAt(i) == '¡')|| (cadena.charAt(i) == '=')) {

				contadorVocal++;
			}
			contadorConso = cadena.length() - contadorVocal;
		}
		
		for (int i = 0; i < cadena2.length(); i++) {
			if ((cadena2.charAt(i) == 'a') || (cadena2.charAt(i) == 'e') || (cadena2.charAt(i) == 'i')
					|| (cadena2.charAt(i) == 'o') || (cadena2.charAt(i) == 'u') || (cadena2.charAt(i) == 'A')
					|| (cadena2.charAt(i) == 'E') || (cadena2.charAt(i) == 'I') || (cadena2.charAt(i) == 'O')
					|| (cadena2.charAt(i) == 'U') || (cadena2.charAt(i) == 'á')|| (cadena2.charAt(i) == 'é')
					|| (cadena2.charAt(i) == 'í')|| (cadena2.charAt(i) == 'ó')|| (cadena2.charAt(i) == 'ú')
					|| (cadena2.charAt(i) == 'Á')|| (cadena2.charAt(i) == 'É')|| (cadena2.charAt(i) == 'Í')
					|| (cadena2.charAt(i) == 'Ó')|| (cadena2.charAt(i) == 'Ú')|| (cadena2.charAt(i) == ':')
					|| (cadena2.charAt(i) == ';')|| (cadena2.charAt(i) == '.')|| (cadena2.charAt(i) == ',')
					|| (cadena2.charAt(i) == '¿')|| (cadena2.charAt(i) == '?')|| (cadena2.charAt(i) == '!')
					|| (cadena2.charAt(i) == '¡')|| (cadena2.charAt(i) == '=')) {
				
				contadorVocal2++;
			}
			contadorConso2 = cadena2.length() - contadorVocal2;
		}
		
		if (contadorConso > contadorConso2) {
			
			resp = cadena;
			
		}
		else if(contadorConso < contadorConso2) {
			
			resp = cadena2;
			
		}
		else if(contadorConso == contadorConso2) {
			
			resp=null;
			
		}
		return resp;
	}
	
	public static Integer funcion3(int[] listaNumeros) {
		
		int edad = 22;
		int mitadEdad = 11;
		int resp = 0;
		
		if(listaNumeros == null) {
			return null;
		}
		
		for (int i = 0; i < listaNumeros.length; i++) {
			if (listaNumeros[i] <= edad && listaNumeros[i] >= mitadEdad) {
				resp= resp + listaNumeros[i];
			}
		}
		return resp;
	}
	
	public static String funcion4(int[] notas) {
		
		int sumaNotas = 0;
		int mediaNotas = 0;
		String resp = null;
		
		
		if(notas == null) {
			return null;
		}
			
		for (int i = 0; i < notas.length; i++) {
			sumaNotas = sumaNotas + notas[i];
		}
		
		mediaNotas = sumaNotas / notas.length;
		
		if (mediaNotas < 5 && mediaNotas > 0) {
			resp = "Insuficiente";
		}
		else if(mediaNotas >= 5 && mediaNotas < 6) {
			resp = "Suficiente";
		}
		else if(mediaNotas >= 6 && mediaNotas < 7) {
			resp = "Bien";
		}
		else if(mediaNotas >= 7 && mediaNotas < 9) {
			resp = "Notable";
		}
		else if(mediaNotas >= 9 && mediaNotas ==10) {
			resp = "Sobresaliente";
		}
		
		return resp;
	}
	
	public static Integer funcion5(String simbolo, int num1, int num2) {
		
		int resp = 0;
		
		if (simbolo == "+") {
			resp = num1 + num2;
		}
		else if(simbolo == "-") {
			resp = num1 - num2;
		}
		else if(simbolo == "*") {
			resp = num1 * num2;
		}
		else if(simbolo == "") {
			return null;
		}
		else {
			resp = 0;
		}
		return resp;
	}
}