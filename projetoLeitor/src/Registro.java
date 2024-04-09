
import java.text.SimpleDateFormat;
import java.util.Calendar;



public class Registro {
    private Carro carro;
    private Funcionario funcionario;
    private String hora;
    private String caminho_percorrido;
    private String tipo;

    public Registro(Carro carro, Funcionario funcionario, String caminho_percorrido, String tipo) {

        this.carro = carro;
        this.funcionario = funcionario;
        this.hora = new SimpleDateFormat("dd/MM/yyyy HH:mm").format(Calendar.getInstance().getTime());;
        this.caminho_percorrido = caminho_percorrido;
        this.tipo = tipo;
    }

    public Carro getCarro() {
        return carro;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public String getHora() {
        return hora;
    }

    public String getCaminho_percorrido() {
        return caminho_percorrido;
    }

    public String getTipo() {
        return tipo;
    }
}
