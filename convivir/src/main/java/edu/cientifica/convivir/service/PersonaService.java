package edu.cientifica.convivir.service;
import edu.cientifica.convivir.model.Persona;

public interface PersonaService {
	
	public int registraPersona(Persona persona);
	public int modificarPersona(Persona persona);
	public int eliminarPersona(Persona persona);
	public Persona obtnerPersonaPorId(Integer id);
	public Persona obtenerPersonaPorDocumento (String tipo, String numero);
}
