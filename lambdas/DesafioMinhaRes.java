package lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMinhaRes {
    public static void main(String[] args) {
        
        Produto p1 = new Produto("notebook", 3500.00, 0.1);


        Function<Produto, Double> valFinal = 
            (p) ->  p.getPreco()*(1.0 - p.getDesconto());

        UnaryOperator<Double> valImposto = 
            (val) -> val >= 2500 ? val + val*0.085f : val;
        
        UnaryOperator<Double> valFrete = 
            (val) -> val >= 3000 ? val + 100f : val + 50f;

        Function<Double, String> valArredondado = 
            (val) -> String.format("%.2f", val);

        String valTotalFormatado = valFinal.andThen(valImposto)
            .andThen(valFrete)
            .andThen(valArredondado)
            .apply(p1); 

        System.out.println(valTotalFormatado);
    }
}
