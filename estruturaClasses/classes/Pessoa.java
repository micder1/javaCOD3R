package classes;

public class Pessoa {
    private double pesoPessoa;
    private String nomePessoa;
    
    public Pessoa(double pesoPessoa, String nomePessoa) {
        this.pesoPessoa = pesoPessoa;
        this.nomePessoa = nomePessoa;
    }

    public double getPesoPessoa() {
        return pesoPessoa;
    }

    public void setPesoPessoa(double pesoPessoa) {
        this.pesoPessoa = pesoPessoa;
    }

    public String getNomePessoa() {
        return nomePessoa;
    }

    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }

    public void comer(Comida c) throws Exception{
        if(c != null){
            double pesoFinal = this.pesoPessoa + c.getPesoComida();
            this.setPesoPessoa(pesoFinal);
            System.out.println(this.nomePessoa + " jantou " + c.getNomeComida() + " e agora pesa : " + this.pesoPessoa);
        }else
            throw new Exception("Comida inválida");
    }

    
}
