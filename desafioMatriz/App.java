import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int qtdAlunos, qtdNotas;
        double totNotas = 0;

        System.out.println("Quantos alunos?");
        qtdAlunos = scan.nextInt();

        System.out.println("Quantas notas por Aluno?");
        qtdNotas = scan.nextInt();

        double[][] arrNotas = new double[qtdAlunos][qtdNotas];

        for(int i = 0; i < arrNotas.length ; i++){
            for(int j = 0; j < arrNotas[1].length; j++){
                System.out.println("digite a nota "+ (j+1) +" do aluno "+ (i+1));
                arrNotas[i][j] = scan.nextDouble();
                totNotas += arrNotas[i][j];
            }
        }

        double media = totNotas / (qtdAlunos*qtdNotas);

        System.out.println("media de notas da turma: " + media);

        System.out.println("Notas :");

        for(double[] notasAluno : arrNotas){
            System.out.println(Arrays.toString(notasAluno));
        }

        scan.close();
    }
}
