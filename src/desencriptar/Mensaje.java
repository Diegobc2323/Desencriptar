package desencriptar;

public class Mensaje {

	private String abc;
	private int rot ;
	private String mensaje;
	
	
	
	
	public Mensaje(String mensaje) {
		this.abc ="abcdefghijklmnñopqrstuvwxyz";
		this.rot = 7;
		this.mensaje = mensaje;
	}
	
	
	public String getAbc() {
		return abc;
	}
	public void setAbc(String abc) {
		this.abc = abc;
	}
	public int getRot() {
		return rot;
	}
	public void setRot(int rot) {
		this.rot = rot;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
	public String escribir(int posIni) {
		String letra="", letraNueva="";
		int pos = 0, aux=0;
		boolean romper = false;
		
		
		for (int i = posIni; i < mensaje.length(); i++) {
			letra = mensaje.substring(i,i+1);
			
			aux= abc.indexOf(letra);
			
			if (letra.equals(" ") || letra.equals(".")|| letra.equals(",")) 
				return letra;
			
			aux=aux-7;
			
			if (aux<=27)
				aux = pos+27;
			
			letraNueva = abc.substring(aux, aux+1);
			
			//Estoy aqui
				
			return letraNueva;
			
		}
		
		return letraNueva;
	}
	
	
}
