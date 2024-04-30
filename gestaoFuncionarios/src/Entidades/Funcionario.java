package Entidades;

import java.util.Scanner;

public class Funcionario {

    private String nome;
    private String cargo;
    private double salario;

    public Funcionario(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public Funcionario backupClone() {
        Funcionario clone = new Funcionario(nome, cargo, salario);
        clone.setNome(this.nome);
        clone.setCargo(this.cargo);
        clone.setSalario(this.salario);
        return clone;
    }

    public Funcionario updateFuncionario(Funcionario funcionariopivot) {

        Funcionario backup = funcionariopivot.backupClone();

        Scanner sc = new Scanner(System.in);
        boolean isUpdated = false;
        int op = 0;
        String nome = null;
        String cargo = null;
        double salario = 0;

        while (!isUpdated) {
            System.out.println("\n\t\tFuncionário\n");
            System.out.println("Nome: " + funcionariopivot.getNome());
            System.out.println("Cargo: " + funcionariopivot.getCargo());
            System.out.println("Salário: R$" + funcionariopivot.getSalario());

            System.out.println("\n(1) - Editar Nome \n(2) - Editar Cargo\n(3) - Editar Salario\n" +
                    "(4) - SALVAR\n(0) - CANCELAR");
            System.out.print("Selecione uma opção: ");
            op = sc.nextInt();

            switch (op){
                case 1:
                    System.out.print("\nNome atual: " + funcionariopivot.getNome() + "\nNovo Nome: ");
                    nome = sc.next();
                    funcionariopivot.setNome(nome);
                    System.out.print("\nNome atualizado com sucesso!");
                    break;
                case 2:
                    System.out.print("\nCargo atual: " + funcionariopivot.getCargo() + "\nNovo Cargo: ");
                    cargo = sc.next();
                    funcionariopivot.setCargo(cargo);
                    System.out.print("\nCargo atualizado com sucesso!");
                    break;
                case 3:
                    System.out.print("\nSalário atual: R$" + funcionariopivot.getSalario() + "\nNovo Salário: ");
                    salario = Double.parseDouble(sc.next());
                    funcionariopivot.setSalario(salario);
                    System.out.print("\nSalário atualizado com sucesso!");
                    break;
                case 0:
                    isUpdated = true;
                    System.out.println("\nOperação Cancelada!");
                    return backup;
                case 4:
                    System.out.println("\nOperação Concluida!");
                    return funcionariopivot;
            }
        }
        return backup;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
