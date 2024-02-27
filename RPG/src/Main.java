import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while(i == 0) {
            System.out.printf("ESCOLHA SUA CLASSE%n1 - Guerreiro%n2 - Mago%n3 - Arqueiro%n");
            int classe = scanner.nextInt();

            if (classe == 1) {
                Guerreiro caio = new Guerreiro("caio");
                System.out.println(caio.name + " o Guerreiro foi Invocado");
                i = 1;
            } else if (classe == 2) {
                Mago caio = new Mago("caio");
                System.out.println(caio.name + " o Mago foi Invocado");
                i = 1;
            } else if (classe == 3) {
                Arqueiro caio = new Arqueiro("caio");
                System.out.println(caio.name + " o Arqueiro foi Invocado");
                i = 1;
            } else {
                System.out.println("Opção invalida!");
            }
        }
        
    }

}
