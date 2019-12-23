package br.com.marcacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

import br.com.marcacao.controller.ConsultorioController;
import br.com.marcacao.entites.Medico;
import br.com.marcacao.entites.enums.Especializacao;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		System.out.println("1 - CADASTRAR MEDICO" + "\n2 - CADASTRAR PACIENTE" + "\n3 - CADASTRAR CONSULTA" + "\n9 - SAIR");
		System.out.println();
		int opcao = 0;
		ConsultorioController consultorioController = new ConsultorioController();
		do {
			System.out.print("Inform a opçao desejada: ");
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

			System.out.println("1 - CADASTRAR MEDICO" + "\n2 - CADASTRAR PACIENTE" + "\n3 - CADASTRAR CONSULTA" + "\n9 - SAIR");
			System.out.println();
			if (opcao == 4) {
				System.out.println(consultorioController.imprimeListaMedicos());
				
				
			}

		} while (opcao != 9);
		sc.close();
		
		


		sc.close();

	}

}
