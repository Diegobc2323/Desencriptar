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
	
	
	public String escribir() {
		String devuelve="", letra="", letraNueva="";
		int pos = 0;
		
		
		for (int i = 0; i < mensaje.length(); i++) {
			letra = mensaje.substring(i,i+1);
			
			for (int j = 0; j < abc.length(); j++) {
				if (letra.equalsIgnoreCase(abc.substring(j,j+1))) {
					pos = j + rot;
					
					if (pos>25) {
						pos = pos-25; //ESTOY AQUI
					}
					
				}
			}
			
			
		}
		
		
		
		return devuelve;
	}
	
	
}
