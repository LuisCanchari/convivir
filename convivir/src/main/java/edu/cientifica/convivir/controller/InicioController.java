package edu.cientifica.convivir.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import edu.cientifica.convivir.service.UsuarioService;

@Controller
@RequestMapping("/")
public class InicioController {
	
	@Autowired
	private UsuarioService usuarioService;
	
	@GetMapping({"/index","/home", "/"})
	public String inicio() {
		return "inicio";
	}
	
	@GetMapping("/login")
	public String loginForm() {
		
		return "login";
	}
	
	@RequestMapping("/validar")
	public String validarUsuario(
			@RequestParam (name = "username") String user, 
			@RequestParam(name ="password") String pass){
		
		if 	(usuarioService.validarUsuario(user, pass)) {
			return "inicio";
			
		}else {
			return "login";
			
		}
	}
}
