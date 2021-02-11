package edu.cientifica.convivir.serviceimpl;

import org.springframework.stereotype.Service;

import edu.cientifica.convivir.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService {

	@Override
	public Boolean validarUsuario(String username, String password) {
		
		//validacion inicial
		return username.equals("Juan") && password.equals("Clave");
		
		//validacion con bd
		
	}

}
