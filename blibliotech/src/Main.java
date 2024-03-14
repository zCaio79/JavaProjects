import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean isSystemOn = true;
        int choose = 0;
        Scanner scanner = new Scanner(System.in);

        String nomelivro = null;
        String autor = null;
        String editora = null;
        String isbn = null;
        int anopubli = 0;

        Livro livro;
        Usuario user;

        ArrayList<Livro> acervo = new ArrayList<>();
        ArrayList<Usuario> usuarios = new ArrayList<>();

        usuarios.add(user = new Usuario("caraio","caraio",4545456,"aasdasd"));
        //looping system

        while (isSystemOn){
            //cadastrar livro, cadastrar usuario
            choose =1;
            switch (choose){
                case 1:
                    System.out.print("Digite o Nome do Livro: ");
                    nomelivro = scanner.nextLine();
                    System.out.print("Digite o Nome do Autor: ");
                    autor = scanner.nextLine();
                    System.out.print("Digite o Nome da Editora: ");
                    editora = scanner.nextLine();
                    System.out.print("Digite o ISBN do Livro: ");
                    isbn = scanner.nextLine();
                    System.out.print("Digite o Ano de Publicação: ");
                    anopubli = scanner.nextInt();
                    acervo.add(livro = new Livro(nomelivro,autor,editora,isbn,anopubli));
                    limpaChat();
                    System.out.printf("\nLivro Cadastrado na Biblioteca!\n\n\tLivro: %s\n\tAutor: %s\n\tEditora: %s\n\tISBN: %s\n\tAno Publicação: %d",
                            nomelivro,autor,editora,isbn,anopubli);
                    break;
            }


        }
    }
    public static void limpaChat(){
        System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }
}