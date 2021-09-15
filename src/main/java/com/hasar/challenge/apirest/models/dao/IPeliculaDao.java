package com.hasar.challenge.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.hasar.challenge.apirest.models.entity.Pelicula;

public interface IPeliculaDao extends CrudRepository<Pelicula,Integer>{


}
