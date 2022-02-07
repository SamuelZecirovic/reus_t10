package act1;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = (int) (Math.random() * 500);
		// debe ser entre 1 y 500, por lo que se incrementa en 1;
		int numero = 0;
		int intentos = 0;
		do {
			boolean leido;
			do {
				System.out.println("Introduzca un numero (1-500)");
				try {
					intentos++;
					numero = sc.nextInt();
					System.out.println("El numero introducido es: " + numero);
					leido = true;
				} catch (InputMismatchException ex) {
					System.out.println("No ha introducido un numero entero");
					sc.next(); // se lee el elemento no reconocido para
					// eliminarlo
					leido = false;
				}
			} while (leido == false);

			if (numero > num) {
				System.out.println("El numero es menor. Sigue intentando");

			}
			if (numero < num) {
				System.out.println("El numero es mayor. Sigue intentandolo");
			}

		} while (numero != num);

		System.out.println("Has acertado: " + num);
		System.out.println("Despues de" + intentos + "intentos");

	}

}


