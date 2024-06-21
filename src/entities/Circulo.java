package entities;

import entities.enums.Cor;

public class Circulo extends Forma {

	public Double raio;
	
	public Circulo() {
		super();
	}

	public Double getRaio() {
		return raio;
	}

	public void setRaio(Double raio) {
		this.raio = raio;
	}

	public Circulo(Cor cor, Double raio) {
		super(cor);
		this.raio = raio;
	}


	@Override
	public double area() {
		return Math.PI * raio * raio;
	}
	

	
	
}
