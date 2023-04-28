package colecoes;

import java.util.*;

public class ConjuntoSetHeterogeneo {
    @SuppressWarnings({"rawtypes", "unchecked"}) //ignora os avisos
    public static void main(String[] args) {
        //set nao aceita valor repetido

        HashSet conjunto = new HashSet();

        //adicionando elementos no HashSet:

        conjunto.add(1.2); //o proprio java converte do tipo primitivo double pro objeto Double
        conjunto.add(true);
        conjunto.add("Teste");
        conjunto.add(1);
        conjunto.add('X');

        //para mostrar o HashSet basta usar print
        System.out.println(conjunto);

        //metodo size retorna o tamanho do HashSet
        System.out.println("tamanho do hashSet: " + conjunto.size()); //deve ser 5

        conjunto.add("Teste"); //tentei inserir um objeto que ja existe no HashSet, logo, ele nao será inserido

        System.out.println("tamanho : " + conjunto.size()); //deve ser 5 novamente

        conjunto.add(50);

        System.out.println("tamanho após adiçao: " + conjunto.size());

        //removendo elementos: metodo remove()
        conjunto.remove(1);
        System.out.println("tamanho após remoçao: " + conjunto.size()); //5

        //testa se um elemento está presente no HashSet: metodo contains()
        System.out.println(conjunto.contains("Teste"));

        //unindo conjuntos: metodo addAll()
        Set numeros = new HashSet();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);

        System.out.println("HashSet numeros: " +numeros);
        System.out.println("HashSet conjunto: " +conjunto);

        conjunto.addAll(numeros); //Uniao
        System.out.println("HashSet conjunto após a uniao com o numeros" +conjunto);

        //interseçao entre dois : retainAll()
        Set numeros2 = new HashSet();
        numeros2.add(1);
        numeros2.add(2);
        numeros2.add(3);

        conjunto.retainAll(numeros2);
        System.out.println("HashSet conjunto após a interseçao" +conjunto);
        

    }
}
