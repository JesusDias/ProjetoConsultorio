package br.com.marcacao.controller;

import java.util.List;

import br.com.marcacao.dao.MedicoDao;
import br.com.marcacao.entites.Medico;
import br.com.marcacao.entites.enums.Especializacao;

public class ConsultorioController {
	private MedicoDao medicoDao= new MedicoDao();
	
	public void cadatraMedico(String nomeMedico, String especializacao, int crp) {
		Medico medico = new Medico(nomeMedico, crp, Especializacao.valueOf(especializacao)); 
		this.medicoDao.cadastrarMedico(medico);
		
	}
	
	public String imprimeListaMedicos() {
		return this.medicoDao.listar().toString();
		
	}

}
