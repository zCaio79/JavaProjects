import Entidades.Funcionario;
import Entidades.Gerente;
import Entidades.Programador;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        Funcionario funcionario = null;
        Iterator<Funcionario> iterator;

        boolean isSystemOn = true;
        boolean isDeleted;
        boolean targetOk;
        boolean isEdited;

        int opcao = 0;
        String nome = null;

        Scanner scanner = new Scanner(System.in);

        while(isSystemOn){

            isDeleted = false;
            isEdited = false;
            targetOk = false;
            iterator = funcionarios.iterator();

            System.out.println("\n\t\tOptions\n(1) - Create Funcionário\n(2) - Update Funcionário\n" +
                    "(3) - Delete Funcionário\n(4) - List Funcionários\n(0) - SAIR\nDigite a Opção Desejada: ");
            opcao = scanner.nextInt();
            switch(opcao){

                //Criar

                case 1:
                    funcionario = Funcionario.createFuncionario();
                    funcionarios.add(funcionario);
                    System.out.println("Funcionário Cadastrado com Sucesso!");
                    break;

                //Editar

                case 2:
                    if(!funcionarios.isEmpty()) {
                        System.out.println("\n\t\t-- Editar --");
                        while (!isEdited) {
                            for (Funcionario funcionariopivot : funcionarios) {
                                System.out.println(funcionariopivot.getNome());
                            }
                            System.out.print("Digite o nome do Funcionario Desejado: ");
                            nome = scanner.next();
                            for (Funcionario funcionariopivot : funcionarios) {
                                if (funcionariopivot.getNome().equals(nome)) {
                                    funcionariopivot = Funcionario.updateFuncionario(funcionariopivot);
                                    isEdited = true;
                                    targetOk = true;
                                }
                                if(!targetOk){
                                    System.out.println("Funcionario Não Encontrado!");
                                }
                            }
                        }
                    }else {
                        System.out.println("Não há Funcionários...");
                    }
                    break;

                //Deletar

                case 3:
                    if(!funcionarios.isEmpty()) {
                        System.out.println("\n\t\t-- Deletar --");
                        while (!isDeleted) {
                            for (Funcionario funcionariopivot : funcionarios) {
                                System.out.println(funcionariopivot.getNome());
                            }
                            System.out.print("Digite o nome do Funcionario Desejado: ");
                            nome = scanner.next();
                            while (iterator.hasNext()) {
                                funcionario = iterator.next();
                                if (funcionario.getNome().equals(nome)) {
                                    iterator.remove();
                                    System.out.println("Funcionário Removido com Sucesso!");
                                    isDeleted = true;
                                    targetOk = true;
                                }
                                if(!targetOk){
                                    System.out.println("Funcionario Não Encontrado!");
                                }
                            }
                        }
                    }else {
                        System.out.println("Não há Funcionários...");
                    }
                    break;

                //Listar

                case 4:
                    if(!funcionarios.isEmpty()) {
                        System.out.println("\n\t\t-- Funcionarios --\n");
                        for (Funcionario funcionariopivot : funcionarios) {
                            System.out.println("Nome: " + funcionariopivot.getNome());
                            System.out.println("Cargo: " + funcionariopivot.getCargo());
                            System.out.println("Salario: R$" + funcionariopivot.getSalario() + "\n\n");
                        }
                    }else
                        System.out.println("Não há Funcionários...");
                    break;

                //Sair

                case 0:
                    isSystemOn = false;
                    break;
                default:
                    System.out.println("Opção Inválida...");
                    break;
            }

        }
    }
}
