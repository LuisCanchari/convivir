package edu.cientifica.convivir.serviceimpl;

import org.springframework.stereotype.Service;

import edu.cientifica.convivir.model.Persona;
import edu.cientifica.convivir.service.PersonaService;

@Service
public class PersonaServiceImpl implements PersonaService{
	
	@Override
	public int registraPersona(Persona persona) {
		// TODO Auto-generated method stub
		System.out.println("Se envio datos para registrar");
		
		return 0;
		
	}

	@Override
	public int modificarPersona(Persona persona) {
		// TODO Auto-generated method stub
		System.out.println("Se envio datos para modificar");
		return 0;
	}

	@Override
	public int eliminarPersona(Persona persona) {
		// TODO Auto-generated method stub
		System.out.println("Se envio datos para eliminar");
		return 0;
	}

	@Override
	public Persona obtnerPersonaPorId(Integer id) {
		// TODO Auto-generated method stub
		System.out.println("Se envio id para consultar persona");
		return null;
	}

	@Override
	public Persona obtenerPersonaPorDocumento(String tipo, String numero) {
		System.out.println("Se envio tipo y numero de documeto para consultar persona");
		// TODO Auto-generated method stub
		return null;
	}
	

}
