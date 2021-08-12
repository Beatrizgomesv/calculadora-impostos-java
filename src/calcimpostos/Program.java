package calcimpostos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Contribuente;
import entities.Pfisica;
import entities.Pjuridica;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<Contribuente> list = new ArrayList<Contribuente>();
		System.out.println("Digite o número de Contribuentes: ");
		int N = sc.nextInt();
		for (int i = 1; i <= N; i++) {
			System.out.println("Dados Contribuente #" + i);
			System.out.print("Pessoa Física ou Jurídica? (f/j) ");
			char tipo = sc.next().charAt(0);
			System.out.print("Nome: ");
			String nome = sc.next();
			System.out.print("Renda anual: ");
			Double rendimentoAnual = sc.nextDouble();
			if (tipo == 'f') {
				System.out.print("Gastos com Saúde: ");
				Double planoDeSaude = sc.nextDouble();
				Pfisica x = new Pfisica(nome, rendimentoAnual, planoDeSaude);
				list.add(x);
			} else {
				System.out.print("Número de Funcionários: ");
				Integer numeroDeFuncionarios = sc.nextInt();
				list.add(new Pjuridica(nome, rendimentoAnual, numeroDeFuncionarios));
			}
		}
		System.out.println();
		System.out.println("TAXAS PAGAS: ");
		for (Contribuente tp : list) {
			System.out.println(tp.getNome() + " R$" + String.format("%.2f", tp.taxa()));
		}
		double soma = 0.0;
		for (Contribuente tp : list) {
			soma += tp.taxa();

		}
		System.out.println("Valor Total de Taxas: R$" + String.format("%.2f", soma));
		
		sc.close();
	}

}
