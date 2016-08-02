package com.prado.gestao_festas.model;

public class Convidado {

	private String nome;
	private Integer quantidadedeAcompanhantes;
	
	
	public Convidado(){
		
	}
	public Convidado(String nome, Integer quantidadedeAcompanhantes){
		this.nome = nome;
		this.quantidadedeAcompanhantes = quantidadedeAcompanhantes;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getQuantidadedeAcompanhantes() {
		return quantidadedeAcompanhantes;
	}
	public void setQuantidadedeAcompanhantes(Integer quantidadedeAcompanhantes) {
		this.quantidadedeAcompanhantes = quantidadedeAcompanhantes;
	}
	
	
}
