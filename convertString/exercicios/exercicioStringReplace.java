package exercicios;

import java.util.*;

public class exercicioStringReplace {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Primeiro valor: ");
        String v1 = scan.next().replace(",", ".");

        System.out.println("Segundo valor: ");
        String v2 = scan.next().replace(",", ".");

        System.out.println("Terceiro valor: ");
        String v3 = scan.next().replace(",", ".");

        Double d1 = Double.parseDouble(v1);
        Double d2 = Double.parseDouble(v2);
        Double d3 = Double.parseDouble(v3);

        Double med = (d1 + d2 + d3)/3;

        System.out.println("A media dos valores é:" + med);

        scan.close();
    }
    
}
