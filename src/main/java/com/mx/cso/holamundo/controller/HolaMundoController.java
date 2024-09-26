package com.mx.cso.holamundo.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hola")
@CrossOrigin
public class HolaMundoController {
	
	@GetMapping("/mundo")
	public String holaMundo() {
		
		return "Hola Mundo desde Spring";
	}

}
