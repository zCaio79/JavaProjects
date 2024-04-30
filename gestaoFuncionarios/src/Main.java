import Entidades.Funcionario;
import Entidades.Gerente;
import Entidades.Programador;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        Funcionario caio = new Gerente("Caio Mendes");
        Funcionario juca = new Programador("Caio Mendes");
        caio = caio.updateFuncionario(caio);
        System.out.println(caio.getNome() + caio.getCargo() + caio.getSalario());
        System.out.println(juca.getNome() + juca.getCargo() + juca.getSalario());


    }
}