package colecoes;

import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoHashSetHomoheneo {
    public static void main(String[] args) {
        HashSet<String> lista = new HashSet<>(); //o HashSet nao tem ordem nem index, nesse caso só aceita Strings
        lista.add("Ana");
        lista.add("Carlos");
        lista.add("Lucas");
        lista.add("Joao");

        for(String candidato : lista){
            System.out.println(candidato);
        }
        
        SortedSet<Integer> numeros = new TreeSet<>(); //nesse caso ordena por inserção
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);

        for(Integer num : numeros){
            System.out.println(num);
        }
    }
}
