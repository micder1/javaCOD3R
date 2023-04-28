package exercicios;

public class desafioFor {
    public static void main(String[] args) {
        String val = "#";
    
        for(val = "#" ; !(val.equals("######")) ; val += "#"){
            System.out.println(val);
        }
    }
}
