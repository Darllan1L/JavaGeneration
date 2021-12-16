package br.com.generation.classeseobjeto;

public class Aviao {
	
	//ATRIBUTOS
	int passageiros, capMaxima, velocidade;
	String cor, modelo, destino;
	
	//METODOS
	void ligar() {
		System.out.println("Ligue o avi�o");
	}
	
	void decolar() {
		System.out.println("O aviao est� decolando");
	}
	void voar() {
		System.out.println("O avi�o j� est� voando");
	}
	
	void pousar() {
		System.out.println("O avi�o j� est� pousando");
	}
	void desligar() {
		System.out.println("Desligue o avi�o");
	}
	
	double taxaOcupacao() {
		return passageiros / capMaxima;
		
	} 
	void veloMaxima(int velocidade) {
		if (velocidade <= 500) {
			System.out.println("Sua velocidade est� dentro do limite");
			
		}
		else {
			System.out.println("Voc� ultrapassou a velocidade permitida");
			
		}
			}
}
