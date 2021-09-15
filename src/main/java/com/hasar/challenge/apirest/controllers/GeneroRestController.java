package com.hasar.challenge.apirest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hasar.challenge.apirest.models.entity.Genero;
import com.hasar.challenge.apirest.models.services.IGeneroServices;

@RestController
@RequestMapping("/api")
public class GeneroRestController {
	
	@Autowired
	private IGeneroServices generoServices;
	
	@GetMapping("/genero")
	public List<Genero> index(){
		return generoServices.finAll();
	}

}

