import java.util.ArrayList;

public class Professor extends Pessoa{

    private ArrayList<Disciplina> disciplinas = new ArrayList<>();
    public Professor(int cpf, String nome, int idade) {
        super(cpf, nome, idade);
    }

    public ArrayList<Disciplina> getDiciplinas() {
        return disciplinas;
    }

    public void setDiciplinas(ArrayList<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }
}
