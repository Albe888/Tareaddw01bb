package senati.ddw.ciclo3.tareaddw01b;

import java.util.Scanner;

public class Ejercicio09 {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Introduce un caracter ASCII");
		char caracter = sc.next().charAt(0);
		//Pasamos el caracter a codigo
		int codigo = (int) caracter;
		System.out.println(codigo);
	}

}
