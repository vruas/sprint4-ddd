package br.com.fiap.porto.model.entity;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class Cliente {
	
	private Long idCliente;
	@NotBlank
	private String email;
	@NotNull
	private String senha;
	@NotNull
	private String nome;
	@NotNull
	
	public Cliente() {}

	public Cliente(Long idCliente, @NotBlank String email, @NotNull String senha, @NotNull String nome) {
		this.idCliente = idCliente;
		this.email = email;
		this.senha = senha;
		this.nome = nome;
	}

	public Long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
