package com.hasar.challenge.apirest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hasar.challenge.apirest.models.entity.Personaje;
import com.hasar.challenge.apirest.models.services.IPersonajeServices;

@RestController
@RequestMapping("/api")
public class PersonajeRestController {
	
public PersonajeRestController(IPersonajeServices personajeServices) {
		this.personajeServices = personajeServices;
	}

	@Autowired
	private IPersonajeServices personajeServices;
	
	@GetMapping("/personaje")
	public List<Personaje> index(){
		return personajeServices.finAll();
	}

}
