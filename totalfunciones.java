package Proyecto;

public class totalfunciones {
	public static Boolean funcion1(String cadena) {

		Boolean resp = null;
		int edad = 22;
		int contador = 0;

		for (int i = 0; i < cadena.length(); i++) {
			if ((cadena.charAt(i) == 'a') || (cadena.charAt(i) == 'e') || (cadena.charAt(i) == 'i')
					|| (cadena.charAt(i) == 'o') || (cadena.charAt(i) == 'u')) {

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
					|| (cadena.charAt(i) == 'o') || (cadena.charAt(i) == 'u')) {

				contadorVocal++;
			}
			contadorConso = cadena.length() - contadorVocal;
		}

		for (int i = 0; i < cadena2.length(); i++) {
			if ((cadena2.charAt(i) == 'a') || (cadena2.charAt(i) == 'e') || (cadena2.charAt(i) == 'i')
					|| (cadena2.charAt(i) == 'o') || (cadena2.charAt(i) == 'u')) {

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

		for (int i = 0; i < listaNumeros.length; i++) {
			if (listaNumeros[i] <= edad && listaNumeros[i] >= mitadEdad) {
				resp= resp + listaNumeros[i];
			}
		}
		return resp;
	}

}
