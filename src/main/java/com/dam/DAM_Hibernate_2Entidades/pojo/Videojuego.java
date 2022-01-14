package com.dam.DAM_Hibernate_2Entidades.pojo;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Videojuego {
	@Id
	private int codigo;
	@Column
	private String titulo;
	@Column
	private String genero;
	
	
	public Videojuego(int codigo, String titulo, String genero) {
		super();
		this.codigo = codigo;
		this.titulo = titulo;
		this.genero = genero;
	}


	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}

	
	
}
