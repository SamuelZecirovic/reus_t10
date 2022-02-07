package act4;

import javax.swing.JOptionPane;

public class Operaciones {

	public static void suma() {
		int num1 = 0;
		int num2 = 0;
		int resultado = 0;

		try {
			num1 = Integer.parseInt(JOptionPane.showInputDialog("introduce el primer valor"));
			num2 = Integer.parseInt(JOptionPane.showInputDialog("introduce el segundo valor"));
			resultado = num1 + num2;
			System.out.println("Resultado de la suma = " + resultado);
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Introduce solo numeros");
		}
	}

	public static void resta() {
		int num1 = 0;
		int num2 = 0;
		int resultado = 0;

		try {
			num1 = Integer.parseInt(JOptionPane.showInputDialog("introduce el primer valor"));
			num2 = Integer.parseInt(JOptionPane.showInputDialog("introduce el segundo valor"));
			resultado = num1 - num2;
			System.out.println("Resultado de la resta = " + resultado);
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Introduce solo numeros");
		}
	}

	public static void multiplicar() {
		int num1 = 0;
		int num2 = 0;
		int resultado = 0;

		try {
			num1 = Integer.parseInt(JOptionPane.showInputDialog("introduce el primer valor"));
			num2 = Integer.parseInt(JOptionPane.showInputDialog("introduce el segundo valor"));
			resultado = num1 * num2;
			System.out.println("Resultado de la multiplicacion = " + resultado);
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Introduce solo numeros");
		}
	}
	public static void potencia() {
		int num1 = 0;
		int num2 = 0;
		int resultado = 0;

		try {
			num1 = Integer.parseInt(JOptionPane.showInputDialog("introduce un valor"));
			num2 = Integer.parseInt(JOptionPane.showInputDialog("introduce cuanto quieres elevar el valor anterior"));
			resultado = (int) Math.pow(num1, num2);
			System.out.println("Resultado de la potencia = " + resultado);
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Introduce solo numeros");
		}
	}


	public static void raizCuadrada() {
		int num1 = 0;
		int resultado = 0;

		try {
			num1 = Integer.parseInt(JOptionPane.showInputDialog("introduce un numero"));
			resultado = (int) Math.sqrt(num1);
			System.out.println("Resultado de la raiz cuadrada = "+ resultado);
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Introduce solo numeros");
		}
	}

	public static void raizCubica() {
		int num1 = 0;
		int resultado = 0;

		try {
			num1 = Integer.parseInt(JOptionPane.showInputDialog("introduce un numero"));
			resultado = (int) Math.cbrt(num1);
			System.out.println("Resultado de la raiz cubica = "+ resultado);
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Introduce solo numeros");
		}
	}

	public static void dividir() {
		int num1 = 0;
		int num2 = 0;
		int resultado = 0;

		try {
			num1 = Integer.parseInt(JOptionPane.showInputDialog("introduce el primer valor"));
			num2 = Integer.parseInt(JOptionPane.showInputDialog("introduce el segundo valor"));
			resultado = num1 / num2;
			System.out.println("Resultado de la division = " + resultado);
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Introduce solo numeros");
		}
	}

}
