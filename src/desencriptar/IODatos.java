package desencriptar;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class IODatos {
	
	
public static Mensaje[] leerArchivo() {
		
		String ruta = "ROT7.txt", lectura="";
		int cont=0;
		
		File f = new File(ruta);
		Mensaje vMen[] = new Mensaje[3];
		
		try (FileReader fr = new FileReader(f);
			 Scanner leer = new Scanner(fr)) {

				while (leer.hasNext()) {
					lectura = leer.nextLine().trim();
					
					vMen[cont]= new Mensaje(lectura);
					
					cont++;
				}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		return vMen;
		
	}
	
	
}
