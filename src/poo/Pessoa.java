package poo;

public class Pessoa {

	private String Nome;
	
	private int Cpf;
	
	private int Idade;
	
	public String GetNome() {
		return Nome;
	}
	
	public void SetNome(String nome) {
		this.Nome = nome;
	}
	
	public int GetCpf() {
		return Cpf;
	}
	
	public void SetCpf(int cpf) {
		this.Cpf = cpf;
	}
	
	public int GetIdade() {
		return Idade;
	}
	
	public void SetIdade(int idade) {
		this.Idade = idade;
	}
}
