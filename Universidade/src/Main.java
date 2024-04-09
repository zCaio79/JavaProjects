import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        boolean isSystemOn = true;
        boolean disciplinaAdded = false;
        boolean cursoAdded = false;
        int i = 0;
        int cont = 0;
        int choose = 0;
        int option = 0;

        Pessoa pessoa;
        Curso curso;
        Disciplina disciplina;

        ArrayList<Curso> cursos = new ArrayList<>();
        ArrayList<Disciplina> disciplinas = new ArrayList<>();

        String nomeInput;
        String search;
        int cpfInput;
        int idadeInput;

        Scanner scanner = new Scanner(System.in);

        while (isSystemOn) {
            i = 0;
            cont = 0;
            cursoAdded = false;
            disciplinaAdded = false;

            System.out.print("\n\t\t( UNIVALE SYSTEM 2.0 )\n\nOptions\n(1) - Adicionar Curso\n\nDigite a opção desejada: ");
            choose = scanner.nextInt();


            switch (choose){

                case 1:
                    while (i==0) {
                        limpaChat();
                        System.out.println("\tCadastro de Curso");
                        System.out.printf("\nDigite o nome do Curso: ");
                        nomeInput = scanner.next();
                        curso = new Curso(nomeInput);
                        for (Curso cursoPivo : cursos){
                            if (nomeInput.equals(cursoPivo.getNome()))
                                cursoAdded = true;
                            else
                                cursoAdded = false;
                        }

                        if ((nomeInput != "") && (!cursoAdded)) {


                            if (!disciplinas.isEmpty()) {

                                while (cont == 0) {

                                    limpaChat();
                                    System.out.println("\tAdicionar disciplinas ao Curso\n");

                                    for (Disciplina disciplinaPivo : disciplinas) {
                                        System.out.printf("\n+ %s", disciplinaPivo.getNome());
                                    }

                                    System.out.print("\nDigite o nome da disciplina ou 0 pular etapa:");
                                    search = scanner.next();
                                    for (Disciplina disciplinaPivo : disciplinas) {
                                        if (search.equals(disciplinaPivo.getNome())) {
                                            limpaChat();
                                            curso.addDisciplina(disciplinaPivo);
                                            disciplinaAdded = true;
                                            try {
                                                Thread.currentThread().sleep(3000);
                                            } catch (InterruptedException ex) {
                                            }
                                        }
                                    }
                                    if (search.equals("0")){
                                        cont = 1;
                                        System.out.printf("\nCurso %s Adicionado com Sucesso!!\n",curso.getNome());
                                    }
                                    else if (disciplinaAdded){
                                        cont = 1;
                                        limpaChat();
                                        System.out.printf("\nCurso %s Adicionado com Sucesso!!\n",curso.getNome());
                                    }
                                    else {
                                        limpaChat();
                                        System.out.println("Disciplina não encontrada, tente novamente...");
                                        try {
                                            Thread.currentThread().sleep(2000);
                                        } catch (InterruptedException ex) {
                                        }
                                    }

                                }
                                i = 1;

                            } else {
                                limpaChat();
                                System.out.printf("\nCurso %s Adicionado com Sucesso!!\n",curso.getNome());
                                System.out.println("Não há disciplinas disponiveis, adicione-as posteriormente...");
                                i = 1;
                            }
                            try {
                                Thread.currentThread().sleep(4000);
                            } catch (InterruptedException ex) {
                            }
                            limpaChat();
                            cursos.add(curso);

                        } else if (!cursoAdded) {
                            limpaChat();
                            System.out.println("Nome Inválido, tente novamente...");
                            try {
                                Thread.currentThread().sleep(2000);
                            } catch (InterruptedException ex) {
                            }
                        }else{
                            limpaChat();
                            System.out.println("Curso já existente...");
                            try {
                                Thread.currentThread().sleep(2000);
                            } catch (InterruptedException ex) {
                            }
                        }
                    }
                    break;
            }

        }
    }
    private static void limpaChat(){
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }
}