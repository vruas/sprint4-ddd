package br.com.fiap.porto.model.entity;

import java.time.LocalDate;

public class Vistoria {

	private Long idVistoria;
	private String relatorioVis;
	private LocalDate dataVistoria;
	
	public Vistoria() {}

	public Vistoria(Long idVistoria, String relatorioVis, LocalDate dataVistoria) {
		this.idVistoria = idVistoria;
		this.relatorioVis = relatorioVis;
		this.dataVistoria = dataVistoria;
	}

	public Long getIdVistoria() {
		return idVistoria;
	}

	public void setIdVistoria(Long idVistoria) {
		this.idVistoria = idVistoria;
	}

	public String getRelatorioVis() {
		return relatorioVis;
	}

	public void setRelatorioVis(String relatorioVis) {
		this.relatorioVis = relatorioVis;
	}

	public LocalDate getDataVistoria() {
		return dataVistoria;
	}

	public void setDataVistoria(LocalDate dataVistoria) {
		this.dataVistoria = dataVistoria;
	}
	
}
