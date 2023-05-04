package oo.polimorfismo;

public class Sorvete extends Comida {

	public Sorvete(double peso) {
		super(peso);
	}

	public void somaPeso(int peso){
		System.out.println("soma do peso" + this.getPeso() + peso);
	}
}
