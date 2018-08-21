import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
	
		Persona u1 = new Usuario ("jorge","jorge@neta");
		Persona a1 =new Administrador("Homero","homer@neta");
		System.out.println("Datos del usuario" +u1);
		System.out.println("Datos del usuario" +a1);
		
		List listaDePersona = new ArrayList();
		listaDePersona.add(a1);
		listaDePersona.add(u1);
		
		EnvioCorreo ec= new EnvioCorreo();
		ec.enviar(listaDePersona);
		
	}

}
