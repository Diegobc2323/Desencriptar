package desencriptar;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String abc="abcdefghijklmnñopqrstuvwxyz";
		int rot = 7;
		
		Mensaje vMen[] = IODatos.leerArchivo();
		
		for (int i = 0; i < vMen.length; i++) {
			vMen[i].escribir();
		}
		
		
		
		
		
	}

}
