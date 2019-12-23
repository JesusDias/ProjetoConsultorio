package br.com.marcacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import br.com.marcacao.controller.ConsultorioController;
import br.com.marcacao.entites.Medico;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("1 - CADASTRAR MEDICO" + "\n2 - CADASTRAR PACIENTE" + "\n3 - CADASTRAR CONSULTA" +"\n4 - LISTAR MEDICOS" + "\n5 - LISTAR PACIENTES" + "\n6 - LISTAR CONSULTAS" + "\n7 - SAIR");
		System.out.println();
		int opcao = 0;
		ConsultorioController consultorioController = new ConsultorioController();
		do {
			System.out.print("Informe a opçao desejada: ");
			opcao = sc.nextInt();
			
			if (opcao == 1) {
				System.out.println("Informe os dados do medico: ");
				System.out.print("nome: ");
				sc.nextLine();
				String nomeMedico = sc.nextLine();
				System.out.print("crp: ");
				int crp = sc.nextInt();
				System.out.print("especialização: ");
				sc.nextLine();
				String especializacao = sc.nextLine();
				consultorioController.cadatraMedico(nomeMedico, especializacao, crp);
			}

			if (opcao == 4) {
				System.out.println(consultorioController.imprimeListaMedicos());
				
			}
			
			if (opcao == 2){
				System.out.println("Informe os dados do Paciente: ");
				System.out.print("nome: ");
				sc.nextLine();
				String nome = sc.nextLine();
				System.out.print("Data nascimento [dd/MM/yyyy]: ");
				Date dataNascimento = sdf2.parse(sc.next());
				System.out.println("cpf: ");
				sc.nextLine();
				String cpf = sc.nextLine();
				consultorioController.cadastraPaciente(nome, dataNascimento, cpf);
			}
			
			if (opcao == 5) {
				System.out.println(consultorioController.imprimeListaPacientes());
				
			}
			
			if (opcao == 3) {
				System.out.println("Informe os dados da consulta: ");
				System.out.print("Data / Horario [dd/MM/yyyy HH:mm:ss]");
				sc.nextLine();
				Date data = sdf1.parse(sc.nextLine());
				System.out.print("Nome Medico: ");
				sc.nextLine();
				String medico = sc.nextLine();
				System.out.print("Informe o nome do Paciente: ");
				sc.nextLine();
				String paciente = sc.nextLine();
				consultorioController.cadastraConsulta(data, medico, paciente);
			}
			System.out.println("1 - CADASTRAR MEDICO" + "\n2 - CADASTRAR PACIENTE" + "\n3 - CADASTRAR CONSULTA" +"\n4 - LISTAR MEDICOS" + "\n5 - LISTAR PACIENTES" + "\n6 - LISTAR CONSULTAS" + "\n7 - SAIR");
			System.out.println();
			
		} while (opcao != 7);

		sc.close();

	}

}
