package br.com.marcacao.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.marcacao.entites.Medico;

public class MedicoDao {
	private static List<Medico> tabelaMedico = new ArrayList<>();
	
	public void cadastrarMedico(Medico medico) {
		tabelaMedico.add(medico);
	}
	
	public List<Medico> listar(){
		return tabelaMedico;
	}
	
	public Medico consultarMedicoPorNome(String nome) {
		Medico medicoResult = null;
		for (Medico medico : tabelaMedico) {
			if (nome.equals(medico.getNome())) {
				medicoResult = medico;
			}
		}
		return medicoResult;
	}
	
	
}
