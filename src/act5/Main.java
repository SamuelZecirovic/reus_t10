package act5;

import javax.swing.JOptionPane;
public class Main {
  
    public static void main(String[] args) throws Exception {
  
    	try {
	        //Introducimos el tamaño del array y la longitud del password
	        
    		String texto=JOptionPane.showInputDialog("Introduce un tamaño para el array");
	        int tamaño=Integer.parseInt(texto);
	        texto=JOptionPane.showInputDialog("Introduce la longitud del password");
	        int longitud=Integer.parseInt(texto);

	        if(tamaño <= 0 || longitud <= 8){
	        Exception e = new Exception("solo positivos o contraseña mas de 8");
	        throw e;
	        }
	        
	  
	        //Creamos los arrays
	        Password listaPassword[]=new Password[tamaño];
	        boolean fortalezaPassword[]=new boolean[tamaño];
	  
	        //Creamos objetos, indicamos si es fuerte y mostramos la contraseña y su fortaleza.
	        for(int i=0;i<listaPassword.length;i++){
	            listaPassword[i]=new Password(longitud);
	            fortalezaPassword[i]=listaPassword[i].esFuerte();
	            System.out.println(listaPassword[i].getContraseña()+" "+fortalezaPassword[i]);
	        }
    	}catch(NumberFormatException ex) {
    		System.out.println("solo numeros por favor");
    	}catch(Exception ex) {
    		System.out.println(ex.getMessage());
    	}
    }
  
}
