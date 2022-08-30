package poo;

import java.util.ArrayList;
import java.util.Scanner;

public class menu {

	public static void main(String[] args) {
		ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
		int opicao;

		do {
			Scanner s = new Scanner(System.in);

			System.out.println("0 - Sair, 1 - Cadastrar, 2 - Atualizar, 3 - Listar");
			opicao = s.nextInt();

			switch (opicao) {
			case 1: {
				pessoas.add(SetPessoa());
				break;
			}

			case 2: {
				Atualizar(pessoas);
				break;
			}

			case 3: {
				Listar(pessoas);
				break;
			}
			
			default:
				System.out.println("numero digitado invalido");
			}

		} while (opicao != 0);

	}

	public static Pessoa SetPessoa() {
		Pessoa p = new Pessoa();
		Scanner s = new Scanner(System.in);

		System.out.println("nome:");
		p.SetNome(s.nextLine());

		System.out.println("CPF:");
		p.SetCpf(s.nextInt());

		System.out.println("idade");
		p.SetIdade(s.nextInt());
		return p;
	}

	public static void Atualizar(ArrayList<Pessoa> pessoas) {
		Scanner s = new Scanner(System.in);
		int count = 0;
		boolean alt = false;

		System.out.println("digite o CPF da pessoa que sera atualizada:");
		int alterar = s.nextInt();

		for (Pessoa pessoa : pessoas) {
			if (pessoa.GetCpf() == alterar) {
				System.out.println("digite os novos3");
				pessoas.set(count, SetPessoa());
				alt = true;
			}
			count++;
		}
		if (!alt) {
			System.out.println("CPF nao encotrando");
		}
	}

	public static void Listar(ArrayList<Pessoa> pessoas) {
		for (Pessoa pessoa : pessoas) {
			System.out.println("Nome:" + pessoa.GetNome() + " CPF:" + pessoa.GetCpf() + " Idade:" + pessoa.GetIdade());
		}
	}

}
