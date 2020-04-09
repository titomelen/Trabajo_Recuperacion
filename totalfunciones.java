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
}
