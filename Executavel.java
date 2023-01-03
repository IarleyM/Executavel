package Aula;

import java.util.ArrayList;
import java.util.Scanner;

public class Executavel {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<Cadastro> cad = new ArrayList<>();

		System.out.println("Quantos funcionarios serao registrados?");
		int qnt = sc.nextInt();

		for (int i = 0; i < qnt; i++) {
			System.out.println("Informe o nome do funcionario " + (i + 1));
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.println("Informe o ID: ");
			int id = sc.nextInt();
			System.out.println("Informe o salario do funcionario:");
			double salario = sc.nextDouble();

			Cadastro cadastro = new Cadastro(id, nome, salario);

			cad.add(cadastro);
		}
		for (Cadastro c : cad) {
			System.out.println(c);
		}

		System.out.println("\nInforme o id do funcionario que voce deseja aumentar o salario?");
		int id = sc.nextInt();
		
		Integer pos = posicao(cad, id);
		if(pos == null) {
			System.out.println("Esta posicao nao existe");
		}else {
			System.out.print("\nInforme a porcentagem:");
			int percent = sc.nextInt();
			cad.get(pos).aumentarSalario(percent);
		}
		
		System.out.println("\nLista de funcionarios");
		for(Cadastro cads : cad) {
			System.out.println(cads);
		}
	}

	static Integer posicao(ArrayList<Cadastro> cad, int id) {
		for (int i = 0; i < cad.size(); i++) {
			if (cad.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}
}
