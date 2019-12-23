package br.com.marcacao.entites;

import java.util.Date;

public class Paciente {
	private String nome;
	private Date dataNascimento;
	private String cpf;
	
	
	public Paciente() {
		
	}
	
	public Paciente(String nome, Date dataNascimento, String cpf) {
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.cpf = cpf;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Date getDataNascimento() {
		return dataNascimento;
	}
	
	public void setDataNascimento (Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public String toString() {
		return "nome: "
				+ nome
				+ ", "
				+ "\n"
				+ "Data Nacimento: "
				+ dataNascimento
				+ ", "
				+ "\n"
				+ "cpf: "
				+ cpf
				+ "\n";
	}
}


