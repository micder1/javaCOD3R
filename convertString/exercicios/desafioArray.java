package exercicios;

import java.util.*;

public class desafioArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("quantas notas deseja informar: ");
        int tamanho = scan.nextInt();

        double[] notas = new double[tamanho];

        for(int i = 0 ; i < notas.length ; i++){
            System.out.println("insira a " + (i+1) +"º nota");
            notas[i] = scan.nextDouble();
        }
        double notaTotal = 0;

        for(double nota : notas){
            notaTotal+=nota;
        }

        double media = notaTotal/notas.length;

        System.out.println("Media das notas do aluno: " + media);

        scan.close();
    }
}
