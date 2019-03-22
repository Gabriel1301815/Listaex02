package Exercicio02;

public class Produto {

	String nome = "Celular";
	String sistemaOp = "Android";
	String cor = "Prata";
	double versao = 9.1;
	int valor = 1000;
	double tela = 5.5;
	
	
	String nome() {
		System.out.println("Produto: " +nome);
		return nome;
	}
	
	String sistemaOp () {
		System.out.println("Sistema Operacional: " +sistemaOp);
		return sistemaOp;
	}
	
	String cor() {
		System.out.println("Cor: " +cor);
		return cor;
	}
	
	double versao() {
		System.out.println("Versão: " +versao);
		return versao;
	}
	
	int valor() {
		System.out.println("Valor: " +valor);
		return valor;
	}
	
	double tela() {
		System.out.println("Tela: " +tela);
		return tela;
	}
}
