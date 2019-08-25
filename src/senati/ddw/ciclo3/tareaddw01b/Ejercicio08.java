package senati.ddw.ciclo3.tareaddw01b;

import javax.swing.JOptionPane;

public class Ejercicio08 {

	
		// TODO Auto-generated method stub
		public static void main1(String[] args) {
			String texto=JOptionPane.showInputDialog("Introduce un codigo de la tabla ASCII");
			//Pasamos el String a int
			int codigo=Integer.parseInt(texto);
			//Pasamos el codigo a caracter
			char caracter=(char)codigo;
			System.out.println(caracter);
	}

}
