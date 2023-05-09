package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;

public class MeuDesafioFilter {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        String func;

        System.out.println("Deseja filtrar os agentes por qual funcao?");
        func = sc.nextLine();
        final String funcFinal = func.toLowerCase();
        
        Agente d1 = new Agente("Jett", "duelista", 52.6);
        Agente d2 = new Agente("Raze", "duelista", 53.7);
        Agente d3 = new Agente("Phoenix", "duelista", 49.7);
        Agente d4 = new Agente("Neon", "duelista", 50.7);
        Agente d5 = new Agente("Yoru", "duelista", 49.7);
        Agente d6 = new Agente("Raze", "duelista", 54.7);
        Agente d7 = new Agente("Reyna", "duelista", 48.2);
        Agente c1 = new Agente("Brim", "controlador", 51.6);
        Agente c2 = new Agente("Astra", "controlador", 51.6);
        Agente c3 = new Agente("Omen", "controlador", 49.6);
        Agente c4 = new Agente("Harbor", "controlador", 52.6);
        Agente c5 = new Agente("Viper", "controlador", 50.6);
        Agente s1 = new Agente("Killjoy", "sentinela", 53.1);
        Agente s2 = new Agente("Chamber", "sentinela", 49.1);
        Agente s3 = new Agente("Cypher", "sentinela", 50.3);
        Agente s4 = new Agente("Sage", "sentinela", 50.3);
        Agente i1 = new Agente("Skye", "iniciador", 51.6);
        Agente i2 = new Agente("Fade", "iniciador", 49.6);
        Agente i3 = new Agente("Breach", "iniciador", 52.6);
        Agente i4 = new Agente("kayo", "iniciador", 54.6);
        Agente i5 = new Agente("Gekko", "iniciador", 51.6);
        Agente i6 = new Agente("Sova", "iniciador", 47.9);
        
        List<Agente> agentes = Arrays.asList(d1,d2,d3,d4,d5,d6,d7,c1,c2,c3,c4,
        c5,s1,s2,s3,s4,i1,i2,i3,i4,i5,i6);

        Predicate<Agente> filtroFuncao = a -> funcFinal.equals(a.getFuncao());
        Predicate<Agente> filtroWinRate = a -> a.getWinRate() > 50.0;

        Function<Agente, String> print = a -> "Agente: " + a.getNome() + " / winRate: " + a.getWinRate() + "%";

        System.out.println(funcFinal + " com winrate maior que 50 %");

        agentes.stream()
            .filter(filtroFuncao)
            .filter(filtroWinRate)
            .map(print)
            .forEach(System.out::println);

        sc.close();
    }
}
