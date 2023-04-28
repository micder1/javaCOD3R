package classes;

public class Comida {
    private double pesoComida;
    private String nomeComida;
    
    public Comida(double pesoComida, String nomeComida) {
        this.pesoComida = pesoComida;
        this.nomeComida = nomeComida;
    }

    public double getPesoComida() {
        return pesoComida;
    }

    public void setPesoComida(double pesoComida) {
        this.pesoComida = pesoComida;
    }

    public String getNomeComida() {
        return nomeComida;
    }

    public void setNomeComida(String nomeComida) {
        this.nomeComida = nomeComida;
    }

}
