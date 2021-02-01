package edu.cientifica.divisasapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import edu.cientifica.divisasapp.model.Moneda;
import edu.cientifica.divisasapp.services.Conversor;

@Controller
@RequestMapping(value = "/")
public class InicioController {
	
	@Autowired
	Conversor conversor;
	
	
	@GetMapping(value = "/inicio")
	public String inicio() {
		
		return "inicio";
	}
	
	@GetMapping(value = "/divisa")
	public String divisa(Model model) {
		model.addAttribute("monedas", conversor.listaMoneda());
		return "divisa_form";
	}
	
	@PostMapping(value = "/divisa")
	public String procesar(Model model,
			@RequestParam(value = "origen") String origen, 
			@RequestParam(value = "destino") String destino,
			@RequestParam(value = "monto") double cantidad) {
		
		String resultado = null;
		resultado = String.valueOf(conversor.convertir(origen,destino, cantidad));
		
		model.addAttribute("resultado", resultado);
		return "divisa_result";
	}
	
}
