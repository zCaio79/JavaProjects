import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while(i == 0) {
            System.out.printf("ESCOLHA SUA CLASSE%n1 - Guerreiro%n2 - Mago%n3 - Arqueiro%n");
            int classe = scanner.nextInt();
            String nome;
            if (classe == 1) {
                System.out.print("Digite o Nome do seu Guerreiro: ");
                nome = scanner.next();
                Guerreiro player = new Guerreiro(nome);
                System.out.println(player.name + " o Guerreiro foi Invocado");
                i = 1;
            } else if (classe == 2) {
                System.out.print("Digite o Nome do seu Mago: ");
                nome = scanner.next();
                Mago player = new Mago(nome);
                System.out.println(player.name + " o Mago foi Invocado");
                i = 1;
            } else if (classe == 3) {
                System.out.print("Digite o Nome do seu Arqueiro: ");
                nome = scanner.next();
                Arqueiro player = new Arqueiro(nome);
                System.out.println(player.name + " o Arqueiro foi Invocado");

                i = 1;
            } else {
                System.out.println("Opção invalida!");
            }
        }
        
    }

}
