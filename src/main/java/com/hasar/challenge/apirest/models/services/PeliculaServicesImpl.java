package com.hasar.challenge.apirest.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hasar.challenge.apirest.models.dao.IPeliculaDao;
import com.hasar.challenge.apirest.models.entity.Pelicula;

@Service
public class PeliculaServicesImpl implements IPeliculaServices{
@Autowired 
private IPeliculaDao peliculaDao;
	@Override
	@Transactional(readOnly=true)
	public List<Pelicula> finAll() {
		return (List<Pelicula>) peliculaDao.findAll();
	}

	
}
