
public class Usuario {
    private String nome;
    private String endereco;
    private String email;
    private String telefone;
    private int numEmprestimos;

    public Usuario(String  nome,String endereco, String email,String telefone){
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.numEmprestimos = 0;
    }

    public int getNumEmprestimos() {
        return numEmprestimos;
    }

    public void setNumEmprestimos(int numEmprestimos) {
        this.numEmprestimos = numEmprestimos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
