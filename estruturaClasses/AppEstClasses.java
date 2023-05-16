import classes.Comida;
import classes.Pessoa;

public class AppEstClasses {
    public static void main(String[] args) throws Exception {
        
        Comida c1 = new Comida(3, "hamburger");
        Comida c2 = new Comida(2, "torta");

        Pessoa p1 = new Pessoa(75, "Joao");

        p1.comer(c1);
        p1.comer(c2);
    }
}
