package Proyecto;

public class totalfunciones {
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
}
