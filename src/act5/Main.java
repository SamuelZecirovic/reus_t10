package act5;

import javax.swing.JOptionPane;
public class Main {
  
    public static void main(String[] args) throws Exception {
  
    	try {
	        //Introducimos el tama�o del array y la longitud del password
	        
    		String texto=JOptionPane.showInputDialog("Introduce un tama�o para el array");
	        int tama�o=Integer.parseInt(texto);
	        texto=JOptionPane.showInputDialog("Introduce la longitud del password");
	        int longitud=Integer.parseInt(texto);

	        if(tama�o <= 0 || longitud <= 8){
	        Exception e = new Exception("solo positivos o contrase�a mas de 8");
	        throw e;
	        }
	        
	  
	        //Creamos los arrays
	        Password listaPassword[]=new Password[tama�o];
	        boolean fortalezaPassword[]=new boolean[tama�o];
	  
	        //Creamos objetos, indicamos si es fuerte y mostramos la contrase�a y su fortaleza.
	        for(int i=0;i<listaPassword.length;i++){
	            listaPassword[i]=new Password(longitud);
	            fortalezaPassword[i]=listaPassword[i].esFuerte();
	            System.out.println(listaPassword[i].getContrase�a()+" "+fortalezaPassword[i]);
	        }
    	}catch(NumberFormatException ex) {
    		System.out.println("solo numeros por favor");
    	}catch(Exception ex) {
    		System.out.println(ex.getMessage());
    	}
    }
  
}
