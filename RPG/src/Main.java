import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int i = 0;
        int randonMonster;

        Personagem player = null;
        Monstro monster = null;

        boolean isGameOn = true;
        boolean isPlayerAlive = true;
        boolean isMonsterAlive = true;

        while (isGameOn) {
            while (i == 0) {
                //Criação de Personagem & Class select
                System.out.printf("ESCOLHA SUA CLASSE%n1 - Guerreiro%n2 - Mago%n3 - Arqueiro%n");
                int classe = scanner.nextInt();
                String nome;
                if (classe == 1) {
                    System.out.print("Digite o Nome do seu Guerreiro: ");
                    nome = scanner.next();
                    player = new Guerreiro(nome);
                    limpaChat();
                    System.out.println(player.name + " o Guerreiro foi Invocado");
                    try {Thread.currentThread().sleep(3000);} catch (InterruptedException ex) {}
                    i = 1;
                } else if (classe == 2) {
                    System.out.print("Digite o Nome do seu Mago: ");
                    nome = scanner.next();
                    player = new Mago(nome);
                    limpaChat();
                    System.out.println(player.name + " o Mago foi Invocado");
                    try {Thread.currentThread().sleep(3000);} catch (InterruptedException ex) {}
                    i = 1;
                } else if (classe == 3) {
                    System.out.print("Digite o Nome do seu Arqueiro: ");
                    nome = scanner.next();
                    player = new Arqueiro(nome);
                    limpaChat();
                    System.out.println(player.name + " o Arqueiro foi Invocado!");
                    try {Thread.currentThread().sleep(3000);} catch (InterruptedException ex) {}
                    i = 1;
                } else {
                    System.out.println("Opção invalida! Tente outra Opção...");
                    try {Thread.currentThread().sleep(3000);} catch (InterruptedException ex) {}
                }
            }
            //Enemy Generator / Seleção aleatória de Monstro
            randonMonster = random.nextInt(1,3);

            if(randonMonster == 1) {
                monster = new Monstro("Ogro do Abismo", 10, 2.6, 0);
                System.out.println("Um " + monster.name + " surgiu, Prepare-se para Lutar!");
                try {Thread.currentThread().sleep(3000);} catch (InterruptedException ex) {}
            } else if (randonMonster == 2) {
                monster = new Monstro("Gnomo do Sexo",10,3.2,0);
                System.out.println("Um "+monster.name + " surgiu, Prepare-se para Lutar!");
                try {Thread.currentThread().sleep(3000);} catch (InterruptedException ex) {}
            }else {
                monster = new Monstro("Fada Safada",10,3.9,0);
                System.out.println("Um "+monster.name + " surgiu, Prepare-se para Lutar!");
                try {Thread.currentThread().sleep(3000);} catch (InterruptedException ex) {}
            }

            //Iniciando looping de batalha até que o Monstro ou o Player Morra
            while (isMonsterAlive && isPlayerAlive){
                //Menu de Decisões
                System.out.printf("\t- Menu de Combate -\n%s : %.2f HP\t\t%s : %.2f HP",player.name,player.healthPoints,monster.name,monster.healthPoints);
            }
        }
    }
    public static void limpaChat(){
        System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }
}

