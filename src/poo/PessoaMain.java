package poo;

import java.util.ArrayList;

public class PessoaMain {

	public static void main(String[] args) {

		ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();

		Pessoa p1 = new Pessoa();
		Pessoa p2 = new Pessoa();
		Pessoa p3 = new Pessoa();
		Pessoa p4 = new Pessoa();
		Pessoa p5 = new Pessoa();

		p1.SetNome("ellini");
		p1.SetCpf(45345345);
		p1.SetIdade(34);

		pessoas.add(p1);

		p2.SetNome("maria");
		p2.SetCpf(54354534);
		p2.SetIdade(74);

		pessoas.add(p2);

		p3.SetNome("vic");
		p3.SetCpf(4535435);
		p3.SetIdade(3);

		pessoas.add(p3);

		p4.SetNome("ana");
		p4.SetCpf(45353);
		p4.SetIdade(54);

		pessoas.add(p4);

		p5.SetNome("joao");
		p5.SetCpf(45745743);
		p5.SetIdade(48);

		pessoas.add(p5);

		for (Pessoa pessoa : pessoas) {
			System.out.println(pessoa.GetNome() + " " + pessoa.GetCpf() + " " + pessoa.GetIdade());
		}

	}
}