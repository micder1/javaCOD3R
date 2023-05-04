package oo.polimorfismo;

import java.util.Arrays;
import java.util.List;

public class Jantar {

	public static void main(String[] args) {
		
		Pessoa convidado = new Pessoa(99.65);
	
		Arroz ingrediente1 = new Arroz(0.2);
		Feijao ingrediente2 = new Feijao(0.1);
		Comida ingrediente3 = new Arroz(0.3);
		
		System.out.println(convidado.getPeso());
		
		convidado.comer(ingrediente1);
		convidado.comer(ingrediente2);
		convidado.comer(ingrediente3);
		System.out.println(convidado.getPeso());
		
		Sorvete sobremesa = new Sorvete(0.4);
		
		convidado.comer(sobremesa);
		System.out.println(convidado.getPeso());

		Sorvete sorvete = new Sorvete(10);
		List<Integer> pesos = Arrays.asList(10, 15, 20);

		pesos.forEach(sorvete::somaPeso);
		pesos.forEach((peso) -> sorvete.somaPeso(peso));


	}
}
