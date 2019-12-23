package br.com.marcacao.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.marcacao.entites.Consulta;
import br.com.marcacao.entites.Medico;

public class ConsultaDao {
	public static List<Consulta> listaConsulta = new ArrayList<>();
	
	public void cadastraConsulta(Consulta consulta) {
		listaConsulta.add(consulta);
	}
	
	public List<Consulta> listar(){
		return listaConsulta;
	}
}
