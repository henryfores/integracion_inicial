package ar.edu.utnjava.programa;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

import ar.edu.utnjava.modelo.CorreoElectronico;
import ar.edu.utnjava.modelo.EnviadorCorreo;

public class Main {

	public static void main(String[] args) {
    
		//Crea objeto
//		
//		CorreoElectronico correo1 = new CorreoElectronico();
//				
//		correo1.setAsunto("Asunto del Mail");
//		correo1.setDireccion("e-mail");
//		
//		EnviadorCorreo send = new EnviadorCorreo();
//		
//		send.enviarCorreo(correo1);

		ArrayList<CorreoElectronico> correo = new ArrayList<>();

Path path = Paths.get("src/main/resources/emails.txt");

    try(BufferedReader reader = Files.newBufferedReader(path, Charset.forName("UTF-8"))){      

      String currentLine = null;

      while((currentLine = reader.readLine()) != null){//while there is content on the current line

    	  CorreoElectronico correos = new CorreoElectronico();
    	  String[] linea = currentLine.split(" , ");
    	  correos.setDireccion(linea[0]);
    	  correos.setAsunto(linea[1]);
    	  correo.add(correos);
        System.out.println(currentLine); // print the current line

      }

    }catch(IOException ex){

      ex.printStackTrace(); //handle an exception here

    }
EnviadorCorreo enviador = new EnviadorCorreo();
for (CorreoElectronico coreos: correo) {
	enviador.enviarCorreo(correo);
}

	}

}
