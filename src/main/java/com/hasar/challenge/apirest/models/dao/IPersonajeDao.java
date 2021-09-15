package com.hasar.challenge.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.hasar.challenge.apirest.models.entity.Personaje;

public interface IPersonajeDao extends CrudRepository<Personaje, Integer>{
	

}
