package act5;

/**
 * Clase Password
 *
 * Contiene una contraseña y una longitud
 *
 * @author Samu
 * @version 1.0
 */
public class Password {

	final static int LONG_DEF=8;

	private int longitud;

	private String contraseña;

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getContraseña() {
		return contraseña;
	}

	public String generaPassword (){
		String password="";
		for (int i=0;i<longitud;i++){
			//Generamos un numero aleatorio, segun este elige si añadir una minuscula, mayuscula o numero
			int eleccion=((int)Math.floor(Math.random()*3+1));

			if (eleccion==1){
				char minusculas=(char)((int)Math.floor(Math.random()*(123-97)+97));
				password+=minusculas;
			}else{
				if(eleccion==2){
					char mayusculas=(char)((int)Math.floor(Math.random()*(91-65)+65));
					password+=mayusculas;
				}else{
					char numeros=(char)((int)Math.floor(Math.random()*(58-48)+48));
					password+=numeros;
				}
			}
		}
		return password;
	}

	public boolean esFuerte(){
		int cuentanumeros=0;
		int cuentaminusculas=0;
		int cuentamayusculas=0;
		//Vamos caracter a caracter y comprobamos que tipo de caracter es
		for (int i=0;i<contraseña.length();i++){
			if (contraseña.charAt(i)>=97 && contraseña.charAt(i)<=122){
				cuentaminusculas+=1;
			}else{
				if (contraseña.charAt(i)>=65 && contraseña.charAt(i)<=90){
					cuentamayusculas+=1;
				}else{
					cuentanumeros+=1;
				}
			}
		}
		//Si la constraseña tiene mas de 5 numeros, mas de 1 minuscula y mas de 2 mayusculas
		if (cuentanumeros>=5 && cuentaminusculas>=1 && cuentamayusculas>=2){
			return true;
		}else{
			return false;
		}
	}


	public Password (){
		this(LONG_DEF);
	}

	public Password (int longitud){
		this.longitud=longitud;
		contraseña=generaPassword();
	}
}