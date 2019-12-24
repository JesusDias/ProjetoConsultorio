package br.com.marcacao.controller;

import java.util.Date;

import br.com.marcacao.dao.ConsultaDao;
import br.com.marcacao.dao.MedicoDao;
import br.com.marcacao.dao.PacienteDao;
import br.com.marcacao.entites.Consulta;
import br.com.marcacao.entites.Medico;
import br.com.marcacao.entites.Paciente;
import br.com.marcacao.entites.enums.Especializacao;

public class ConsultorioController {
	private MedicoDao medicoDao= new MedicoDao();
	private PacienteDao pacienteDao = new PacienteDao();
	private ConsultaDao consultaDao = new ConsultaDao();
	
	public void cadatraMedico(String nomeMedico, String especializacao, int crp) {
		Medico medico = new Medico(nomeMedico, crp, Especializacao.valueOf(especializacao)); 
		this.medicoDao.cadastrarMedico(medico);
		
	}
	
	public String imprimeListaMedicos() {
		return this.medicoDao.listar().toString();
		
	}
	
	public void cadastraPaciente(String nome, Date dataNacimento, String cpf) {
		Paciente paciente = new Paciente(nome, dataNacimento, cpf);
		this.pacienteDao.cadastraPaciente(paciente);
		
	}
	
	public String imprimeListaPacientes() {
		return this.pacienteDao.listar().toString();
	}
	
	public void cadastraConsulta(Date data, String medico, String paciente) {
		Medico medicoResult = this.medicoDao.consultarMedicoPorNome(medico);
		Paciente pacienteResult = this.pacienteDao.consultarPacientePorNome(paciente);
		Consulta consulta = new Consulta(data, medicoResult, pacienteResult);
		this.consultaDao.cadastraConsulta(consulta);
	}
	
	public String imprimeConsultas() {
		return this.consultaDao.listar().toString();
	}
}

