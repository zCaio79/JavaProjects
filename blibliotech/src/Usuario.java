import java.math.BigInteger;

public class Usuario {
    public String nome;
    public String endereco;
    public BigInteger telefone;
    public String email;

    public Usuario(String  nome,String endereco,BigInteger telefone,String email){
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
    }
}
