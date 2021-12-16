package br.com.generation.classeseobjeto;

public class Aviao {
	
	//ATRIBUTOS
	int passageiros, capMaxima, velocidade;
	String cor, modelo, destino;
	
	//METODOS
	void ligar() {
		System.out.println("Ligue o avião");
	}
	
	void decolar() {
		System.out.println("O aviao está decolando");
	}
	void voar() {
		System.out.println("O avião já está voando");
	}
	
	void pousar() {
		System.out.println("O avião já está pousando");
	}
	void desligar() {
		System.out.println("Desligue o avião");
	}
	
	double taxaOcupacao() {
		return passageiros / capMaxima;
		
	} 
	void veloMaxima(int velocidade) {
		if (velocidade <= 500) {
			System.out.println("Sua velocidade está dentro do limite");
			
		}
		else {
			System.out.println("Você ultrapassou a velocidade permitida");
			
		}
			}
}
