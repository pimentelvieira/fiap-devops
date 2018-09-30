package com.fiap.devops;

public class Livro {

	private Integer id;
	private String autor;
	private String nome;
	
	public Livro(Integer id, String autor, String nome) {
		this.id = id;
		this.autor = autor;
		this.nome = nome;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
