package com.hasar.challenge.apirest.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hasar.challenge.apirest.models.dao.IGeneroDao;
import com.hasar.challenge.apirest.models.entity.Genero;

@Service
public class GeneroServicesImpl implements IGeneroServices {

	@Autowired
	private IGeneroDao generoDao;
	
	@Transactional
	public List<Genero> finAll() {
		// TODO Auto-generated method stub
		return (List<Genero>) generoDao.findAll();
	}

}