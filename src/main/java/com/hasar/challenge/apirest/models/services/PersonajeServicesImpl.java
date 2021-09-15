package com.hasar.challenge.apirest.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hasar.challenge.apirest.models.dao.IPersonajeDao;
import com.hasar.challenge.apirest.models.entity.Personaje;

@Service
public class PersonajeServicesImpl implements IPersonajeServices {

	@Autowired
	private IPersonajeDao personajeDao;
	
	@Override
	@Transactional
	public List<Personaje> finAll() {
		// TODO Auto-generated method stub
		return (List<Personaje>) personajeDao.findAll();
	}

}
