package act3;

public class Main {

	public static void main(String[] args) {
        try {
            System.out.println("Generando número aleatorio");
            int entero = (int) (Math.random() * 1000);
            System.out.println("Numero es: "+ entero);
            if (entero % 2 == 0) {
                throw new Exception("Se genero un numero par");
            } else {
                throw new Exception("Se genero un numero impar");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
