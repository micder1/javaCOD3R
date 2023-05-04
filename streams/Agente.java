package streams;

public class Agente {
    private String nome;
    private String funcao;
    private Double winRate;
    
    public Agente(String nome, String funcao, Double winRate) {
        this.nome = nome;
        this.funcao = funcao;
        this.winRate = winRate;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public Double getWinRate() {
        return winRate;
    }

    public void setWinRate(Double winRate) {
        this.winRate = winRate;
    }

    

}
