package com.hasar.challenge.apirest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hasar.challenge.apirest.models.entity.Pelicula;
import com.hasar.challenge.apirest.models.services.IPeliculaServices;

@RestController
@RequestMapping("/api")
public class PeliculaRestController {
	
	@Autowired
	private IPeliculaServices peliculaServices;
	
	@GetMapping("/pelicula")
	public List<Pelicula> index(){
		return peliculaServices.finAll();
	}

}
