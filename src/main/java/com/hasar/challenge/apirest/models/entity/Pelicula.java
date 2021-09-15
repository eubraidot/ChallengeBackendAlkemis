package com.hasar.challenge.apirest.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name="peliculas")
public class Pelicula implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String imagen;
	private String titulo;
	private Date fechaCreacion;
	private Integer calificacion;
	private Integer idPersonaje;
	
	@Column(name="create_at")
	@Temporal(TemporalType.DATE)
	private Date create_at;
	
	
	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getImagen() {
		return imagen;
	}


	public void setImagen(String imagen) {
		this.imagen = imagen;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public Date getFechaCreacion() {
		return fechaCreacion;
	}


	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}


	public Integer getCalificacion() {
		return calificacion;
	}


	public void setCalificacion(Integer calificacion) {
		this.calificacion = calificacion;
	}


	public Integer getIdPersonaje() {
		return idPersonaje;
	}


	public void setIdPersonaje(Integer idPersonaje) {
		this.idPersonaje = idPersonaje;
	}


	public Date getCreate_at() {
		return create_at;
	}


	public void setCreate_at(Date create_at) {
		this.create_at = create_at;
	}


	private static final long serialVersionUID = 1L;
	
	

}
