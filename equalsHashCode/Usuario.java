public class Usuario {
    public String email;
    public String nome;
    public int cpf;
    
    public Usuario(String email, String nome, int cpf) {
        this.email = email;
        this.nome = nome;
        this.cpf = cpf;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + cpf;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Usuario){
            return ((Usuario) obj).cpf == (this.cpf);
        }else{
            return false;
        }
    }
}
