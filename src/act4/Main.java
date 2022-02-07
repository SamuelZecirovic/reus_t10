package act4;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		System.out.println("1: Suma");
		System.out.println("2: Resta");
		System.out.println("3: Multiplicacion");
		System.out.println("4: Potencia");
		System.out.println("5: Raiz Cuadrada");
		System.out.println("6: Raiz Cubica");
		System.out.println("7: Dividir");
		int opcion = Integer.parseInt(JOptionPane.showInputDialog("Escoge una operacion"));
		switch (opcion) {
		case 1:
			Operaciones.suma();
			break;

		case 2:
			Operaciones.resta();
			break;
		case 3:
			Operaciones.multiplicar();
			break;
		case 4:
			Operaciones.potencia();
			break;
		case 5:
			Operaciones.raizCuadrada();
			break;
		case 6:
			Operaciones.raizCubica();
			break;
		case 7:
			Operaciones.dividir();
			break;
		default:
			break;
		}
	}
	
}
