package ar.edu.utnjava.modelo;

public class EnviadorCorreo {

	public void enviarCorreo(CorreoElectronico correo) {
		//IMPRIMIR MENSAJE  "Enviando DireccionCorreo con asunto asunto
		
		
		String mensaje =String.format("Enviando:  %s, con asunto %s ", correo.getDireccion(),correo.getAsunto());
		System.out.println(mensaje);
	}
}
