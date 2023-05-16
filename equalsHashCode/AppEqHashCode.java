import java.util.*;

public class AppEqHashCode {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        Usuario u1 = new Usuario("u1@hotmail.com", "joao", 12345);
        Usuario u2 = new Usuario("u1@hotmail.com", "joao", 12345);
        Usuario u3 = new Usuario("u2@hotmail.com", "marcos", 54321);
        
    
        System.out.println((u1.hashCode()) == (u2.hashCode()));
        System.out.println(u1.equals(u2));
        System.out.println(u2.hashCode() == u3.hashCode());
        System.out.println(u2.equals(u3));

        scan.close();
    }
}
