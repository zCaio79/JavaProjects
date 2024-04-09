import java.lang.reflect.Array;
import java.util.ArrayList;

public class Aluno extends Pessoa{
    private float[] notas = new float[2];
    public Aluno(int cpf, String nome, int idade) {
        super(cpf, nome, idade);
        notas[0] = 0;
        notas[1] = 0;
    }
    public void aplicarNota1(float nota1){
        notas[0] = nota1;
    }
    public void aplicarNota2(float nota2){
        notas[1] = nota2;
    }

    public float[] getNotas() {
        return notas;
    }
}
