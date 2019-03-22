package Exercicio01;

public class Pessoa {

	String nome = "Gabriel";
	String sobrenome = "Cherbiski";
	int cpf = 95977349;
	int idade = 21;

	String nome() {
		System.out.println("Nome:"+nome);
		return nome;
	}

	String sobrenome() {
		System.out.println("Sobrenome:"+sobrenome);
		return sobrenome;
	}

	double cpf() {
		System.out.println("CPF:"+cpf);
		return cpf;
	}

	int idade() {
		System.out.println("Idade:"+idade);
		return idade;
	}

}
