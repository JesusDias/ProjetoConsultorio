package br.com.marcacao.entites;

import br.com.marcacao.entites.enums.Especializacao;

public class Medico {
	private String nome;
	private Integer crp;
	private Especializacao especializacao;
	
	public Medico () {
		
	}

	public Medico(String nome, Integer crp, Especializacao especializacao) {
		this.nome = nome;
		this.crp = crp;
		this.especializacao = especializacao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getCrp() {
		return crp;
	}

	public void setCrp(Integer crp) {
		this.crp = crp;
	}

	public Especializacao getEspecializacao() {
		return especializacao;
	}

	public void setEspecializacao(Especializacao especializacao) {
		this.especializacao = especializacao;
	}
	
	@Override
	public String toString() {
		StringBuilder objectString = new StringBuilder();

		objectString.append("Nome: ").append(this.nome).append("\n");
		objectString.append("CRP: ").append(this.crp).append("\n");
		objectString.append("Especialização: ").append(this.especializacao);
		return objectString.toString();
	}	
}


