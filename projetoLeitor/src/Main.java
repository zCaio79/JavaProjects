import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean isSystemOn = true;
        boolean carroEscolhido = false;
        boolean funcionarioEscolhido = false;

        int op = 0;
        String car_id = "";
        String func_id = "";

        ArrayList<Carro> veiculos = new ArrayList<>();
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        ArrayList<Registro> registros = new ArrayList<>();

        String caminho_percorrido = "Av.Bagual -> Rua Biboca -> Rodovia Sarue";


        veiculos.add(new Carro("C012A","Palio Weekend"));
        veiculos.add(new Carro("C022B","Honda Civic"));
        veiculos.add(new Carro("C042C","Toyota Corolla"));
        veiculos.add(new Carro("C052D","Ford EcoSport"));

        funcionarios.add(new Funcionario("FCN002","Jamal Silva","111.111.111-11"));
        funcionarios.add(new Funcionario("FCN003","Caique Lombra","222.222.222-22"));
        funcionarios.add(new Funcionario("FCN004","Paulo Vieira","333.333.333-33"));
        funcionarios.add(new Funcionario("FCN005","Cleber Jorge","444.444.444-44"));


        while(isSystemOn){

            carroEscolhido = false;
            funcionarioEscolhido = false;

            System.out.println("\n\t\tMenu\n\n1 - (Registrar Saída)\n2 - (Registrar Entrada)\n3 - (Listar Registros)\n" +
                    "Digite a opção desejada:");

            op = scanner.nextInt();

            switch(op){

                case 1:
                    clear();

                    if (!veiculos.isEmpty()) {
                        while (!carroEscolhido) {
                            clear();


                            System.out.println("\nVeiculos Disponiveis:");
                            for (Carro carro_pivot : veiculos) {
                                if (carro_pivot.isDisponivel()) {
                                    System.out.printf("\nVeiculo: %s \tIdentificador: %s", carro_pivot.getMarca(), carro_pivot.getId_carro());
                                }
                            }
                            System.out.print("\n\nInsira o ID do veiculo: ");
                            car_id = scanner.next();
                            for (Carro carro_pivot : veiculos) {
                                if (car_id.equals(carro_pivot.getId_carro())) {
                                    carroEscolhido = true;

                                    while (!funcionarioEscolhido) {

                                        System.out.print("\nInsira a Identificação de Funcionário (ID): ");
                                        func_id = scanner.next();
                                        for (Funcionario funcionario_pivot : funcionarios) {
                                            if (func_id.equals(funcionario_pivot.getId_funcionario())) {

                                                clear();
                                                carro_pivot.setDisponivel(false);
                                                funcionario_pivot.setDisponivel(false);

                                                registros.add(new Registro(carro_pivot, funcionario_pivot, caminho_percorrido, "Saída"));
                                                System.out.println("\nEvento Registrado!");

                                                funcionarioEscolhido = true;
                                            }
                                        }
                                        if (!funcionarioEscolhido) {
                                            System.out.println("\nIdentificador não Reconhecido, tente novamente...");
                                        }

                                    }

                                }
                            }
                            if (!carroEscolhido && func_id.isEmpty()) {
                                System.out.println("\nVeiculo não encontrado, tente novamente...");
                            }
                        }

                    }
                    else{
                        System.out.println("Não há Veiculos!");
                    }
                    break;

                case 2:
                    break;
                case 3:
                    clear();
                    if (!registros.isEmpty()){
                        System.out.println("\t\tRegistros");
                        for (Registro registro_pivot : registros){
                            System.out.printf("\n%s (%s) : Veiculo: %s Id: %s\nFuncionário: %s Identificador: %s\n%s\n\n",
                                    registro_pivot.getTipo(),registro_pivot.getHora(),registro_pivot.getCarro().getMarca(),
                                    registro_pivot.getCarro().getId_carro(),registro_pivot.getFuncionario().getNome(),
                                    registro_pivot.getFuncionario().getId_funcionario(),registro_pivot.getCaminho_percorrido());
                        }
                    }
                    else {
                        System.out.println("Não há Registros!");
                    }
                    break;
                case 4:
                    isSystemOn = false;
                    break;

                default:
                    System.out.println("Opção Inválida, Tente Novamente");
            }
        }

    }
    public static void clear(){
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }
}