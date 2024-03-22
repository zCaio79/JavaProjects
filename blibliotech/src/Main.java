import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean isSystemOn = true;
        int choose = 0;
        int i = 0;
        int opcao = 0;

        String search = null;

        Scanner scanner = new Scanner(System.in);

        String nomelivro_nomeusuario = null;
        String autor_endereco = null;
        String editora = null;
        String isbn_email = null;
        String ano_telefone = null;

        Livro livro;
        Usuario user;
        Registro registro;

        ArrayList<Livro> acervo = new ArrayList<>();
        ArrayList<Usuario> usuarios = new ArrayList<>();
        ArrayList<Registro> registros = new ArrayList<>();

        //looping system

        while (isSystemOn) {
            i = 0;
            limpaChat();
            System.out.printf("\t\tBibliotech\n\n(1) - Cadastrar Livro\n(2) - Cadastrar Usuário\n(3) - Consultar Acervo\n" +
                    "(4) - Emprestar Livro\n(5) - Devolver Livro\n(6) - Gerar Registros\n(0) - Sair\nSelecione a opção desejada: ");
            choose = scanner.nextInt();

            switch (choose) {

                //Sair

                case 0:
                    System.out.println("Sistema Finalizado!");
                    isSystemOn = false;
                    break;

                //Cadastrar Livro
                case 1:
                    limpaChat();
                    System.out.println("\t\tCadastro de Livro");
                    while (i == 0) {

                        System.out.println("\nDigite o Nome do Livro: ");
                        nomelivro_nomeusuario = scanner.next();
                        System.out.println("\nDigite o Nome do Autor: ");
                        autor_endereco = scanner.next();
                        System.out.println("\nDigite o Nome da Editora: ");
                        editora = scanner.next();
                        System.out.println("\nDigite o ISBN do Livro: ");
                        isbn_email = scanner.next();
                        System.out.println("\nDigite o Ano de Publicação: ");
                        ano_telefone = scanner.next();

                        if ((nomelivro_nomeusuario != "") && (autor_endereco != "") && (editora != "") && (isbn_email != "") && (ano_telefone != "")) {
                            acervo.add(livro = new Livro(nomelivro_nomeusuario, autor_endereco, editora, isbn_email, ano_telefone));
                            limpaChat();
                            System.out.printf("\nLivro Cadastrado na Biblioteca!\n\n\tLivro: %s\n\tAutor: %s\n\tEditora: %s\n\tISBN: %s\n\tAno Publicação: %s",
                                    nomelivro_nomeusuario, autor_endereco, editora, isbn_email, ano_telefone);
                            try {
                                Thread.currentThread().sleep(3000);
                            } catch (InterruptedException ex) {
                            }
                            i = 1;
                        } else {
                            limpaChat();
                            System.out.print("\nAlguma informação inválida, Tente Novamente!");
                        }
                        try {
                            Thread.currentThread().sleep(3000);
                        } catch (InterruptedException ex) {
                        }
                        limpaChat();
                    }
                    break;

                //Cadastrar Usuário

                case 2:
                    limpaChat();
                    System.out.println("\t\tCadastro de Usuário");
                    while (i == 0) {
                        try {
                            Thread.currentThread().sleep(1500);
                        } catch (InterruptedException ex) {
                        }

                        System.out.print("\nDigite o Nome do Usuário: ");
                        nomelivro_nomeusuario = scanner.next();
                        System.out.print("\nDigite o Endereço do Usuário: ");
                        autor_endereco = scanner.next();
                        System.out.print("\nDigite o email do Usuário: ");
                        isbn_email = scanner.next();
                        System.out.print("\nDigite o telefone do Usuário: ");
                        ano_telefone = scanner.next();

                        if ((nomelivro_nomeusuario != "") && (autor_endereco != "") && (isbn_email != "") && (ano_telefone != "")) {
                            usuarios.add(user = new Usuario(nomelivro_nomeusuario, autor_endereco, isbn_email, ano_telefone));
                            limpaChat();
                            System.out.printf("\nUsuário Cadastrado na Biblioteca!\n\n\tNome: %s\n\tEndereço: %s\n\tEmail: %s\n\tTelefone: %s",
                                    nomelivro_nomeusuario, autor_endereco, isbn_email, ano_telefone);
                            try {
                                Thread.currentThread().sleep(3000);
                            } catch (InterruptedException ex) {
                            }
                            i = 1;
                            limpaChat();

                        } else {
                            limpaChat();
                            System.out.print("\nAlguma informação inválida, Tente Novamente!");
                            try {
                                Thread.currentThread().sleep(3000);
                            } catch (InterruptedException ex) {
                            }
                        }
                        limpaChat();
                    }
                    break;

                //Consultar Acervo

                case 3:
                    limpaChat();
                    while (i == 0) {

                        if (acervo.size() > 0) {

                            System.out.println("\n\t\tConsulta\n\nInsira o Titulo ou ISBN do Livro desejado:");
                            search = scanner.next();

                            for (Livro livropivo : acervo) {
                                if ((livropivo.getTitulo().equals(search)) || (livropivo.getAutor().equals(search)) ||
                                        (livropivo.getIsbn().equals(search))) {

                                    System.out.println("Livro Encontrado!!");
                                    System.out.printf("\n\tTitulo: %s\n\tAutor: %s\n\tEditora: %s\n\tISBN: %s\n\tAno Publicação: %s\n\tDisponivel: %s\n",
                                            livropivo.getTitulo(), livropivo.getAutor(), livropivo.getEditora(), livropivo.getIsbn(), livropivo.getAnopubli(), livropivo.disponibilidade());
                                    try {
                                        Thread.currentThread().sleep(6000);
                                    } catch (InterruptedException ex) {
                                    }
                                    i = 1;
                                } else {
                                    limpaChat();
                                    System.out.println("Livro não Encontrado, Tente Novamente!");
                                    try {
                                        Thread.currentThread().sleep(2000);
                                    } catch (InterruptedException ex) {
                                    }
                                }

                            }
                        } else {
                            System.out.println("Não há Livros no acervo...");
                            try {
                                Thread.currentThread().sleep(2000);
                            } catch (InterruptedException ex) {
                            }
                            i = 1;
                        }
                    }
                    break;

                    //Emprestar Livro
                case 4:
                    if (acervo.size() > 0) {
                        limpaChat();
                        System.out.println("\t\tEmprestar Livro");
                        while (i == 0) {

                            System.out.println("\n\nInsira o Titulo ou ISBN do Livro desejado:");
                            search = scanner.next();
                            limpaChat();
                            for (Livro livropivo : acervo) {

                                if ((livropivo.getTitulo().equals(search)) || (livropivo.getAutor().equals(search)) ||
                                        (livropivo.getIsbn().equals(search))) {

                                    System.out.print("\nLivro Encontrado!!");
                                    if (livropivo.isDisponivel()) {

                                        System.out.printf("\n\tTitulo: %s\n\tAutor: %s\n\tEditora: %s\n\tISBN: %s\n\tAno Publicação: %s\n\tDisponivel: %s\n",
                                                livropivo.getTitulo(), livropivo.getAutor(), livropivo.getEditora(), livropivo.getIsbn(), livropivo.getAnopubli(), livropivo.disponibilidade());
                                        System.out.print("\nDeseja Emprestar Este Livro?\n(1) - SIM\n(2) - NÃO\n");
                                        opcao = scanner.nextInt();

                                        if (opcao == 1) {
                                            limpaChat();
                                            registros.add(registro = new Registro(livropivo, "Emprestimo", "02/02/2002"));
                                            livropivo.devolverEmprestar(false);
                                            limpaChat();
                                            System.out.print("\nLivro emprestado Com Sucesso!!\n");
                                            try {
                                                Thread.currentThread().sleep(3000);
                                            } catch (InterruptedException ex) {
                                            }
                                            i = 1;
                                        } else {
                                            limpaChat();
                                            System.out.print("\nOperação Cancelada!!\n");
                                            try {
                                                Thread.currentThread().sleep(3000);
                                            } catch (InterruptedException ex) {
                                            }
                                            i = 1;
                                        }

                                    } else {
                                        limpaChat();
                                        System.out.print("\n Este Livro ja foi Emprestado!! Que tal Outro? ...");
                                        try {
                                            Thread.currentThread().sleep(3000);
                                        } catch (InterruptedException ex) {
                                        }
                                        i = 1;
                                    }


                                } else {
                                    limpaChat();
                                    System.out.println("Livro não Encontrado, Tente Novamente!");
                                    try {
                                        Thread.currentThread().sleep(2000);
                                    } catch (InterruptedException ex) {
                                    }
                                }
                            }

                        }
                    }else{
                        limpaChat();
                        System.out.println("Não há Livros no acervo...");
                        try {
                            Thread.currentThread().sleep(2000);
                        } catch (InterruptedException ex) {
                        }
                    }
                    break;

                case 5:
                    if (acervo.size() > 0) {
                        limpaChat();
                        System.out.println("\t\tDevolver Livro");
                        while (i == 0) {

                            System.out.println("\n\nInsira o Titulo ou ISBN do Livro desejado:");
                            search = scanner.next();
                            limpaChat();
                            for (Livro livropivo : acervo) {

                                if ((livropivo.getTitulo().equals(search)) || (livropivo.getAutor().equals(search)) ||
                                        (livropivo.getIsbn().equals(search))) {

                                    System.out.print("\nLivro Encontrado!!");
                                    if (!livropivo.isDisponivel()) {

                                        System.out.printf("\n\tTitulo: %s\n\tAutor: %s\n\tEditora: %s\n\tISBN: %s\n\tAno Publicação: %s\n\tDisponivel: %s\n",
                                                livropivo.getTitulo(), livropivo.getAutor(), livropivo.getEditora(), livropivo.getIsbn(), livropivo.getAnopubli(), livropivo.disponibilidade());
                                        System.out.print("\nDeseja Devolver Este Livro?\n(1) - SIM\n(2) - NÃO\n");
                                        opcao = scanner.nextInt();

                                        if (opcao == 1) {
                                            limpaChat();
                                            registros.add(registro = new Registro(livropivo, "Devolução", "02/02/2002"));
                                            livropivo.devolverEmprestar(true);
                                            limpaChat();
                                            System.out.print("\nLivro emprestado Com Sucesso!!\n");
                                            try {
                                                Thread.currentThread().sleep(3000);
                                            } catch (InterruptedException ex) {
                                            }
                                            i = 1;
                                        } else {
                                            limpaChat();
                                            System.out.print("\nOperação Cancelada!!\n");
                                            try {
                                                Thread.currentThread().sleep(3000);
                                            } catch (InterruptedException ex) {
                                            }
                                            i = 1;
                                        }

                                    } else {
                                        limpaChat();
                                        System.out.print("\n Este Livro Ainda não foi Emprestado...");
                                        try {
                                            Thread.currentThread().sleep(3000);
                                        } catch (InterruptedException ex) {
                                        }
                                        i = 1;
                                    }


                                } else {
                                    limpaChat();
                                    System.out.println("Livro não Encontrado, Tente Novamente!");
                                    try {
                                        Thread.currentThread().sleep(2000);
                                    } catch (InterruptedException ex) {
                                    }
                                }
                            }

                        }
                    }else{
                        limpaChat();
                        System.out.println("Não há Livros no acervo...");
                        try {
                            Thread.currentThread().sleep(2000);
                        } catch (InterruptedException ex) {
                        }
                    }
                    break;

                case 6:
                    limpaChat();
                    System.out.println("\t\tREGISTROS\n");
                    for (Registro registropivo: registros){
                        if(registropivo.getTipoRegistro() == "Emprestimo") {
                            System.out.printf("%s:\nLivro : %s \t ISBN: %s \t Prazo:%s\n",registropivo.getTipoRegistro(),
                                    registropivo.getLivro().getTitulo(),registropivo.getLivro().getIsbn(),registropivo.getData());

                        }else {
                            System.out.printf("%s:\nLivro : %s \t ISBN: %s \t Data Devolução:%s\n",registropivo.getTipoRegistro(),
                                    registropivo.getLivro().getTitulo(),registropivo.getLivro().getIsbn(),registropivo.getData());

                        }
                        try {
                            Thread.currentThread().sleep(6000);
                        } catch (InterruptedException ex) {
                        }
                    }
                    break;

                default:
                    limpaChat();
                    System.out.println("Opção Inválida");
                    try {
                        Thread.currentThread().sleep(2000);
                    } catch (InterruptedException ex) {
                    }
                    break;


            }
        }
    }
    public static void limpaChat(){
        System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }
}