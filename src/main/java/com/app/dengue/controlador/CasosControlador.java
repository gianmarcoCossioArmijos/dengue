package com.app.dengue.controlador;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.app.dengue.entidad.ReporteDto;
import com.app.dengue.entidad.testDto;
import com.app.dengue.servicio.CasoServicio;

@Controller
public class CasosControlador {

	@Autowired
	private CasoServicio servicio;
	
	@GetMapping("/")
	public String inicio() {
		
		return "index";
	}
	
	@GetMapping("/reporte")
	public String usuario(Model modelo) {
		
		ReporteDto reporteDto = servicio.reporte();
		modelo.addAttribute("reporte",reporteDto);
		
		return "sala";
	}
	
	@GetMapping("/formulario")
	public String formulario(Model modelo) {
		
		testDto testDto = new testDto();
		modelo.addAttribute("testDto", testDto);
		 
		return "formulario";
	}
	
	@PostMapping("/test")
	public String test(@ModelAttribute("testDto") testDto testDto, Model modelo) {
		
		String resultado = servicio.testear(testDto);
		modelo.addAttribute("resultado", resultado);
		 
		return "sucess";
	}
}
