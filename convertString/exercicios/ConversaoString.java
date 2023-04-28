package exercicios;

import javax.swing.JOptionPane;

public class ConversaoString {

    public static void main(String[] args) {
        String val1 = JOptionPane.showInputDialog("Digite o primeiro valor:");

        String val2 = JOptionPane.showInputDialog("Digite o segundo valor: ");

        Double n1 = Double.parseDouble(val1);
        Double n2 = Double.parseDouble(val2);

        Double soma = n1 + n2;

        System.out.println("soma dos dois valores: " + soma);
    }
    
}
