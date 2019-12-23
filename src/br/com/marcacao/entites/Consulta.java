package br.com.marcacao.entites;

import java.util.Date;

public class Consulta {
	private Date data;
	
	private Medico medico;
	private Paciente paciente;
	
	public Consulta() {
		
	}
	
	public Consulta(Date data, Medico medico, Paciente paciente) {
		this.data = data;
		this.medico = medico;
		this.paciente = paciente;
	}


	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	

	
}
