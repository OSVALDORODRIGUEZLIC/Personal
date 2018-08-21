import java.util.List;

public class EnvioCorreo {

	public void enviar(List ListaDePersona) {
		for (Object o: ListaDePersona) {
			Persona p = (Persona) o;
			System.out.println("mi lista");
		}
	}
}
