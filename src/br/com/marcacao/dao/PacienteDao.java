package br.com.marcacao.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.marcacao.entites.Paciente;

public class PacienteDao {
	private static List<Paciente> listaPaciente = new ArrayList<>();
	public void cadastraPaciente(Paciente paciente) {
		listaPaciente.add(paciente);
	}
	
	
	public List<Paciente> listar(){
		return listaPaciente;
	}
}
