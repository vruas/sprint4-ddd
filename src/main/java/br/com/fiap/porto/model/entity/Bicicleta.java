package br.com.fiap.porto.model.entity;

import java.time.LocalDate;

public class Bicicleta {

	private Long idBicicleta;
	private String marca;
	private float preco;
	private String tipoBicicleta;
	private String modelo;
	private LocalDate dataDaCompra;
	
	public Bicicleta() {}

	public Bicicleta(Long idBicicleta, String marca, float preco, String tipoBicicleta, String modelo,
			LocalDate dataDaCompra) {
		this.idBicicleta = idBicicleta;
		this.marca = marca;
		this.preco = preco;
		this.tipoBicicleta = tipoBicicleta;
		this.modelo = modelo;
		this.dataDaCompra = dataDaCompra;
	}

	public Long getIdBicicleta() {
		return idBicicleta;
	}

	public void setIdBicicleta(Long idBicicleta) {
		this.idBicicleta = idBicicleta;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public String getTipoBicicleta() {
		return tipoBicicleta;
	}

	public void setTipoBicicleta(String tipoBicicleta) {
		this.tipoBicicleta = tipoBicicleta;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public LocalDate getDataDaCompra() {
		return dataDaCompra;
	}

	public void setDataDaCompra(LocalDate dataDaCompra) {
		this.dataDaCompra = dataDaCompra;
	}
	
}
