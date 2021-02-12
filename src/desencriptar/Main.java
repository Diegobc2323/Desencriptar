package desencriptar;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String abc="abcdefghijklmnñopqrstuvwxyz";
		int rot = 7;
		
		Mensaje vMen[] = IODatos.leerArchivo();
		
		
		for (Mensaje mensaje : vMen) {
			
			for (int i = 0; i < mensaje.getMensaje().length() ; i++) {
				System.out.print(mensaje.escribir(i));
			}
			
			System.out.println();
			
		}
		
		
		
	}

}
