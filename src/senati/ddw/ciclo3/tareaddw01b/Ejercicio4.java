package senati.ddw.ciclo3.tareaddw01b;

import java.util.Scanner;

public class Ejercicio4 {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Introduce tu nombre");
		String nombre=sc.nextLine();
		System.out.println("Bienvenido "+nombre);
	}

}
