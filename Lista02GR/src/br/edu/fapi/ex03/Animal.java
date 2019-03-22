package br.edu.fapi.ex03;

public class Animal {

	String animal = "Lobo";
	String especie = "Mamifero";
	String classeAlimentar = "Carnivoro";
	String genero = "Macho";
	String corDaPelagem = "Branco";
	int anosDeVida = 3;

	
	void animal () {
		System.out.println("Animal: "+animal);
	}
	void especie () {
		System.out.println("Espécie: "+especie);
	}
	void tipoDeAlimento () {
		System.out.println("Classe Alimentar: "+classeAlimentar);
	}
	void genero () {
		System.out.println("Gênero: "+genero);
	}
	void corDaPelagem () {
		System.out.println("Anos de vida: "+anosDeVida);
	}
	

}
