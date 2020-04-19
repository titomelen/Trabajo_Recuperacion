package Proyecto;

public class totalfunciones {
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
